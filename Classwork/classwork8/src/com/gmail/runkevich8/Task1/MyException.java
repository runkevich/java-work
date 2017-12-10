package com.gmail.runkevich8.Task1;

public class MyException extends  Exception{

    private String russionMessage;

    public MyException(String russionMessage){
        this.russionMessage = russionMessage;
    }

    public String getRussionMessage() {
        return russionMessage;
    }
}
