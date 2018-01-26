package com.gmail.runkevich8.model.downloader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DownloaderData {

    private static InputStream inputStream = null;
    private static FileOutputStream fileOutputStream = null;

    public void download(String LINK) {
        try {
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {// upload

                inputStream = httpURLConnection.getInputStream();
//_________________modernize___________________________________________
                File file = null;
                Pattern patternXml = Pattern.compile("(.)\\.xml$");
                Matcher matcher = patternXml.matcher(LINK);
                if (matcher.find()) {
                    file = new File("FirstFile.xml");
                }

                Pattern patternJson = Pattern.compile("(.)\\.json$");
                Matcher matcher1 = patternJson.matcher(LINK);
                if (matcher1.find()) {
                    file = new File("FirstFile.json");
                }
                fileOutputStream = new FileOutputStream(file);
//_______________________________________________________________________
                int byteRead = -1;
                byte[] buffer = new byte[2048];
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

