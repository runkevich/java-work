package com.gmail.runkevich8.view;

import com.gmail.runkevich8.controller.Manager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Manager.getInstance();
        System.out.println("Добро пожаловать в сиестему Расписание автобусов.");

        System.out.println("В каком формате хотите скачать файл 1 - json; 2 - xml");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();

        Manager.downloadUrl(j);

        System.out.println("Выберите функцию для дальнейшей работы:\nВведите: 1 - Просмотр полного расписания; 2 - Произвести поиск; 3 - Отсортировать данные");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                //метода для показа данных в удобночитаемом виде
                Manager.showSchedule();
                break;
            case 2:
                System.out.println("Выберите поиск: 1 - по номеру автобуса; 2 - по времени отправления; 3 - по цене; 4 - узнать длительность поездки");
                int a = scanner.nextInt();
                Manager.search(a);
                break;
            case 3:
                System.out.println("Выберите сортировку: 1 - по цене; 2 - названию города");
                int b = scanner.nextInt();
                Manager.sort(b);
                break;
            default:
                System.out.println("Неправильно ввыбрали операцию.");
        }
    }
}
