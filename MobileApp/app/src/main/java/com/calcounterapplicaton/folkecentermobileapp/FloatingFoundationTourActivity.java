package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class FloatingFoundationTourActivity extends AppCompatActivity {

    MediaPlayer floating_foundation_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_floating_foundation);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(floating_foundation_player==null)
        {
            floating_foundation_player=MediaPlayer.create(this, R.raw.floatingfoundation);
            floating_foundation_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        floating_foundation_player.start();
    }

    public void pause(View v)
    {
        if(floating_foundation_player!=null)
        {
            floating_foundation_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(floating_foundation_player!=null)
        {
            floating_foundation_player.release();
            floating_foundation_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

