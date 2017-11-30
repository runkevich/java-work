package com.gmail.runkevich8.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int countMoney;

    public static void main(String[] arg) throws IOException {

       ATM atm = new ATM();
        System.out.println("Для добавления денег нажмите - 1; Для снятия - 2.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());

        switch (i){
            case 1:
                System.out.println("Вставьте деньги: ");
                countMoney = Integer.parseInt(bufferedReader.readLine());
                atm.addMoney(countMoney);
                break;
            case 2:
                System.out.println("Снять денег: ");
                countMoney = Integer.parseInt(bufferedReader.readLine());
                atm.unAddMoney(countMoney);
                break;
            default:
                System.out.println("Отказ в обслуживании.");
        }

    }

}
