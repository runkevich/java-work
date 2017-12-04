package com.gmail.runkevich8.Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] arg) {

    int array1[] = {3, 6, 0, 1, 9, 1, 5, 8, 0, 1};
    int array2[] = new int[20];

    System.arraycopy(array1,0, array2, 5, array1.length);
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
    }
}
