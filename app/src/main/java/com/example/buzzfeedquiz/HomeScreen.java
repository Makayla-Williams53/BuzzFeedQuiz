package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    int selection = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/home.html");
    }

    public void select(View view)
    {
        Button button1 = findViewById(R.id.colorOpt);
        Button button2 = findViewById(R.id.musicOpt);
        Button button3 = findViewById(R.id.movieOpt);

        button1.setBackgroundColor(Color.parseColor("#76E5FC"));
        button2.setBackgroundColor(Color.parseColor("#76E5FC"));
        button3.setBackgroundColor(Color.parseColor("#76E5FC"));

        int id = view.getId();
        Button button = findViewById(id);
        button.setBackgroundColor(Color.parseColor("#4BC0D9"));

        if(button == button1)
        {
            selection = 1;
        }//end if
        else if(button == button2)
        {
            selection = 2;
        }//end else if
        else if(button == button3)
        {
            selection = 3;
        }//end second else if

        Log.i("info", "Selection: " + selection);
    }//end select

    public void start(View view)
    {
    }
}