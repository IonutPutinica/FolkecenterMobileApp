package com.calcounterapplicaton.folkecentermobileapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context mContext;
    List<news_item> mData;


    public Adapter(Context mContext, List<news_item> mData)
    {
        this.mContext=mContext;
        this.mData=mData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater =LayoutInflater.from(mContext);
        View v=inflater.inflate(R.layout.recent_news,parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position)
    {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.tv_title.setText(mData.get(position).getNewsTitle());
        holder.tv_date.setText(mData.get(position).getNewsDate());
    }

    @Override
    public int getItemCount()
    {
        return mData.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView background_img;
        TextView tv_title, tv_date;



        public myViewHolder(View itemView) {
            super(itemView);
            background_img=itemView.findViewById(R.id.card_background);
            tv_title=itemView.findViewById(R.id.card_news_title);
            tv_date=itemView.findViewById(R.id.card_news_subtitle_date);
        }
    }


}
