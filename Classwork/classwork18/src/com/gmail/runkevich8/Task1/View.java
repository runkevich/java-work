package com.gmail.runkevich8.Task1;

public class View {

    public void main(String[] args) { // static

        View view = new View();
        view.startUI();

    }

    private Controller controller;

    public  View(){

        controller = new Controller(this);

    }

    private void startUI(){

        System.out.println("Что ты хочешь?");
      //....any QA
        System.out.println(controller.getHello());
    }

    public  void showMessage(String message){
        System.out.println("Ошибка:" + message);
    }

}
