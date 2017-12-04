package com.gmail.runkevich8.Task2;

public class ATM {

    public int countHundred = 0;
    public int countFifty = 0;
    public int countTwenty = 0;

    public int getCountHundred() {
        return countHundred;
    }

    public void setCountHundred(int counHundred) {
        this.countHundred = counHundred;
    }

    public int getCountFifty() {
        return countFifty;
    }

    public void setCountFifty(int countFifty) {
        this.countFifty = countFifty;
    }

    public int getCountTwenty() {
        return countTwenty;
    }

    public void setCountTwenty(int countTwenty) {
        this.countTwenty = countTwenty;
    }

    public void addMoney(int countMoney) {

        if (countMoney >= 20) {

            if (countMoney / 100 != 0) {
                countHundred += countMoney / 100;
            }
            if ((countMoney % 100) % 50 == 0) {
                countFifty++;
            }
            if ((countMoney % 100) % 20 == 0) {
                countTwenty += (countMoney % 100) / 20;
            }
           if (((countMoney % 100) - 50) % 20 == 0 && ((countMoney % 100) - 50) != 0) {
                countFifty++;
                countTwenty += ((countMoney  % 100) - 50) / 20;
            }
            System.out.println("100 - " + countHundred + ".50 - " + countFifty + ".20 - " + countTwenty);

        } else

            System.out.println("Операция не удалась. Слишком мелко.");
    }

    public void unAddMoney(int countMoney){

        if (countMoney / 100 != 0) {
            countHundred -= countMoney / 100;
            System.out.println("100 - " + countMoney / 100);
        }
        if ((countMoney % 100) % 50 == 0) {
            countFifty+=(countMoney%100)%50;
            System.out.println("50 - " + countFifty);
        }
        if ((countMoney % 100) % 20 == 0) {
            countTwenty -= (countMoney % 100) / 20;
            System.out.println("20 - " + (countMoney % 100) / 20);
        }
        if (((countMoney % 100) - 50) % 20 == 0 && ((countMoney % 100) - 50) != 0) {
            countFifty--;
            countTwenty -= ((countMoney % 100) - 50) / 20;
            System.out.println("50 - " + 1);
            System.out.println("20 - " + ((countMoney % 100) - 50) / 20);
        }
    }
}