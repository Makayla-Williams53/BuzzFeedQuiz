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

        if(movie == 1)
        {
            resultView.setText("The Movie I'd Play For You is: 5 Feet Apart!!!");
        }//end if
        else if(movie == 2)
        {
            resultView.setText("The Movie I'd Play For You is: Batman The Dark Knight Rises!!!");
        }//end first else if
        else if(movie == 3)
        {
            resultView.setText("The Movie I'd Play For You is: Sky High!!!");
        }//end second else if
        else if(movie == 4)
        {
            resultView.setText("The Movie I'd Play For You is: Aliens in the Attic!!!");
        }//end third else if
        else if(movie == 5)
        {
            resultView.setText("The Movie I'd Play For You is: Princess and the Frog!!!");
        }//end fourth else if
        else if(movie == 6)
        {
            resultView.setText("The Movie I'd Play For You is: Perks of Being a Wallflower!!!");
        }//end fifth else if
    }//end onCreate

    public void retake(View view)
    {
        Intent intent = new Intent(MovieResults.this, HomeScreen.class);
        startActivity(intent);
    }//end retake
}