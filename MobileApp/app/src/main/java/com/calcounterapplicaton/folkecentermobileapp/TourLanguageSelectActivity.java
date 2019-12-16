package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TourLanguageSelectActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_language_select);
    }

    public void openEnglishSection(View v)
    {
        Intent intent= new Intent(this, GuidedTourActivity.class);
        startActivity(intent);
    }

    public void openDanishSection(View v)
    {
        Intent intent= new Intent(this, GuidedTourDkActivity.class);
        startActivity(intent);
    }

    public void openGermanSection(View v)
    {
        Intent intent= new Intent(this, GuidedTourDeActivity.class);
        startActivity(intent);
    }
}