package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class ColorResults extends AppCompatActivity
{
    int color;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_results);

        WebView webView = findViewById(R.id.titleWeb);
        webView.loadUrl("file:///android_asset/results.html");

        Bundle extras = getIntent().getExtras();
        color = extras.getInt("results");

        TextView resultView = findViewById(R.id.resultsView);

        if(color == 1)
        {
            resultView.setText("Your Personality is: Red!!!");
        }//end if
        else if(color == 2)
        {
            resultView.setText("Your Personality is: Orange!!!");
        }//end first else if
        else if(color == 3)
        {
            resultView.setText("Your Personality is: Yellow!!!");
        }//end second else if
        else if(color == 4)
        {
            resultView.setText("Your Personality is: Green!!!");
        }//end third else if
        else if(color == 5)
        {
            resultView.setText("Your Personality is: Blue!!!");
        }//end fourth else if
        else if(color == 6)
        {
            resultView.setText("Your Personality is: Purple!!!");
        }//end fifth else if
    }//end onCreate

    public void retake(View view)
    {
        Intent intent = new Intent(ColorResults.this, HomeScreen.class);
        startActivity(intent);
    }//end retake

}//end colorResults