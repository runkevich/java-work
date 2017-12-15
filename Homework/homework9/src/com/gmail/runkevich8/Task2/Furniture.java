package com.gmail.runkevich8.Task2;

public class Furniture {

    //площадь
    private double square;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Furniture(double square, String name) {
        this.square = square;
        this.name = name;
    }
}
