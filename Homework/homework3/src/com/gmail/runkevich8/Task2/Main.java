package com.gmail.runkevich8.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] arg) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println(pages(i) + " pages");

    }


    private static int pages(int i) {
        return (int) Math.ceil((double) i / 10);
    }

}
