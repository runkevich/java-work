package com.gmail.runkevich8.model.parse;

import com.gmail.runkevich8.model.entity.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.Date;


public class ParseJson implements ParseData {


    public ParseJson(String url) {
        if (checkFile(url)) try {

            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(url));

            GsonBuilder builder = new GsonBuilder().
                    registerTypeAdapter(Date.class, new DateGsonConverter());

            Gson gson = builder.create();

            Root root = gson.fromJson(bufferedReader, Root.class);

            System.out.println("root = " + root.toString());

        } catch (Exception e) {
            System.out.println("Невозможно открыть json error = " + e.toString());
        }
    }

    @Override
    public boolean checkFile(String url) {
        if ((new File(url)).exists()) {
            return true;
        } else {
        return false;
    }
    }
}
