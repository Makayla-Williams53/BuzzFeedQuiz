package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MusicQuiz extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_quiz);

        WebView webView = (WebView) findViewById(R.id.titleWeb);
        webView.loadUrl("file:///android_asset/quiz.html");
    }
}