package com.gmail.runkevich8.Task1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double a = 0;
        double b = 0;
        int i = 0;

        try {
            System.out.println("Введите два числа для дальнейших числовых операций:");
            Scanner scanner = new Scanner(System.in);
            a = Integer.parseInt(scanner.next());
            b = Integer.parseInt(scanner.next());

            System.out.println("Выберите операцию: \n1 - сложение \n2 - вычитание \n3 - умножение \n4 - деление");
            i = Integer.parseInt(scanner.next());

        } catch (NumberFormatException e){
            System.out.println("Это не число");
        }

        Calculator calculator = new Calculator(a,b);

        switch (i) {

            case 1:
                System.out.println(a + " + " + b + " = " + calculator.add());
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + calculator.unAdd());
                break;

            case 3:
                System.out.println(a + " * " + b + " = " + calculator.multiplication());
                break;

            case 4:
                try {
                    System.out.println(a + " : " + b + " = " + calculator.division());
                } catch (MyException1 e){
                    System.out.println(e.getRussianMessage());
                }

                break;

            default:
                try {
                   throw new MyException("Неправильный выбор математической операции.");
                } catch (MyException e){
                    System.out.println(e.getRussianMessage());
                }
        }

    }

}
