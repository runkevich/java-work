package com.gmail.runkevich8.Task1;

public class Calculator {

    private double a, b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add(){
        return a + b;
    }

    public double unAdd(){
        return a - b;
    }

    public double multiplication(){
        return a * b;
    }

    public double division() throws MyException1 {
        if (b == 0) throw new MyException1("деление на 0");
        return a / b;
    }

}
