package com.gmail.runkevich8.Task4;

public class Triangle extends Shape{

    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

//    public Triangle(int a, int b) {
//        this.a = a;
//        this.b = b;
//        setSquare(0.5*a*b);
//    }
//
//    public double getA() {
//        return a;
//    }
//
//    public void setA(double a) {
//        this.a = a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public void setB(double b) {
//        this.b = b;
//    }

    @Override
    public double getSqr() {
        return 0.5*a*b;
    }
}
