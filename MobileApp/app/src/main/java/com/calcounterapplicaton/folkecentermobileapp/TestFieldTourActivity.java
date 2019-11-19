package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class TestFieldTourActivity extends AppCompatActivity {

    MediaPlayer test_field_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_test_field);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(test_field_player==null)
        {
            test_field_player=MediaPlayer.create(this, R.raw.song);
            test_field_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        test_field_player.start();
    }

    public void pause(View v)
    {
        if(test_field_player!=null)
        {
            test_field_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(test_field_player!=null)
        {
            test_field_player.release();
            test_field_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

