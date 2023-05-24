package com.example.buzzfeedquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.Queue;

public class MovieQuiz extends AppCompatActivity {

    int answer1 = 0;
    int answer2 = 0;
    int answer3 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_quiz);

        WebView webView = findViewById(R.id.titleWeb);
        webView.loadUrl("file:///android_asset/movieQuiz.html");
    }//end onCreate

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
    }//end select1

    public void select2(View view)
    {
        Button button1 = findViewById(R.id.q2opt1);
        Button button2 = findViewById(R.id.q2opt2);
        Button button3 = findViewById(R.id.q2opt3);
        Button button4 = findViewById(R.id.q2opt4);
        Button button5 = findViewById(R.id.q2opt5);
        Button button6 = findViewById(R.id.q2opt6);

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
            answer2 = 1;
        }//end if
        else if(button == button2)
        {
            answer2 = 2;
        }//end first else if
        else if(button == button3)
        {
            answer2 = 3;
        }//end second else if
        else if(button == button4)
        {
            answer2 = 4;
        }//end third else if
        else if(button == button5)
        {
            answer2 = 5;
        }//end fourth else if
        else if(button == button6)
        {
            answer2 = 6;
        }//end last else if
    }//end select1

    public void select3(View view)
    {
        Button button1 = findViewById(R.id.q3opt1);
        Button button2 = findViewById(R.id.q3opt2);
        Button button3 = findViewById(R.id.q3opt3);
        Button button4 = findViewById(R.id.q3opt4);
        Button button5 = findViewById(R.id.q3opt5);
        Button button6 = findViewById(R.id.q3opt6);

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
            answer3 = 1;
        }//end if
        else if(button == button2)
        {
            answer3 = 2;
        }//end first else if
        else if(button == button3)
        {
            answer3 = 3;
        }//end second else if
        else if(button == button4)
        {
            answer3 = 4;
        }//end third else if
        else if(button == button5)
        {
            answer3 = 5;
        }//end fourth else if
        else if(button == button6)
        {
            answer3 = 6;
        }//end last else if
    }//end select1

    public void analyze(View view)
    {
        Queue<Integer> answers = new LinkedList<>();
        if(answer1 == 0 || answer2 == 0 || answer3 == 0)
        {
            Toast.makeText(this, "Please answer all the questions!", Toast.LENGTH_SHORT).show();
        }//end if
        else
        {
            answers.add(answer1);
            int temp2 = ((answer2 - 5) + 6) % 6;
            if(temp2 == 0)
            {
                temp2 = 6;
            }//end if
            answers.add(temp2);
            int temp3 = ((answer3 - 4) + 6) % 6;
            if(temp3 == 0)
            {
                temp3 = 6;
            }//end if
            answers.add(temp3);
            Log.i("info", "Answer3: " + temp3);
        }//end else
    }//end analyze

}//end MovieQuiz