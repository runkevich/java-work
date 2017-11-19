package com.gmail.runkevich8.Task1;

import java.util.Arrays;

public class Main {

    public static void main (String[] arg) {
        int[] array = {4, 9, 2, 8, 19, 4, 7, 3, 1, 10};      // Задание №1
        int min = array[0];
        int max = array[0];
        int indexMin = 0, indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
                indexMin = i;
            }
            if (max < array [i]){
                max = array[i];
                indexMax = i;
            }
        }

        array[indexMin] = 0;
        array[indexMax] = 99;
        System.out.println("min value = " + min);
        System.out.println("min value = " + max);
        System.out.println(Arrays.toString(array));

    }
}

