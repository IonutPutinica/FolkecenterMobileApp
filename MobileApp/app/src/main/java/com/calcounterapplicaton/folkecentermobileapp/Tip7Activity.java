package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip7);
    }

    public void BackToTip6(View v)
    {
        Intent intent= new Intent(this, Tip6Activity.class);
        startActivity(intent);
    }

    public void OpenTip8(View v)
    {
        Intent intent= new Intent(this, Tip8Activity.class);
        startActivity(intent);
    }
}

