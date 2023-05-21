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
    int answer7 = 0;
    int answer8 = 0;
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

    public void select7(View view)
    {
        Button button1 = findViewById(R.id.q7opt1);
        Button button2 = findViewById(R.id.q7opt2);
        Button button3 = findViewById(R.id.q7opt3);
        Button button4 = findViewById(R.id.q7opt4);
        Button button5 = findViewById(R.id.q7opt5);
        Button button6 = findViewById(R.id.q7opt6);

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
            answer7 = 1;
        }//end if
        else if(button == button2)
        {
            answer7 = 2;
        }//end first else if
        else if(button == button3)
        {
            answer7 = 3;
        }//end second else if
        else if(button == button4)
        {
            answer7 = 4;
        }//end third else if
        else if(button == button5)
        {
            answer7 = 5;
        }//end fourth else if
        else if(button == button6)
        {
            answer7 = 6;
        }//end last else if
    }//end select7

    public void select8(View view)
    {
        Button button1 = findViewById(R.id.q8opt1);
        Button button2 = findViewById(R.id.q8opt2);
        Button button3 = findViewById(R.id.q8opt3);
        Button button4 = findViewById(R.id.q8opt4);
        Button button5 = findViewById(R.id.q8opt5);
        Button button6 = findViewById(R.id.q8opt6);

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
            answer8 = 1;
        }//end if
        else if(button == button2)
        {
            answer8 = 2;
        }//end first else if
        else if(button == button3)
        {
            answer8 = 3;
        }//end second else if
        else if(button == button4)
        {
            answer8 = 4;
        }//end third else if
        else if(button == button5)
        {
            answer8 = 5;
        }//end fourth else if
        else if(button == button6)
        {
            answer8 = 6;
        }//end last else if
    }//end select8

    public void analyze(View view)
    {
        Queue<Integer> answers = new LinkedList<>();
        if(answer1 == 0 || answer2 == 0 || answer3 == 0 || answer4 == 0 || answer5 == 0 || answer6 == 0 || answer7 == 0 || answer8 == 0)
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
            }//end if
            answers.add(temp5);
            int temp6 = ((answer6 - 2) + 6) % 6;
            if(temp6 == 0)
            {
                temp6 = 6;
            }//end if
            answers.add(temp6);
            int temp7 = ((answer7 - 1) + 6) % 6;
            if(temp7 == 0)
            {
                temp7 = 6;
            }//end if
            answers.add(temp7);
            answers.add(answer8);
        }//end else

        Intent intent = new Intent(MusicQuiz.this, MusicResults.class);
        intent.putExtra("results", results(answers));
        startActivity(intent);
    }//end analyze

    public int results(Queue<Integer> queue)
    {
        int size = queue.size();
        int most;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        for(int i = 0; i < size; i++)
        {
            if(queue.element() == 1)
            {
                count1++;
            }//end if
            else if(queue.element() == 2)
            {
                count2++;
            }//end else if
            else if(queue.element() == 3)
            {
                count3++;
            }//end second else if
            else if(queue.element() == 4)
            {
                count4++;
            }//end third else if
            else if(queue.element() == 5)
            {
                count5++;
            }//end forth else if
            else if(queue.element() == 6)
            {
                count6++;
            }//end fifth else if

            queue.remove();
        }//end for loop

        LinkedList<Integer> values = new LinkedList<>();
        values.add(count1);
        values.add(count2);
        values.add(count3);
        values.add(count4);
        values.add(count5);
        values.add(count6);

        int max = values.get(0);
        for(int i = 0; i < values.size(); i++)
        {
            if(values.get(i) > max)
            {
                max = values.get(i);
            }//end if
        }//end for

        most = values.indexOf(max) + 1;
        return most;
    }//end results

}//end MusicQuiz