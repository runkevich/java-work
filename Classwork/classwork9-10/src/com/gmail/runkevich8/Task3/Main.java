package com.gmail.runkevich8.Task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import java.net.URL;

public class Main {

    private static final String LINK = "https://www.tut.by";

    public static void main(String[] args) {// скачивание с инетрнета

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;

        try {//java.net - package
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {// upload

                inputStream = httpURLConnection.getInputStream();

                File file = new File("ex.html");
                fileOutputStream = new FileOutputStream(file);

                int byteRead = -1;
                byte[] buffer = new byte[2048]; // то , куда скачивается наш сайт 2 Мб
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }


            } else {
                System.out.println("Данные не найдены, response code = " + responseCode);
            }


        } catch (Exception e) {
            System.out.println("Невозможно скачать файл");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Невозсожно закрыть  inputStream, error =  " + e.toString());
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Невозсожно закрыть  outputStream, error =  " + e.toString());
                }
            }


        }
    }
}
