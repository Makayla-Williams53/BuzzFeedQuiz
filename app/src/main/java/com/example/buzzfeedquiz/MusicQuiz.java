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

public class MusicQuiz extends AppCompatActivity
{

    int answer1 = 0;
    int answer2 = 0;
    int answer3 = 0;
    int answer4 = 0;
    int answer5 = 0;
    int answer6 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_quiz);

        WebView webView = findViewById(R.id.titleWeb);
        webView.loadUrl("file:///android_asset/quiz.html");
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

        button1.setBackgroundColor(Color.parseColor("#76E5FC"));
        button2.setBackgroundColor(Color.parseColor("#76E5FC"));
        button3.setBackgroundColor(Color.parseColor("#76E5FC"));

        int id = view.getId();
        Button button = findViewById(id);
        button.setBackgroundColor(Color.parseColor("#4BC0D9"));

        if(button == button1)
        {
            answer2 = 6;
        }//end if
        else if(button == button2)
        {
            answer2 = 3;
        }//end else if
        else if(button == button3)
        {
            answer2 = 5;
        }//end second else if
    }//end select2

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
    }//end select3

    public void select4(View view)
    {
        Button button1 = findViewById(R.id.q4opt1);
        Button button2 = findViewById(R.id.q4opt2);
        Button button3 = findViewById(R.id.q4opt3);
        Button button4 = findViewById(R.id.q4opt4);
        Button button5 = findViewById(R.id.q4opt5);
        Button button6 = findViewById(R.id.q4opt6);

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
            answer4 = 1;
        }//end if
        else if(button == button2)
        {
            answer4 = 2;
        }//end first else if
        else if(button == button3)
        {
            answer4 = 3;
        }//end second else if
        else if(button == button4)
        {
            answer4 = 4;
        }//end third else if
        else if(button == button5)
        {
            answer4 = 5;
        }//end fourth else if
        else if(button == button6)
        {
            answer4 = 6;
        }//end last else if
    }//end select4

    public void select5(View view)
    {
        Button button1 = findViewById(R.id.q5opt1);
        Button button2 = findViewById(R.id.q5opt2);
        Button button3 = findViewById(R.id.q5opt3);
        Button button4 = findViewById(R.id.q5opt4);
        Button button5 = findViewById(R.id.q5opt5);
        Button button6 = findViewById(R.id.q5opt6);

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
            answer5 = 1;
        }//end if
        else if(button == button2)
        {
            answer5 = 2;
        }//end first else if
        else if(button == button3)
        {
            answer5 = 3;
        }//end second else if
        else if(button == button4)
        {
            answer5 = 4;
        }//end third else if
        else if(button == button5)
        {
            answer5 = 5;
        }//end fourth else if
        else if(button == button6)
        {
            answer5 = 6;
        }//end last else if
    }//end select5

    public void select6(View view)
    {
        Button button1 = findViewById(R.id.q6opt1);
        Button button2 = findViewById(R.id.q6opt2);
        Button button3 = findViewById(R.id.q6opt3);
        Button button4 = findViewById(R.id.q6opt4);
        Button button5 = findViewById(R.id.q6opt5);
        Button button6 = findViewById(R.id.q6opt6);

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
            answer6 = 1;
        }//end if
        else if(button == button2)
        {
            answer6 = 2;
        }//end first else if
        else if(button == button3)
        {
            answer6 = 3;
        }//end second else if
        else if(button == button4)
        {
            answer6 = 4;
        }//end third else if
        else if(button == button5)
        {
            answer6 = 5;
        }//end fourth else if
        else if(button == button6)
        {
            answer6 = 6;
        }//end last else if
    }//end select6

    public void analyze(View view)
    {
        Queue<Integer> answers = new LinkedList<>();
        if(answer1 == 0 || answer2 == 0 || answer3 == 0 || answer4 == 0 || answer5 == 0 || answer6 == 0)
        {
            Toast.makeText(this, "Please answer all the questions!", Toast.LENGTH_SHORT).show();
        }//end if
        else
        {
            answers.add(answer1);
            answers.add(answer2);
            int temp3 = ((answer3 - 5) + 6) % 6;
            if(temp3 == 0)
            {
                temp3 = 6;
            }//end if
            answers.add(temp3);
            int temp4 = ((answer4 - 4) + 6) % 6;
            if(temp4 == 0)
            {
                temp4 = 6;
            }//end if
            answers.add(temp4);
            int temp5 = ((answer5 - 3) + 6) % 6;
            if(temp5 == 0)
            {
                temp5 = 6;
            }
            answers.add(temp5);
            int temp6 = ((answer6 - 2) + 6) % 6;
            if(temp6 == 0)
            {
                temp6 = 6;
            }
            answers.add(temp6);
            Log.i("info", "Answer6: " + temp6);
        }//end else
    }//end analyze
}//end MusicQuiz