package com.gmail.runkevich8.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        int[] array = new int[10];
        System.out.println("Введите 10 элементов массива");

        inArr(array);


        switch (1){ // 1- сортировка выбором, 2 - пузырьковая , 3 - сортировка вставками
            case 1:
                sortSelection(array);
                break;
            case 2:
                sortBubble(array);
                break;
            case 3:
                sortInsert(array);
                break;
        }

        printArr(array);
        evenNumber(array);

    }


    private static void inArr(int[] array) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        printArr(array);

    }


    private static void sortSelection(int[] array) {

        int min, temp;

        for (int index = 0; index < array.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < array.length; scan++) {
                if (array[scan] < array[min])
                    min = scan;
            }

            temp = array[min];
            array[min] = array[index];
            array[index] = temp;
        }
    }

    private static void sortBubble(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    private static void sortInsert(int[] array) {

        int temp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }


    private static void printArr(int[] array) {

        String s = " ";
        for (int i = 0; i < array.length; i++) {
            String ss = s + array[i] + " | ";
            System.out.print(ss);
            if (i == array.length - 1) {

                ss = ss.replace("|", "");
                System.out.print(ss);
                System.out.println();

            }

        }

    }


    private static void evenNumber(int[] array) {

        int evenNums = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                evenNums++;
            }
        }

        int[] array2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                array2[index] = array[i];
                index++;
            }
        }

        printArr(array2);
    }
}