package com.gmail.runkevich8.Task1;

public class DownloadThread extends Thread {

    private ParsingThread parsingThread;

    public void setParsingThread(ParsingThread parsingThread) {
        this.parsingThread = parsingThread;
    }

    @Override
    public void run(){
        System.out.println("download all files");
        synchronized (parsingThread) {
            parsingThread.notify();

        }
//        synchronized (parsingThread){
//            try {
//                parsingThread.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


    }
}
