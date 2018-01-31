package com.gmail.runkevich8.parse;

import com.gmail.runkevich8.downloader.DownloaderData;
import com.gmail.runkevich8.entity.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Date;


public class ParseJson extends Thread implements ParseData {

    private Object object;
    String fileName;

    public ParseJson(String fileName, Object object){
        this.fileName = fileName;
        this.object = object;
    }

    public Root parse(){
        Root root;
        try {

            //FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("FirstFile.json"));

            GsonBuilder builder = new GsonBuilder().
                    registerTypeAdapter(Date.class, new DateGsonConverter());

            Gson gson = builder.create();
            root = gson.fromJson(bufferedReader, Root.class);

            return root;
        } catch (Exception e) {
            System.out.println("Невозможно открыть json error = " + e.toString());
        }
        return null;
    }

    @Override
    public void run() {
        try {
            synchronized (object) {
                object.wait();
            }

            } catch (InterruptedException e) {
        }
        parse();
//        synchronized (object) {
//            object.notify();
//        }
    }
}
