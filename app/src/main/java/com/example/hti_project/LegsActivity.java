package com.example.hti_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class LegsActivity extends AppCompatActivity {
    ArrayList<MusclesModel> moves = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        prepareIfNew();

        prepareLegsMoves();

        recyclerView = findViewById(R.id.muscle_legs_rv);

        MusclesAdapter musclesAdapter = new MusclesAdapter(moves);

        recyclerView.setAdapter(musclesAdapter);
    }

    public void prepareIfNew() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int weights = intent.getIntExtra("weights",20);
        int repetitions = intent.getIntExtra("repetitions",20);
        String imageUrl = intent.getStringExtra("link");

        MusclesModel newMove = new MusclesModel(name,weights,repetitions,imageUrl);
        moves.add(newMove);
    }

    private void prepareLegsMoves() {
        MusclesModel musclesModel = new MusclesModel("squat",20,20,"https://kashish4u.files.wordpress.com/2011/10/squat1.jpg");
        moves.add(musclesModel);
        MusclesModel musclesModel2 = new MusclesModel("Bulgarian Squat",20,20,"https://www.mensjournal.com/wp-content/uploads/mf/_main_bulgariansplitsquat.jpg");
        moves.add(musclesModel2);
        MusclesModel musclesModel3 = new MusclesModel("Leg Press",20,20,"https://www.mensjournal.com/wp-content/uploads/mf/_main_legpress.jpg");
        moves.add(musclesModel3);
        MusclesModel musclesModel4 = new MusclesModel("Calf Raises",20,20,"https://www.mensjournal.com/wp-content/uploads/mf/barbell_calf_raise-the-30-best-legs-exercises-of-all-time.jpg");
        moves.add(musclesModel4);
    }



}