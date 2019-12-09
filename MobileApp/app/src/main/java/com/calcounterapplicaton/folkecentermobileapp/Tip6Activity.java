package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip6);
    }

    public void BackToTip5(View v)
    {
        Intent intent= new Intent(this, Tip5Activity.class);
        startActivity(intent);
    }

    public void OpenTip7(View v)
    {
        Intent intent= new Intent(this, Tip7Activity.class);
        startActivity(intent);
    }
}

