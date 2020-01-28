package com.calcounterapplicaton.folkecentermobileapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.calcounterapplicaton.folkecentermobileapp.R;

public class TrainingActivityWebView extends Activity {
    private WebView trainingWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_webview);

        trainingWebView=findViewById(R.id.training_activity_main_webview);

        //Force links and redirects to open in the WebView instead of in a browser

        trainingWebView.setWebViewClient(new WebViewClient());

        //Enable Javascript

        WebSettings webSettings = trainingWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Remote Resource
        trainingWebView.loadUrl("http://www.folkecenter.eu/pages/Renewable-energy-training-information.html");
        trainingWebView.setWebViewClient(new WebViewClient());
    }

    //prevent the back-button from closing the application
    @Override
    public void onBackPressed()
    {
        if(trainingWebView.canGoBack())
        {
            trainingWebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

}