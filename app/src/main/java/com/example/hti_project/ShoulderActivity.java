package com.example.hti_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShoulderActivity extends AppCompatActivity {
    ArrayList<MusclesModel> moves = new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);

        prepareIfNew();

        prepareShouldersMoves();

        recyclerView = findViewById(R.id.muscle_shoulder_rv);

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


    private void prepareShouldersMoves() {
        MusclesModel musclesModel = new MusclesModel("Lateral raises",20,20,"https://shoulderexercisesformass.files.wordpress.com/2015/08/dumbbell-lateral-raise.jpg");
        moves.add(musclesModel);
        MusclesModel musclesModel2 = new MusclesModel("DumbBell Press",20,20,"https://manofmany.com/wp-content/uploads/2019/03/10-Best-Shoulder-Exercises-for-Men-Seated-Dumbbell-Shoulder-Press.jpg");
        moves.add(musclesModel2);
        MusclesModel musclesModel3 = new MusclesModel("Shrugs",20,20,"https://manofmany.com/wp-content/uploads/2019/03/10-Best-Shoulder-Exercises-for-Men-Standing-barbell-shrugs.jpg");
        moves.add(musclesModel3);
        MusclesModel musclesModel4 = new MusclesModel("Rear Deltoid",20,20,"https://s3.amazonaws.com/prod.skimble/assets/1852429/image_iphone.jpg");
        moves.add(musclesModel4);
    }
}