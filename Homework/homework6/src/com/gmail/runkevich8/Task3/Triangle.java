package com.gmail.runkevich8.Task3;

public class Triangle extends Shape{
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getSqr() {
        return 0.5*a*b;
    }
}
