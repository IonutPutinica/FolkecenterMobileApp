package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class PlantOilLabTourActivity extends AppCompatActivity {

    MediaPlayer plant_oil_lab_player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_plant_oil_lab);
    }

    //the media player will be created in the play method, being a resource hungry feature, so that it is not created whenever the class is called
    public void play(View v)
    {
        if(plant_oil_lab_player==null)
        {
            plant_oil_lab_player=MediaPlayer.create(this, R.raw.oillab);
            plant_oil_lab_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                }
            });
        }
        plant_oil_lab_player.start();
    }

    public void pause(View v)
    {
        if(plant_oil_lab_player!=null)
        {
            plant_oil_lab_player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    public void stopPlayer()
    {
        if(plant_oil_lab_player!=null)
        {
            plant_oil_lab_player.release();
            plant_oil_lab_player=null;
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}

