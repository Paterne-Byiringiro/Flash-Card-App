package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //User can tap a button to change the text color of the label.

        TextView question = findViewById(R.id.question);
        TextView answer = findViewById(R.id.answer);
        question.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                question.setVisibility(View.INVISIBLE);
                answer.setVisibility(View.VISIBLE);


            }


        });
        answer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                question.setVisibility(View.VISIBLE);
                answer.setVisibility(View.INVISIBLE);
            }


        });





            }
}