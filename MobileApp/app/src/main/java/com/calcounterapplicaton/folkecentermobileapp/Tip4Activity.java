package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip4);
    }

    public void BackToTip3(View v)
    {
        Intent intent= new Intent(this, Tip3Activity.class);
        startActivity(intent);
    }

    public void OpenTip5(View v)
    {
        Intent intent= new Intent(this, Tip5Activity.class);
        startActivity(intent);
    }
}

