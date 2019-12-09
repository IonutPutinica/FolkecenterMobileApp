package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TipsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sustainable_tips);
    }

    public void openTip2(View v)
    {
        Intent intent= new Intent(this, Tip2Activity.class);
        startActivity(intent);
    }


}
