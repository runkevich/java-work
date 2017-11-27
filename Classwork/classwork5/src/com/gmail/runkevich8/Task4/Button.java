package com.gmail.runkevich8.Task4;

import com.gmail.runkevich8.task4new.ButtonClick;

public class Button {

    private UI ui;

    //записываем в Button ссылку на Main, чтобы Button мог вызвать методы у Main
    public void setMain(UI  ui) {
        this.ui = ui;
    }
    // симулируем нажатие на кнопку - тестовый метод (в реальности он приватный)
    public void emulateClickOnButton(){

        if(ui != null) ui.onClick();

    }
}
