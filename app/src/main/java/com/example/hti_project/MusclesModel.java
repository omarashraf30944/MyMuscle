package com.example.hti_project;

import java.io.Serializable;

public class MusclesModel implements Serializable {
    public String name;
    public int weight;
    public int repetitions;
    public String imageURL;

    public MusclesModel(String name, int weight, int repetitions, String imageURL) {
        this.name = name;
        this.weight = weight;
        this.repetitions = repetitions;
        this.imageURL = imageURL;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
