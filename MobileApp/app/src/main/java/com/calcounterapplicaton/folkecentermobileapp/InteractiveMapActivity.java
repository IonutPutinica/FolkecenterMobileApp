package com.calcounterapplicaton.folkecentermobileapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.calcounterapplicaton.folkecentermobileapp.R;

public class InteractiveMapActivity extends Activity {
    private WebView mWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upcoming_events);

        mWebView=findViewById(R.id.activity_main_webview);

        //Force links and redirects to open in the WebView instead of in a browser

        mWebView.setWebViewClient(new WebViewClient());

        //Enable Javascript

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Remote Resource
        mWebView.loadUrl("http://www.folkecenter.eu/pages/Virtual-tour-Folkecenter.html");
        mWebView.setWebViewClient(new WebViewClient());
    }

    //prevent the back-button from closing the application
    @Override
    public void onBackPressed()
    {
        if(mWebView.canGoBack())
        {
            mWebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

}