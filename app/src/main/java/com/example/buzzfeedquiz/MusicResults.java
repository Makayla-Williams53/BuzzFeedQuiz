package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class MusicResults extends AppCompatActivity {

    int music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_results);

        WebView webView = findViewById(R.id.titleWeb);
        webView.loadUrl("file:///android_asset/musicResults.html");

        Bundle extras = getIntent().getExtras();
        music = extras.getInt("results");

        TextView resultView = findViewById(R.id.resultsView);

        if(music == 1)
        {
            resultView.setText("The Music I'd Play For You is: Saint Motel!!!");
        }//end if
        else if(music == 2)
        {
            resultView.setText("The Music I'd Play For You is: A Day to Remember!!!");
        }//end first else if
        else if(music == 3)
        {
            resultView.setText("The Music I'd Play For You is: Alicia Keys!!!");
        }//end second else if
        else if(music == 4)
        {
            resultView.setText("The Music I'd Play For You is: Illinium!!!");
        }//end third else if
        else if(music == 5)
        {
            resultView.setText("The Music I'd Play For You is: Friday Pilots Club!!!");
        }//end fourth else if
        else if(music == 6)
        {
            resultView.setText("The Music I'd Play For You is: Issac Dunbar!!!");
        }//end fifth else if
    }//end onCreate

    public void retake(View view)
    {
        Intent intent = new Intent(MusicResults.this, HomeScreen.class);
        startActivity(intent);
    }//end retake

}//end MusicResults