package com.gmail.runkevich8.Task3;

public class DownloadThread extends Thread {

    private ParsingThread parsingThread;

    public void setParsingThread(ParsingThread parsingThread) {
        this.parsingThread = parsingThread;
    }

    @Override
    public void run(){
//        parsingThread.notify();
//        try {
//            parsingThread.wait();
//        } catch (InterruptedException e) {
//
//        }
//        parsingThread.notify();
//        try {
//            parsingThread.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
