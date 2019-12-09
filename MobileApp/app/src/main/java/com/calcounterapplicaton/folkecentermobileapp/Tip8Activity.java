package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip8);
    }

    public void BackToTip7(View v)
    {
        Intent intent= new Intent(this, Tip7Activity.class);
        startActivity(intent);
    }

    public void OpenTip9(View v)
    {
        Intent intent= new Intent(this, Tip9Activity.class);
        startActivity(intent);
    }
}

