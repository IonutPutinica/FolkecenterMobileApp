package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class PlusHouseTourDeActivity extends AppCompatActivity {

    MediaPlayer plus_house_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_plus_house);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(plus_house_player==null)
        {
            plus_house_player=MediaPlayer.create(this, R.raw.song);
            plus_house_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        plus_house_player.start();
    }

    public void pause(View v)
    {
        if(plus_house_player!=null)
        {
            plus_house_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(plus_house_player!=null)
        {
            plus_house_player.release();
            plus_house_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

