package com.gmail.runkevich8.Task3;

public class Main {
    public static void main(String[] args) {

        ParsingThread parsingThread = new ParsingThread();
        DownloadThread downloadThread = new DownloadThread();

        parsingThread.setDownloadThread(downloadThread);
        downloadThread.setParsingThread(parsingThread);

        parsingThread.start();
        downloadThread.start();

    }
}
