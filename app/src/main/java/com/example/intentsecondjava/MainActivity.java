package com.example.intentsecondjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intentsecondjava.model.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        Button b_check = findViewById(R.id.b_check);
        b_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student(21 , "Zuhriddin");
                openSecondActivity(student);
            }
        });
    }

     void openSecondActivity(Student student) {
        Intent intent = new Intent( this , SecondActivity.class);
        intent.putExtra("zzzz" ,student);
        startActivity(intent);
    }
}