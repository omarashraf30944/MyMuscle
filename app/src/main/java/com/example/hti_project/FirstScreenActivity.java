package com.example.hti_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void startApp(View view) {
        Intent intent = new Intent(FirstScreenActivity.this,MainActivity.class);
        startActivity(intent);
    }
}