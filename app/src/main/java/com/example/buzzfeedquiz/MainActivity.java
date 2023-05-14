package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TableLayout;

import java.util.LinkedList;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {

    public int answer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.titleWeb);
        webView.loadUrl("file:///android_asset/quiz.html");
    }

    public void select1(View view)
    {
        Button button1 = findViewById(R.id.q1opt1);
        Button button2 = findViewById(R.id.q1opt2);
        Button button3 = findViewById(R.id.q1opt3);
        Button button4 = findViewById(R.id.q1opt4);
        Button button5 = findViewById(R.id.q1opt5);
        Button button6 = findViewById(R.id.q1opt6);

        button1.setBackgroundColor(Color.parseColor("#76E5FC"));
        button2.setBackgroundColor(Color.parseColor("#76E5FC"));
        button3.setBackgroundColor(Color.parseColor("#76E5FC"));
        button4.setBackgroundColor(Color.parseColor("#76E5FC"));
        button5.setBackgroundColor(Color.parseColor("#76E5FC"));
        button6.setBackgroundColor(Color.parseColor("#76E5FC"));

        int id = view.getId();
        Button button = findViewById(id);
        button.setBackgroundColor(Color.parseColor("#4BC0D9"));
        if(button == button1)
        {
            answer1 = 1;
        }//end if
        else if(button == button2)
        {
            answer1 = 2;
        }//end first else if
        else if(button == button3)
        {
            answer1 = 3;
        }//end second else if
        else if(button == button4)
        {
            answer1 = 4;
        }//end third else if
        else if(button == button5)
        {
            answer1 = 5;
        }//end fourth else if
        else if(button == button6)
        {
            answer1 = 6;
        }//end last else if
    }
}