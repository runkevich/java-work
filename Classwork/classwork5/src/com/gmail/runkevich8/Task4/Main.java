package com.gmail.runkevich8.Task4;

public class Main {

    public static void main(String[] arg) {

        UI ui = new UI();//опустим в UI лежит логика работы с пользователем
        Button button = new Button();//оздали кнопку
        button.setMain(ui);//скинули ссылку на UI в  Button

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){}
        //симулируем нажатие на кнопку (в реальности этого не будет)
        button.emulateClickOnButton();
    }

    public void onClick() {
        // на кнопку нажали
        System.out.println("Click");
    }

}

