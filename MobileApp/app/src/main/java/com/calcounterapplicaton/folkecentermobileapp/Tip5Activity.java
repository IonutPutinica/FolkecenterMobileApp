package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip5);
    }

    public void BackToTip4(View v)
    {
        Intent intent= new Intent(this, Tip4Activity.class);
        startActivity(intent);
    }

    public void OpenTip6(View v)
    {
        Intent intent= new Intent(this, Tip6Activity.class);
        startActivity(intent);
    }
}

