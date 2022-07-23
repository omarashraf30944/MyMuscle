package com.example.hti_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class BackActivity extends AppCompatActivity {
    ArrayList<MusclesModel> moves = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        prepareIfNew();

        prepareBackMoves();

        recyclerView = findViewById(R.id.muscle_back_rv);

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

    private void prepareBackMoves() {
        MusclesModel musclesModel = new MusclesModel("rowing",20,20,"https://www.verywellfit.com/thmb/mGmyxyyyHZjU5IddnygcIVeOUuM=/2324x1504/filters:no_upscale():ma" +
                "x_bytes(150000):strip_icc():format(webp)/87395192-56aa07b65f9b58b7d0008802.jpg");
        moves.add(musclesModel);
        MusclesModel musclesModel2 = new MusclesModel("Bar bent row",20,20,"https://www.bodybuilding.com/images/2021/march/bent-over-row-header-830x467.jpg");
        moves.add(musclesModel2);
        MusclesModel musclesModel3 = new MusclesModel("T Bar bent row",20,20,"https://www.bodybuilding.com/images/2021/march/t-bar-row-header-830x467.jpg");
        moves.add(musclesModel3);
        MusclesModel musclesModel4 = new MusclesModel("Lat pull Down",20,20,"https://thumbs.dreamstime.com/z/exercising-reverse-grip-lat-pulldown-bodybuilding-target-muscles-marked-red-68612577.jpg");
        moves.add(musclesModel4);
    }
}