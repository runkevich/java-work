package com.gmail.runkevich8.Task3;

public class ParsingThread extends Thread{

    private DownloadThread downloadThread;

    public void setDownloadThread(DownloadThread downloadThread) {
        this.downloadThread = downloadThread;
    }

    @Override
    public void run(){
        //спим и ждем пока на не разбудит downloadThread
        System.out.println("sleep parse");
        try {
            wait();
        } catch (InterruptedException e) {}
        //wake up

        System.out.println("json parsing");
        //parse...................


        System.out.println("ping download from parsing");
        downloadThread.notify();// в блок синхранайз кинуть !!!!!!!!!!!!!!!!!!!!!!!!!!1

        //а сами засыпаем пока нас не разбудит downloadThread
        System.out.println("wait parsing");
        try {
            wait();
        } catch (InterruptedException e) {}


        System.out.println("xml parsing");
        //parse xml ..........

        System.out.println("end parsing");

    }
}
