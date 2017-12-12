package com.gmail.runkevich8.Task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // является ли хешмап и мап коллекциями ????!!!!ответ : нет

        Set<String> testSet = new HashSet<>(); // в хешсете хранит не повторяющиеся элементы (с помощью equals)
        testSet.add("AAA");                     // метода get нету
        testSet.add("BBB");
        testSet.add("AAA");

        for (String test : testSet){
            System.out.println("value = " + test);
        }
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("AAA");

        testSet.addAll(list); // чтобы убрать в ArrayList дубликаты: 1) перводим в хешсет 2)затем обратно в ArrayList
        list.clear();
        list.addAll(testSet);

        Map<String, String> testMap = new HashMap<>(); // обязательно переопределен equals and hashcode
        testMap.put("RU", "RU VALUE");
        testMap.put("BUY", "VALUE2");
        testMap.put("EN", "VALUE");
        testMap.put("FR", "VALUE");
        testMap.put("IN", "VALUE1"); //данные хранятся парами, повторятся могут только значения , ключи же перезаписываются

        System.out.println(" VALUE = " + testMap.get("RU"));
    }

}
