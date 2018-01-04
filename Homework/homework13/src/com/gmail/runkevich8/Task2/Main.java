package com.gmail.runkevich8.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Пользователь, введите любое слово на английском");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        Pattern pattern = Pattern.compile("^[A-Za-z]+\\.xml$");
        Matcher matcher = pattern.matcher(text);


        if (matcher.matches()){
            System.out.println("xml");
        } else {
            System.out.println("Формат не xml");
        }


    }
}
