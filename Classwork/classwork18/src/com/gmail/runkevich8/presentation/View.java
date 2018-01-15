package com.gmail.runkevich8.presentation;

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
        //пользователь хочет снять деньги
       controller.getMoney();
    }

    //этот метод будет вызывать контоллер,чтобы
    //показать пользователю ответ на запрос о снятии денег
    public void showGetMoneyResult(boolean ok){
        if (ok){
            System.out.println("Деньги сняты");
        }else {
            System.out.println("Ошибка снятия");
        }

    }

    public  void showMessage(String message){
        System.out.println("Ошибка:" + message);
    }

}
