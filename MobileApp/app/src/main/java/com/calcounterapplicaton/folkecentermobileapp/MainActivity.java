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
    private CardView cardViewTraining;
    private CardView cardViewTips;
    private CardView cardViewHistory;
    private CardView cardViewMap;

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

        cardViewTraining=findViewById(R.id.training_card_view);
        cardViewTraining.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openTrainingActivity();
            }
        });

        cardViewTips=findViewById(R.id.tips_card_view);
        cardViewTips.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openTipsActivity();
            }
        });

        cardViewHistory=findViewById(R.id.history_folkecenter_cardview);
        cardViewHistory.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openHistoryActivity();
            }
        });

        cardViewMap=findViewById(R.id.interactive_map_card_view);
        cardViewMap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openInteractiveMapActivity();
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
        Intent intent=new Intent(this, TourLanguageSelectActivity.class);
        startActivity(intent);
    }

    public void openQuizGameAcitivty()
    {
        Intent intent=new Intent(this, QuizGameActivity.class);
        startActivity(intent);
    }

    public void openTrainingActivity()
    {
        Intent intent=new Intent(this, TrainingActivity.class);
        startActivity(intent);
    }

    public void openTipsActivity()
    {
        Intent intent=new Intent(this, TipsActivity.class);
        startActivity(intent);
    }

    public void openHistoryActivity()
    {
        Intent intent=new Intent(this, HistoryFolkecenterActivity.class);
        startActivity(intent);
    }

    public void openInteractiveMapActivity()
    {
        Intent intent=new Intent(this, InteractiveMapActivity.class);
        startActivity(intent);
    }

}
