package com.gmail.runkevich8.Task1;

public abstract class Technique {

    int cost;
    int size;
    String model;
    int color;

    public Technique(int cost, int size, String model, int color) {
        this.cost = cost;
        this.size = size;
        this.model = model;
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
