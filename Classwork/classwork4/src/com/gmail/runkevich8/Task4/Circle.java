package com.gmail.runkevich8.Task4;

public class Circle extends Shape{

    private double Radius;

    public Circle(int Radius) {
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    @Override
    public double getSqr() {
        return 2*3*Radius;
    }
}
