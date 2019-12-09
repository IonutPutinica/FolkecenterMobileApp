package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip9);
    }

    public void BackToTip8(View v)
    {
        Intent intent= new Intent(this, Tip8Activity.class);
        startActivity(intent);
    }

    public void OpenTip10(View v)
    {
        Intent intent= new Intent(this, Tip10Activity.class);
        startActivity(intent);
    }
}

