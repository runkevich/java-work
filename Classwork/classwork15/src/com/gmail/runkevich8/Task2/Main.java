package com.gmail.runkevich8.Task2;

import com.gmail.runkevich8.Task1.Thread1;

public class Main {

    private static StringBuffer stringBuffer = new StringBuffer();
    private static StringBuilder stringBuilder=new StringBuilder();

    public static void main(String[] args) {
        System.out.println("Start main");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 10; i++){
                    stringBuilder.append(i);
                    try {

                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 10; i++){
                    stringBuffer.append(i);
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.setName("Potok1");
        thread1.start();
        thread2.start();

        thread2.setPriority(Thread.MAX_PRIORITY);// не гарантировано

        //живет дольше всех и всегда,пока не прервет main
       // thread2.setDaemon();
        System.out.println("End main");
    }

    //synchronized - большая пнроизводительность
    public synchronized static void openFile(){

        Thread.currentThread().getName();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
        }

    }

}
