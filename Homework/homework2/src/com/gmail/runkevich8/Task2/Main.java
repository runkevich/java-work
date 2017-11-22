package com.gmail.runkevich8.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static ArrayList<Float> el = new ArrayList<Float>();
    public static void main (String[] args) {
        float[] array = {1, 2, 3, 5, 3, 8, 8, 1, 3, 2};
        float element = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (c_element(array[i])) {
                for (int j = 0; j < array.length; j ++) {
                    if (array[i] == array[j]) {
                        count++;
                        element = array[j];
                        el.add(array[i]);
                    }
                }
            }
            if (count > 1) System.out.println("[" + element + "]"+ " - повторений "+ count);
            count = 0;
        }
    }
    private static boolean c_element (float arr_i) {
        for (int k = 0; k < el.size(); k++) {
            if (arr_i == el.get(k)) return false;
        }
        return true;
    }
}

