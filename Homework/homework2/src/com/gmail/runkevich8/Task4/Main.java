package com.gmail.runkevich8.Task4;

import java.util.Scanner;


public class Main {

    public static void main(String[] arg){

        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();

        char[] array = number.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println(number + " - не образуют");

                return;
            }
        }
            System.out.println(number + " - образуют");

    }}
