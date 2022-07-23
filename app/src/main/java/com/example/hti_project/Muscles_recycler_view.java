package com.example.hti_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Muscles_recycler_view extends AppCompatActivity {

    ArrayList <String> muscles = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscles_recycler_view);

        recyclerView = findViewById(R.id.recycler_view);

        for (int i = 0; i < 10; i++) {
            muscles.add("muscle: " + i);
        }




    }
}