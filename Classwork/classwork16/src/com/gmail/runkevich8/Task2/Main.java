package com.gmail.runkevich8.Task2;

public class Main {

    private volatile String value;
    private static Object object = new Object();

    public static void main(String[] arg) {
    Main main = new Main();
        System.out.println("Start main");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                main.value = "jjjj";
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run(){
                main.value= main.value  + "eeee";
            }
        });

        thread1.start();
        thread2.start();

    }
    public void print10(){
        synchronized(object) {
            for (int i = 1; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                if (i % 10 == 0) {
                    System.out.println("");
                }
            }
        }
    }

}
