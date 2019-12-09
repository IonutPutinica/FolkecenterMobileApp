package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tip2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip2);
    }

    public void backToMainTips(View v)
    {
        Intent intent= new Intent(this, TipsActivity.class);
        startActivity(intent);
    }

    public void OpenTip3(View v)
    {
        Intent intent= new Intent(this, Tip3Activity.class);
        startActivity(intent);
    }
}

