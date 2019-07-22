package com.paulentine.android.lookmaapp;

public class Recipe {
    private int id;
    private String title;
    private int readyInMinutes;
    private int servings;

    public Recipe() {
        //empty constructor needed
    }

    public Recipe(int id, String title, int readyInMinutes, int servings) {
        this.id = id;
        this.title = title;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public int getServings() {
        return servings;
    }
}