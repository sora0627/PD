package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class TestActivity extends AppCompatActivity {
    private String sample = "Sample_text";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView text = (TextView) findViewById(R.id.test_textView);
        text.setText(sample);
    }
}
