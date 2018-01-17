package com.gmail.runkevich8.Task1;

public class DownloadThread extends Thread {

    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("download all files");

        synchronized (object) {
            object.notify();
        }
        try {
            synchronized (object) {
                object.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Save json");
        synchronized (object) {
            object.notify();
        }

        System.out.println("Save xml");

    }
}
