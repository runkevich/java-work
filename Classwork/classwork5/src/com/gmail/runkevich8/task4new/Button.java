package com.gmail.runkevich8.task4new;

public class Button {

    private ButtonClick ui;

    //записываем в Button ссылку на Main, чтобы Button мог вызвать методы у Main
    public void setUi(ButtonClick ui) {
        this.ui = ui;
    }
    // симулируем нажатие на кнопку - тестовый метод (в реальности он приватный)
    public void emulateClickOnButton(){

        if(ui != null) ui.onClick();

    }
}
