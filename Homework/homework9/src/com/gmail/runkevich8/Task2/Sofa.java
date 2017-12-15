package com.gmail.runkevich8.Task2;

public class Sofa extends Furniture {

    public Sofa(double square, String name) {
        super(square, name);
    }
    private String name;
    private double square;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSquare() {
        return square;
    }

    @Override
    public void setSquare(double square) {
        this.square = square;
    }
}
