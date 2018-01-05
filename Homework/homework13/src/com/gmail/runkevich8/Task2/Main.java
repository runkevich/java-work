package com.gmail.runkevich8.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Пользователь, введите любое слово на английском");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


       Pattern pattern = Pattern.compile("^([A-Za-z0-9]+)\\.([a-z]+)$");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println(matcher.group(2));
        }else {
            System.out.println("Выбран не верный формат");
        }
    }
}

