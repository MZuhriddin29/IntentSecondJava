package com.example.intentsecondjava;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intentsecondjava.model.Student;

public class SecondActivity extends AppCompatActivity {
    static final String  TAG = SecondActivity.class.toString();
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    public void initView() {
        TextView tv_second = findViewById(R.id.tv_second);
        Student student = (Student) getIntent().getSerializableExtra("zzzz");


        Log.d(TAG,student.toString());
        tv_second.setText(student.toString());
    }
}
