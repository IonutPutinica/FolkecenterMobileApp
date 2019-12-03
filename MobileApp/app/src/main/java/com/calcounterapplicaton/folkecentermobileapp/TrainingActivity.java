package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TrainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training);
    }

    public void openWebViewTraining(View view)
    {
        Intent trainingIntent=new Intent(this, TrainingActivityWebView.class);
        startActivity(trainingIntent);
    }


}
