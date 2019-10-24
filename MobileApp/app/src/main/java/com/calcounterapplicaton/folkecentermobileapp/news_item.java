package com.calcounterapplicaton.folkecentermobileapp;

public class news_item {

    int background;
    String newsTitle;
    String newsDate;

    public news_item() {

    }

    public news_item(int background, String newsTitle, String newsDate)
    {
        this.background=background;
        this.newsTitle=newsTitle;
        this.newsDate=newsDate;
    }

    public int getBackground()
    {
        return background;
    }

    public String getNewsTitle()
    {
        return newsTitle;
    }

    public String getNewsDate()
    {
        return newsDate;
    }

    public void setBackground(int background)

    {
        this.background=background;
    }

    public void setNewsTitle(String newsTitle)
    {
        this.newsTitle=newsTitle;
    }

    public void setNewsDate(String newsDate)

    {
        this.newsDate=newsDate;
    }

}
