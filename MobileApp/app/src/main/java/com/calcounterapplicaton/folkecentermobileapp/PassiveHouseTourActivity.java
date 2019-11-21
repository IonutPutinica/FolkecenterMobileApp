package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class PassiveHouseTourActivity extends AppCompatActivity {

    MediaPlayer passive_house_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_passive_house);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(passive_house_player==null)
        {
            passive_house_player=MediaPlayer.create(this, R.raw.song);
            passive_house_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        passive_house_player.start();
    }

    public void pause(View v)
    {
        if(passive_house_player!=null)
        {
            passive_house_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(passive_house_player!=null)
        {
            passive_house_player.release();
            passive_house_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

