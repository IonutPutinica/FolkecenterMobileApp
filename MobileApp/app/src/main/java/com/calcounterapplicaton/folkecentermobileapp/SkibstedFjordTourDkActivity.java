package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class SkibstedFjordTourDkActivity extends AppCompatActivity {

    MediaPlayer skibsted_fjord_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_skibstedfjord);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(skibsted_fjord_player==null)
        {
            skibsted_fjord_player=MediaPlayer.create(this, R.raw.song);
            skibsted_fjord_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        skibsted_fjord_player.start();
    }

    public void pause(View v)
    {
        if(skibsted_fjord_player!=null)
        {
            skibsted_fjord_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(skibsted_fjord_player!=null)
        {
            skibsted_fjord_player.release();
            skibsted_fjord_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

