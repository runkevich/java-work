package com.gmail.runkevich8.Task2;

public class Sofa implements Furniture {


    public Sofa(String name, double s) {
        this.name = name;
        this.s = s;
    }

    private String name;
    private double s;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getS() {
        return s;
    }
}
