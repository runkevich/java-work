package com.gmail.runkevich8.Task1;

public class MyException1 extends Exception{

    private String russianMessage;

    public MyException1(String russianMessage) {
        this.russianMessage = russianMessage;
    }

    public String getRussianMessage() {
        return "Деление на ноль";
    }


}
