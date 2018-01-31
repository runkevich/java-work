package com.gmail.runkevich8.downloader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloaderData implements Runnable{

    private static InputStream inputStream = null;
    private static FileOutputStream fileOutputStream = null;
    private Object object;
    private String link;
    private String fileName;

    public DownloaderData(String link, String fileName, Object object) {
        this.link = link;
        this.fileName = fileName;
        this.object = object;
    }

    public boolean download() {
        try {
            URL url = new URL(link);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                inputStream = httpURLConnection.getInputStream();

                File file = new File(fileName);

                fileOutputStream = new FileOutputStream(file);

                int byteRead = -1;
                byte[] buffer = new byte[2048];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }

            } else {
                System.out.println("Данные не найдены, response code = " + responseCode);
            }

        } catch (Exception e) {
            System.out.println("Невозможно скачать файл, возможно нет интернета.");
        }
        finally {
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
        return true;
    }

    @Override
    public void run() {

        download();
        synchronized (object) {

            object.notify();
        }
//        try {
//            synchronized (object) {
//                object.wait();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

