package com.gmail.runkevich8.Task1;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++){
                    main.print10();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 10; i++){
                 main.print10();
                }
            }
        });

        thread1.start();
        thread2.start();

    }

    public synchronized void print10(){

        System.out.print(Thread.currentThread().getName()+":");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println("");
            }
        }
    }
}

