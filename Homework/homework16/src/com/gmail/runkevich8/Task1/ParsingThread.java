package com.gmail.runkevich8.Task1;


public class ParsingThread extends Thread {

    private DownloadThread downloadThread;

    public void setDownloadThread(DownloadThread downloadThread) {
        this.downloadThread = downloadThread;
    }

    @Override
    public void run() {
        //спим и ждем пока на не разбудит downloadThread
        System.out.println("sleep parse");

        try {
            //wait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        //wake up

        System.out.println("json parsing");
        //parse...................


        System.out.println("ping download from parsing");
        synchronized (downloadThread){
            downloadThread.notify();
        }

        //а сами засыпаем пока нас не разбудит downloadThread
        System.out.println("wait parsing");
        try {
            Thread.sleep(1000);
           // wait();
        } catch (InterruptedException e) {
        }


        System.out.println("xml parsing");
        //parse xml ..........

        System.out.println("end parsing");

    }
}
