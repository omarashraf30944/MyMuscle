package com.example.hti_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class ChestActivity extends AppCompatActivity {
    ArrayList<MusclesModel> moves = new ArrayList<>();
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        prepareIfNew();

        prepareChestMoves();

        recyclerView = findViewById(R.id.muscle_chest_rv);

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

    private void prepareChestMoves() {
        MusclesModel musclesModel = new MusclesModel("DumbBell press",20,20,"https://www.mensjournal.com/wp-content/uploads/mf/incline_dumbbell_press_pos_b_1.jpg");
        moves.add(musclesModel);
        MusclesModel musclesModel2 = new MusclesModel("Bench press",20,20,"https://www.mensjournal.com/wp-content/uploads/mf/_main2_benchpress_0.jpg");
        moves.add(musclesModel2);
        MusclesModel musclesModel3 = new MusclesModel("Cable CrossOver",20,20,"https://www.mensjournal.com/wp-content/uploads/mf/low-cable-crossover-2-exercise_potrait_step_image.jpg");
        moves.add(musclesModel3);
        MusclesModel musclesModel4 = new MusclesModel("Chest Fly",20,20,"https://s3.amazonaws.com/prod.skimble/assets/1477707/image_iphone.jpg");
        moves.add(musclesModel4);

    }


}