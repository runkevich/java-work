package com.gmail.runkevich8.view;

import com.gmail.runkevich8.controller.Manager;

import java.util.Scanner;

public class Main {

    private static final String LINK_JSON = "http://kiparo.ru/t/bus_schedule.json";
    private static final String LINK_XML = "http://kiparo.ru/t/bus_schedule.xml";

    public static void main(String[] args) {

        Manager.getInstance();
        System.out.println("Добро пожаловать в сиестему Расписание автобусов.");

        System.out.println("В каком формате хотите скачать файл 1 - json; 2 - xml");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        switch (j){
            case 1:
                //json
                Manager.downloadUrl(LINK_JSON);

            break;
            case  2:
                //xml
                Manager.downloadUrl(LINK_XML);
            break;
            default:
                System.out.println("Не правильно выбран формат.");
        }

        System.out.println("Выберите функцию для дальнейшей работы:\nВведите: 1 - Просмотр полного расписания; 2 - Произвести поиск; 3 - Отсортировать данные");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                //метода для показа данных в удобночитаемом виде
                break;
            case 2:
                System.out.println("Выберите поиск: 1 - по номеру автобуса; 2 - по времени отправления; 3 - по цене");
                int a = scanner.nextInt();

                switch (a) {
                    case 1:

                        //nomer bus
                        break;
                    case 2:

                        //vremeni
                        break;
                    case 3:

                        //price
                        break;
                    default:
                        System.out.println("Не правильно выбран поиск");
                }
                break;
            case 3:

                System.out.println("Выберите сортировку: 1 - по цене; 2 - названию города");
                int b = scanner.nextInt();
                switch (b) {
                    case 1:

                        //price
                        break;
                    case 2:

                        //name town
                        break;
                    default:
                        System.out.println("Не правильно выбран поиск");
                }
                break;
            default:
                System.out.println("Неправильно ввыбрали операцию.");
        }
    }

}
