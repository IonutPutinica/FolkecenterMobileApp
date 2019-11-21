package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class WorkshopTourActivity extends AppCompatActivity {

    MediaPlayer workshop_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_workshop);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(workshop_player==null)
        {
            workshop_player=MediaPlayer.create(this, R.raw.song);
            workshop_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        workshop_player.start();
    }

    public void pause(View v)
    {
        if(workshop_player!=null)
        {
            workshop_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(workshop_player!=null)
        {
            workshop_player.release();
            workshop_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

