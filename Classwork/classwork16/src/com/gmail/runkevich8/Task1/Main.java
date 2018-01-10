package com.gmail.runkevich8.Task1;

public class Main {

    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        manager.setA("GGGGGGGgg");

        Manager manager2 = Manager.getInstance();
        System.out.println(manager2.getA());

        Thread thread = new Thread( manager);
        thread.start();
    }

}
