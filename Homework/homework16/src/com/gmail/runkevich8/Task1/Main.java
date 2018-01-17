package com.gmail.runkevich8.Task1;

public class Main {

    private static Object object = new Object();

    public static void main(String[] args) {
        ParsingThread parsingThread = new ParsingThread();
        DownloadThread downloadThread = new DownloadThread();


        parsingThread.setObject(object);
        downloadThread.setObject(object);
        

        parsingThread.start();
        downloadThread.start();
    }

}
