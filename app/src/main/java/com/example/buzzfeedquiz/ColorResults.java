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
        TextView descView = findViewById(R.id.descView);

        if(color == 1)
        {
            resultView.setText(R.string.redResults);
            descView.setText(R.string.redDesc);
        }//end if
        else if(color == 2)
        {
            resultView.setText(R.string.orangeResults);
            descView.setText(R.string.orangeDesc);
        }//end first else if
        else if(color == 3)
        {
            resultView.setText(R.string.yellowResults);
            descView.setText(R.string.yellowDesc);
        }//end second else if
        else if(color == 4)
        {
            resultView.setText(R.string.greenResults);
            descView.setText(R.string.greenDesc);
        }//end third else if
        else if(color == 5)
        {
            resultView.setText(R.string.blueResults);
            descView.setText(R.string.blueDesc);
        }//end fourth else if
        else if(color == 6)
        {
            resultView.setText(R.string.purpleResults);
            descView.setText(R.string.purpleDesc);
        }//end fifth else if
    }//end onCreate

    public void retake(View view)
    {
        Intent intent = new Intent(ColorResults.this, HomeScreen.class);
        startActivity(intent);
    }//end retake

}//end colorResults