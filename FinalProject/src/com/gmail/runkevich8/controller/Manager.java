package com.gmail.runkevich8.controller;

import com.gmail.runkevich8.comparators.SortByNameCity;
import com.gmail.runkevich8.comparators.SortByPrice;

import com.gmail.runkevich8.downloader.DownloaderData;
import com.gmail.runkevich8.entity.Root;

import com.gmail.runkevich8.parse.ParseData;
import com.gmail.runkevich8.parse.ParseJson;
import com.gmail.runkevich8.parse.ParseXML;

import java.util.*;

public class Manager {

    private static final String LINK_JSON = "http://kiparo.ru/t/bus_schedule.json";
    private static final String LINK_XML = "http://kiparo.ru/t/bus_schedule.xml";

    private static final String FILE_JSON = "FirstFile.json";
    private static final String FILE_XML = "FirstFile.xml";
    private static  Root  root;
    private static final Object object = new Object();

    private static Manager instance;

    private Manager() {

    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public static void downloadUrl(int j) {

        String link = null;
        String fileName = null;
        switch (j){
            case 1:

                //json
                link = LINK_JSON;
                fileName = FILE_JSON;

            break;
            case  2:

                //xml
                link = LINK_XML;
                fileName = FILE_XML;

            break;
            default:
                System.out.println("Не правильно выбран формат.");
                return;
        }
        DownloaderData downloader = new DownloaderData(link, fileName,  object);
        Thread downloadThread = new Thread(downloader);
        downloadThread.start();

       Thread parseThread;
        if (fileName.contains(".xml")) {

            ParseXML parseXML = new ParseXML(fileName, object);
            root = parseXML.parse();
            parseThread = new Thread(parseXML);

        } else {
            ParseJson parseJson = new ParseJson(fileName,object);
            root = parseJson.parse();
            parseThread = new Thread(parseJson);

        }
        parseThread.start();
    }

    public static void showSchedule(){

        String array[] = new String[root.getSchedule().size()];
        for(int j =0;j<root.getSchedule().size();j++){
            array[j] = String.valueOf(root.getSchedule().get(j));
        }

        //Вывод на экран ArrayList
        for(String k: array)
        {
            System.out.println(k);
        }
    }

    public static void sort(int b) {
        switch (b) {
            case 1:

                Comparator sortByPrice = new SortByPrice();
                root.getSchedule().sort(sortByPrice);
                break;
            case 2:
                //name town
                Comparator sortByNameCity = new SortByNameCity();
                root.getSchedule().sort(sortByNameCity);

                break;
            default:
                System.out.println("Не правильно выбран поиск");
                return;
        }
        showSchedule();
    }

    public static void search(int a) {
        Scanner scanner = new Scanner(System.in);
        switch (a) {
            case 1:

                //nomer bus

                System.out.println("Введите номер автобуса для поиска");
                int number = scanner.nextInt();
                root.findNumberBus(number);

                break;
            case 2:

                //vremeni

                System.out.println("Введите дату в формате yyyy-MM-dd");
                String date = scanner.nextLine();
                root.findDateStart(date);

                break;
            case 3:

                //price
                System.out.println("Введите стоимость");
                int price = scanner.nextInt();
                root.findPrice(price);

                break;
            case 4:

                //current trip
                root.findCurrent();

                break;
            default:
                System.out.println("Не правильно выбран поиск");
        }
    }

}
