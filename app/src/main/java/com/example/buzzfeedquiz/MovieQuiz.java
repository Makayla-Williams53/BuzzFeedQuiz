package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MovieQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_quiz);

        WebView webView = findViewById(R.id.titleWeb);
        webView.loadUrl("file:///android_asset/movieQuiz.html");
    }
}