package com.gmail.runkevich8.Task1;

public class Manager implements Runnable {

    private String a;

    private static Manager instance;// = new Manager();

    private Manager(){

    }

    public static Manager getInstance(){
        if (instance == null){          //delete
            instance = new Manager();   //delete
        }                               //delete
        return instance;

    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public void run() {

    }
}
