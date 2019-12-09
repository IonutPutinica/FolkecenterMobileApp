package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip3);
    }

    public void BackToTip2(View v)
    {
        Intent intent= new Intent(this, Tip2Activity.class);
        startActivity(intent);
    }

    public void OpenTip4(View v)
    {
        Intent intent= new Intent(this, Tip4Activity.class);
        startActivity(intent);
    }
}

