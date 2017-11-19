package com.gmail.runkevich8.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg){

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 50 - 25);
        System.out.println(Arrays.toString(array));

        for (int i = 0, j = array.length - 1; i < 2 ; i++, j--)
        {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

        }
        System.out.println(Arrays.toString(array));
    }
}
