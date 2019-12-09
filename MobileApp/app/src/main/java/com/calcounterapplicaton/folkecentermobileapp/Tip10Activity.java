package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip10Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip10);
    }

    public void BackToTip9(View v)
    {
        Intent intent= new Intent(this, Tip9Activity.class);
        startActivity(intent);
    }

    public void OpenMainActivity(View v)
    {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

