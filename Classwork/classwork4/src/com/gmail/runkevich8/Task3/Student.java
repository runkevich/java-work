package com.gmail.runkevich8.Task3;

public class Student extends People{

    private String studCardNumber;

    public String getStudCardNumber() {
        return studCardNumber;
    }

    public void setStudCardNumber(String studCardNumber) {
        this.studCardNumber = studCardNumber;
    }

    @Override
    public String getName() {

        //...
        return super.getName();// Переопределение метода!!!
    }
}
