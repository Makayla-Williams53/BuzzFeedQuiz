package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class MovieResults extends AppCompatActivity {

    int movie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_results);

        WebView webView = findViewById(R.id.titleWeb);
        webView.loadUrl("file:///android_asset/musicResults.html");

        Bundle extras = getIntent().getExtras();
        movie = extras.getInt("results");

        TextView resultView = findViewById(R.id.resultsView);
        TextView descView = findViewById(R.id.descView);

        if(movie == 1)
        {
            resultView.setText(R.string.feetResults);
            descView.setText(R.string.feetDesc);
        }//end if
        else if(movie == 2)
        {
            resultView.setText(R.string.darkResults);
            descView.setText(R.string.darkDesc);
        }//end first else if
        else if(movie == 3)
        {
            resultView.setText(R.string.skyResults);
            descView.setText(R.string.skyDesc);
        }//end second else if
        else if(movie == 4)
        {
            resultView.setText(R.string.aliensResults);
            descView.setText(R.string.aliensDesc);
        }//end third else if
        else if(movie == 5)
        {
            resultView.setText(R.string.frogResults);
            descView.setText(R.string.frogDesc);
        }//end fourth else if
        else if(movie == 6)
        {
            resultView.setText(R.string.wallflowerResults);
            descView.setText(R.string.wallflowerDesc);
        }//end fifth else if
    }//end onCreate

    public void retake(View view)
    {
        Intent intent = new Intent(MovieResults.this, HomeScreen.class);
        startActivity(intent);
    }//end retake
}