package com.gmail.runkevich8.TaskControl;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Manager manager = new Manager();
        manager.loadData(args[0]);
    }
}
