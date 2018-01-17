package com.gmail.runkevich8.Task1;


public class ParsingThread extends Thread {


    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        //спим и ждем пока на не разбудит downloadThread
        System.out.println("sleep parse");

        try {
            synchronized (object) {
                object.wait();
            }

        } catch (InterruptedException e) {
        }

        //wake up

        System.out.println("json parsing");
        //parse...................


        System.out.println("ping download from parsing");
        synchronized (object) {
            object.notify();
        }

        //а сами засыпаем пока нас не разбудит downloadThread
        System.out.println("wait parsing");


        try {
            synchronized (object) {
                // Thread.sleep(1000);
                object.wait();
            }
        } catch (InterruptedException e) {
        }


        System.out.println("xml parsing");
        //parse xml ..........

        System.out.println("end parsing");

    }
}
