package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/home.html");
    }
}