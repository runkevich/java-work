package com.gmail.runkevich8.Task1;

import java.sql.Timestamp;

public class Main {

    public static void main(String[] args) {
        //...........мой вариант..............
        int N = 5;
        int mas[] = {9, 5, 0, 0, 5};
        int ans = mas[0];

//        for (int i = 0; i<mas.length; i++){
//            ans^=mas[i];
//        }

        int res = 0;
        for (int i = 0; i < mas.length; i++) {
            if ((mas[i]) > 0) {
                res ^= mas[i];
            }
        }
        System.out.println(res);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }
        //.........вариант Тимофея....................
        public static int getNumber(int[] array){

        int result = 0;
        for (int i = 0 ;i<array.length; i++){

            result = result^array[i];
            }
            return result;
        }
}