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
        TextView descView = findViewById(R.id.descView);

        if(music == 1)
        {
            resultView.setText(R.string.saintResults);
            descView.setText(R.string.saintDesc);
        }//end if
        else if(music == 2)
        {
            resultView.setText(R.string.dayResults);
            descView.setText(R.string.dayDesc);
        }//end first else if
        else if(music == 3)
        {
            resultView.setText(R.string.aliciaResults);
            descView.setText(R.string.aliciaDesc);
        }//end second else if
        else if(music == 4)
        {
            resultView.setText(R.string.illiniumResults);
            descView.setText(R.string.illiniumDesc);
        }//end third else if
        else if(music == 5)
        {
            resultView.setText(R.string.fridayResults);
            descView.setText(R.string.fridayDesc);
        }//end fourth else if
        else if(music == 6)
        {
            resultView.setText(R.string.issacResults);
            descView.setText(R.string.issacDesc);
        }//end fifth else if
    }//end onCreate

    public void retake(View view)
    {
        Intent intent = new Intent(MusicResults.this, HomeScreen.class);
        startActivity(intent);
    }//end retake

}//end MusicResults