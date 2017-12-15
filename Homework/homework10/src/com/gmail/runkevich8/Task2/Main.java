package com.gmail.runkevich8.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person personMan1 = new Person("Василий","Пончик","петрович");
        Person personMan2 = new Person("Петр","Ромашка","иавнович");
        Person personMan3 = new Person("Аркадий","Василек","григорьевич");
        Person[] arrayMan = new Person[]{personMan1, personMan2, personMan3};

        Person personWoman1 = new Person("Мария","Пончик","Петровна");
        Person personWoman2 = new Person("Екатерина","Ромашка","Ивановна");
        Person personWoman3 = new Person("Наталья","Василек","Григорьевна");
        Person[] arrayWoman = new Person[]{personWoman1,personWoman2,personWoman3};

        Map<String, Person> hashMap = new HashMap<>();
        Random random = new Random();
        int num = random.nextInt(3);

        hashMap.put("man",arrayMan[num]);
        hashMap.put("woman",arrayWoman[num]);

        System.out.println("Выберите категорию: \n1-мужчина, 2 - женщина");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("Мужчина  = " + hashMap.get("man").toString());
                break;
            case 2:
                System.out.println("Женщина  = " + hashMap.get("woman").toString());
                break;
            default:
                System.out.println("Неправильно выбрали пункт.");
        }

    }

}
