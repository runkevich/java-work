package com.gmail.runkevich8.Task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg){


        System.out.println(Arrays.toString(bubbleSort()));

    }
    private static int[] bubbleSort(){

        int[] array = {9, 6, 0, 2, 7, 5, 0, 2, 7, 4,3};

        for (int i = array.length-1; i>=0; i--){
            for (int j =0; j<i; j++){
                if(array[j]>array[j+1]){

                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }

        }
        return array;
    }
}
