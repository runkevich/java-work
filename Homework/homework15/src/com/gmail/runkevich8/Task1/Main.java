package com.gmail.runkevich8.Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Введите start для старта");
        Scanner in = new Scanner(System.in);
        String start = in.nextLine();

        Pattern pattern = Pattern.compile("^start$");
        Matcher matcher = pattern.matcher(start);


        if (matcher.matches()) {
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        main.print10();
                    }
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        main.print10();
                    }
                }
            });

            thread1.start();
            thread2.start();

        } else {
            System.out.println("Не то значение ввели для старта");
        }
    }

    public synchronized void print10(){

        System.out.print(Thread.currentThread().getName()+":");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println("");
            }
        }
    }
}

