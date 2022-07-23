package com.example.hti_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Chest(View view) {
        Intent intent = new Intent(MainActivity.this, ChestActivity.class);
        startActivity(intent);
    }

    public void Back(View view) {
        Intent intent = new Intent(MainActivity.this, BackActivity.class);
        startActivity(intent);
    }

    public void Shoulder(View view) {
        Intent intent = new Intent(MainActivity.this, ShoulderActivity.class);
        startActivity(intent);
    }

    public void Legs(View view) {
        Intent intent = new Intent(MainActivity.this, LegsActivity.class);
        startActivity(intent);
    }


    public void addMove(View view) {
        EditText editTexMuscle,editTextWeight,editTextRepetitions,editTextName,editTextLink;
        editTexMuscle = findViewById(R.id.muscle_et);
        editTextWeight = findViewById(R.id.weights_et);
        editTextRepetitions = findViewById(R.id.repetitions_et);
        editTextName = findViewById(R.id.name_et);
        editTextLink = findViewById(R.id.image_url_et);

        String muscle = editTexMuscle.getText().toString();
        String weights = editTextWeight.getText().toString();
        String repetitions = editTextRepetitions.getText().toString();
        String name = editTextName.getText().toString();
        String link = editTextLink.getText().toString();

        if(muscle.equals("") || weights.equals("") || repetitions.equals("") ||name.equals("") || link.equals("")){
            Toast.makeText(this,"Name or Muscle or Weight or Reps or Link required",Toast.LENGTH_LONG).show();
            return;
        }

        if (muscle.equals("legs")) {
            Intent intent = new Intent(MainActivity.this, LegsActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("weights", weights);
            intent.putExtra("repetitions", repetitions);
            intent.putExtra("link", link);
            startActivity(intent);
        } else if (muscle.equals("chest")) {
            Intent intent = new Intent(MainActivity.this, ChestActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("weights", weights);
            intent.putExtra("repetitions", repetitions);
            intent.putExtra("link", link);
            startActivity(intent);
        } else if (muscle.equals("shoulder")) {
            Intent intent = new Intent(MainActivity.this, ShoulderActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("weights", weights);
            intent.putExtra("repetitions", repetitions);
            intent.putExtra("link", link);
            startActivity(intent);
        } else if (muscle.equals("back")) {
            Intent intent = new Intent(MainActivity.this, BackActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("weights", weights);
            intent.putExtra("repetitions", repetitions);
            intent.putExtra("link", link);
            startActivity(intent);
        } else {
            Toast.makeText(this, "invalid name", Toast.LENGTH_LONG).show();
            return;
        }




    }



}