package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class QuizGameActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_game);
    }



    public void openGameInstallation(View view)
    {
        Intent gameIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/IonutPutinica/FolkecenterGame"));
        startActivity(gameIntent);
    }



}

