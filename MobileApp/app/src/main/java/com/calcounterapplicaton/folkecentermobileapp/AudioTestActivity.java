package com.calcounterapplicaton.folkecentermobileapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AudioTestActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_test);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
    if(player==null)
    {
        player=MediaPlayer.create(this, R.raw.song);
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

            }
        });
    }
    player.start();
    }

    public void pause(View v)
    {
        if(player!=null)
        {
            player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
    if(player!=null)
    {
        player.release();
        player=null;
    }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}
