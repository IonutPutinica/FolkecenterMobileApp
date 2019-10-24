package com.calcounterapplicaton.folkecentermobileapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_news_page);

        //set the statue bar background to transparent

        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //setting up the recyclerView with the adapter

        RecyclerView recyclerView = findViewById(R.id.rv_list_news);
        List<news_item> mlist = new ArrayList<>();
        mlist.add(new news_item(R.drawable.img1, "Patoc", "23.12.2019"));
        mlist.add(new news_item(R.drawable.img2, "Sobolan", "23.12.2019"));
        mlist.add(new news_item(R.drawable.img3, "Cartita", "23.12.2019"));
        mlist.add(new news_item(R.drawable.img4, "Arici pogonici", "23.12.2019"));
        Adapter adapter=new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
