package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

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

        button1.setBackgroundColor(Color.parseColor("#E7C6FF"));
        button2.setBackgroundColor(Color.parseColor("#E7C6FF"));
        button3.setBackgroundColor(Color.parseColor("#E7C6FF"));

        int id = view.getId();
        Button button = findViewById(id);
        button.setBackgroundColor(Color.parseColor("#DAA7FF"));

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
    }//end select

    public void start(View view)
    {
        if(selection == 1)
        {
            Intent intent = new Intent(HomeScreen.this, ColorQuiz.class);
            startActivity(intent);
        }//end if
        else if(selection == 2)
        {
            Intent intent = new Intent(HomeScreen.this, MusicQuiz.class);
            startActivity(intent);
        }//end fist else if
        else if(selection == 3)
        {
            Intent intent = new Intent(HomeScreen.this, MovieQuiz.class);
            startActivity(intent);
        }//end second else if
        else
        {
            Toast.makeText(this, "Please select a quiz!", Toast.LENGTH_SHORT).show();
        }//end else
    }//end start
}//end HomeScreen