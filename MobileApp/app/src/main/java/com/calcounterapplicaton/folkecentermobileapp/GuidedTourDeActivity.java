package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class GuidedTourDeActivity extends AppCompatActivity {


    private CardView cardViewTestField;
    private CardView cardViewBiodome;
    private CardView cardViewCafeSolaire;
    private CardView cardViewWorkshop;
    private CardView cardViewPlusHouse;
    private CardView cardViewPassiveHouse;
    private CardView cardViewSkibstedFjord;
    private CardView cardViewWaterTreatment;
    private CardView cardViewPlantOilLab;
    private CardView cardViewWindMuseum;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //opening test_field activity
        setContentView(R.layout.guided_tour_page);

        cardViewTestField=findViewById(R.id.test_field_cardview);
        cardViewTestField.setOnClickListener(new View.OnClickListener()
                                             {
                                                 @Override
                                                 public void onClick(View v)
                                                 {
                                                     openTestFieldActivity();
                                                 }
                                             }

        );

        //opening the biodome activity
        cardViewBiodome=findViewById(R.id.biodome_cardview);
        cardViewBiodome.setOnClickListener(new View.OnClickListener()
                                           {
                                               @Override
                                               public void onClick(View v)
                                               {
                                                   openBiodomeActivity();
                                               }
                                           }

        );

        //opening the cafe solaire activity
        cardViewCafeSolaire=findViewById(R.id.cafe_solaire_card_view);
        cardViewCafeSolaire.setOnClickListener(new View.OnClickListener()
                                               {
                                                   @Override
                                                   public void onClick(View v)
                                                   {
                                                       openCafeSolaireActivity();
                                                   }
                                               }

        );

        //opening the workshop activity
        cardViewWorkshop=findViewById(R.id.workshop_card_view);
        cardViewWorkshop.setOnClickListener(new View.OnClickListener()
                                            {
                                                @Override
                                                public void onClick(View v)
                                                {
                                                    openWorkshopActivity();
                                                }
                                            }

        );


        //opening the plus_house activity
        cardViewPlusHouse=findViewById(R.id.plus_house_card_view);
        cardViewPlusHouse.setOnClickListener(new View.OnClickListener()
                                             {
                                                 @Override
                                                 public void onClick(View v)
                                                 {
                                                     openPlusHouseActivity();
                                                 }
                                             }

        );

        //opening the passive_house activity
        cardViewPassiveHouse=findViewById(R.id.passive_house_card_view);
        cardViewPassiveHouse.setOnClickListener(new View.OnClickListener()
                                                {
                                                    @Override
                                                    public void onClick(View v)
                                                    {
                                                        openPassiveHouseActivity();
                                                    }
                                                }

        );

        //opening the skibsted_fjord activity
        cardViewSkibstedFjord=findViewById(R.id.skibstedfjord_card_view);
        cardViewSkibstedFjord.setOnClickListener(new View.OnClickListener()
                                                 {
                                                     @Override
                                                     public void onClick(View v)
                                                     {
                                                         openSkibstedFjordActivity();
                                                     }
                                                 }

        );

        //opening the water_treatment activity
        cardViewWaterTreatment=findViewById(R.id.water_treatment_card_view);
        cardViewWaterTreatment.setOnClickListener(new View.OnClickListener()
                                                  {
                                                      @Override
                                                      public void onClick(View v)
                                                      {
                                                          openWaterTreatmentActivity();
                                                      }
                                                  }

        );

        //opening the plant_oil_lab activity
        cardViewPlantOilLab=findViewById(R.id.plant_oil_lab_card_view);
        cardViewPlantOilLab.setOnClickListener(new View.OnClickListener()
                                               {
                                                   @Override
                                                   public void onClick(View v)
                                                   {
                                                       openPlantOilLabActivity();
                                                   }
                                               }

        );

        //opening the wind_museum activity
        cardViewWindMuseum=findViewById(R.id.wind_museum_card_view);
        cardViewWindMuseum.setOnClickListener(new View.OnClickListener()
                                              {
                                                  @Override
                                                  public void onClick(View v)
                                                  {
                                                      openWindMuseumActivity();
                                                  }
                                              }

        );

    }

    //openTestFieldActivity() method that creates the intent that opens the test_field layout
    public void openTestFieldActivity()
    {
        Intent intent=new Intent(this, TestFieldTourActivity.class);
        startActivity(intent);
    }

    //openBiodomeActivity() method that created the intent that opens the biodome layout
    public void openBiodomeActivity()
    {
        Intent intent=new Intent(this, BiodomeTourActivity.class);
        startActivity(intent);
    }

    //openCafeSolaireActivity() method that created the intent that opens the cafe_solaire layout
    public void openCafeSolaireActivity()
    {
        Intent intent=new Intent(this, CafeSolaireTourActivity.class);
        startActivity(intent);
    }

    //openWorkshopActivity() method that created the intent that opens the workshop layout
    public void openWorkshopActivity()
    {
        Intent intent=new Intent(this, WorkshopTourActivity.class);
        startActivity(intent);
    }

    //openPlusHouseActivity() method that created the intent that opens the plus_house layout
    public void openPlusHouseActivity()
    {
        Intent intent=new Intent(this, PlusHouseTourActivity.class);
        startActivity(intent);
    }

    //openPassiveHouseActivity() method that created the intent that opens the passive_house layout
    public void openPassiveHouseActivity()
    {
        Intent intent=new Intent(this, PassiveHouseTourActivity.class);
        startActivity(intent);
    }

    //openSkibstedFjordActivity() method that created the intent that opens the skibstedFjord layout
    public void openSkibstedFjordActivity()
    {
        Intent intent=new Intent(this, SkibstedFjordTourActivity.class);
        startActivity(intent);
    }

    //openWaterTreatmentActivity() method that created the intent that opens the water_treatment layout
    public void openWaterTreatmentActivity()
    {
        Intent intent=new Intent(this, WaterTreatmentTourActivity.class);
        startActivity(intent);
    }

    //openPlantOilLabActivity() method that created the intent that opens the plant_oil_lab layout
    public void openPlantOilLabActivity()
    {
        Intent intent=new Intent(this, PlantOilLabTourActivity.class);
        startActivity(intent);
    }

    //openWindMuseumActivity() method that created the intent that opens the wind_museum layout
    public void openWindMuseumActivity()
    {
        Intent intent=new Intent(this, WindMuseumTourActivity.class);
        startActivity(intent);
    }


}
