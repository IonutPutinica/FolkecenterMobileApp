package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cardView;
    private CardView cardViewEvents;
    private CardView cardViewTour;
    private CardView cardViewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView=findViewById(R.id.main_news_cardview);
        cardView.setOnClickListener(new View.OnClickListener()
                                    {
                                        @Override
                                        public void onClick(View v)
                                        {
                                            openMainNewsActivity();
                                        }
                                    }

        );

        cardViewEvents=findViewById(R.id.upcoming_events_cardview);
        cardViewEvents.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openUpcomingEventsActivity();
            }
        });

        cardViewTour=findViewById(R.id.guided_tour_card_view);
        cardViewTour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openGuidedTourAcitivty();
            }
        });

        cardViewGame=findViewById(R.id.quiz_game_card_view);
        cardViewGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openQuizGameAcitivty();
            }
        });

    }

    public void openMainNewsActivity()
    {
        Intent intent=new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    public void openUpcomingEventsActivity()
    {
        Intent eventsIntent=new Intent(this, UpcomingEventsActivity.class);
        startActivity(eventsIntent);
    }

    public void openGuidedTourAcitivty()
    {
        Intent intent=new Intent(this, GuidedTourActivity.class);
        startActivity(intent);
    }

    public void openQuizGameAcitivty()
    {
        Intent intent=new Intent(this, QuizGameActivity.class);
        startActivity(intent);
    }


}
