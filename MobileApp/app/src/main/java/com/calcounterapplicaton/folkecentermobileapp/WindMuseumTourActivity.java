package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class WindMuseumTourActivity extends AppCompatActivity {

    MediaPlayer wind_museum_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_wind_museum);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(wind_museum_player==null)
        {
            wind_museum_player=MediaPlayer.create(this, R.raw.song);
            wind_museum_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        wind_museum_player.start();
    }

    public void pause(View v)
    {
        if(wind_museum_player!=null)
        {
            wind_museum_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(wind_museum_player!=null)
        {
            wind_museum_player.release();
            wind_museum_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

