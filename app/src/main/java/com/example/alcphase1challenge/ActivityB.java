package com.example.alcphase1challenge;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {

    WebView wv;

    private class HelloWebViewClient extends  WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            return false;
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_b);
        getSupportActionBar().setTitle("About ALC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("ALC 4 Phase 1");

        wv = findViewById(R.id.webview);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setUseWideViewPort(true);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.getSettings().setPluginState(WebSettings.PluginState.ON);
        //wv.getSettings().setPluginsEnabled(true);
        wv.setWebViewClient(new HelloWebViewClient());
        //wv.getSettings().setAllowFileAccess(true);
        wv.loadUrl("https://andela.com/alc/");

    }


    @Override
    public boolean onSupportNavigateUp() {
        Intent in = new Intent(ActivityB.this, MainActivity.class);
        startActivity(in);
        return true;
    }


}
