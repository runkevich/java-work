package com.gmail.runkevich8.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Пользователь, введите любое слово на английском");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        text = text.replaceAll("\\s","");
        System.out.println(text);


    }

}
