package com.example.hti_project;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.Image;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MusclesAdapter extends RecyclerView.Adapter<MusclesAdapter.MusclesHolder>  {

    public ArrayList<MusclesModel> muscles;

    public MusclesAdapter(ArrayList<MusclesModel> musclesModels) {
        this.muscles = musclesModels;
    }

    @NonNull
    @NotNull
    @Override
    public MusclesHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent, false);
        MusclesHolder musclesHolder = new MusclesHolder(view);
        return musclesHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MusclesAdapter.MusclesHolder holder, int position) {
        MusclesModel musclesModel = muscles.get(position);

        holder.textViewMuscleName.setText(musclesModel.getName());
        holder.textViewWeight.setText(musclesModel.getWeight() + "");
        holder.textViewRepetitions.setText(musclesModel.getRepetitions() + "");


        Picasso.get().load(musclesModel.getImageURL()).into(holder.imageViewMuscle);

    }

    @Override
    public int getItemCount() {
        return muscles.size();
    }


    class MusclesHolder extends RecyclerView.ViewHolder {
        ImageView imageViewMuscle;
        TextView textViewMuscleName;
        TextView textViewWeight;
        TextView textViewRepetitions;

        public MusclesHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            imageViewMuscle = itemView.findViewById(R.id.move_iv);
            textViewMuscleName = itemView.findViewById(R.id.move_name_tv);
            textViewWeight = itemView.findViewById(R.id.weight_tv);
            textViewRepetitions = itemView.findViewById(R.id.repetitions_tv);
        }
    }

}
