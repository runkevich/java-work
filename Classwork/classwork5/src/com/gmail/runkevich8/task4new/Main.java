package com.gmail.runkevich8.task4new;

public class Main {

    public static void main(String[] arg) {

        UI ui1 = new UI();//опустим в UI лежит логика работы с пользователем
        Button button = new Button();//оздали кнопку
        button.setUi(ui1);//скинули ссылку на UI в  Button

        UI2 ui2 = new UI2();
        Button button2 = new Button();
        button2.setUi(ui2);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){}
        //симулируем нажатие на кнопку (в реальности этого не будет)
        button.emulateClickOnButton();
    }

}

