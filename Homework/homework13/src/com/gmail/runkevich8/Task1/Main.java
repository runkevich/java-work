package com.gmail.runkevich8.Task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Пользователь, введите любое слово на английском");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        text = text.replaceAll("\\s","");
        System.out.println(text);

        Pattern pattern = Pattern.compile("((.)+)\\1+");
        Matcher matcher = pattern.matcher(text);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {

            int cur = matcher.end() - matcher.start();
            String w = matcher.group().substring(0, 1);
            matcher.appendReplacement(buffer, w + cur);
        }
        matcher.appendTail(buffer);
        System.out.println(buffer.toString());

    }

}
