package com.gmail.runkevich8.controller;

import com.gmail.runkevich8.model.downloader.DownloaderData;
import com.gmail.runkevich8.model.parse.ParseJson;
import com.gmail.runkevich8.model.parse.ParseXML;

public class Manager {

    private static Manager instance;

    private Manager() {

    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public static void downloadUrl(String url) {
        new DownloaderData().download(url);
    }

    public static void parseFile(String url) {
        if (url.contains(".xml")) {
            new ParseXML(url);
        } else new ParseJson(url);
    }

}
