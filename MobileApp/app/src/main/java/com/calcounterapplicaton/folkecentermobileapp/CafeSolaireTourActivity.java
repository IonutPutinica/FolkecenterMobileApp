package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class CafeSolaireTourActivity extends AppCompatActivity {

    MediaPlayer cafe_solaire_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_cafe_solaire);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(cafe_solaire_player==null)
        {
            cafe_solaire_player=MediaPlayer.create(this, R.raw.song);
            cafe_solaire_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        cafe_solaire_player.start();
    }

    public void pause(View v)
    {
        if(cafe_solaire_player!=null)
        {
            cafe_solaire_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(cafe_solaire_player!=null)
        {
            cafe_solaire_player.release();
            cafe_solaire_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

