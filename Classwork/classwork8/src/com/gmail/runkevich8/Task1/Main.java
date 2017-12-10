package com.gmail.runkevich8.Task1;

public class Main {

    public static void main(String[] args) { // шаблон для калькулятора

       try {
           test(5);
       } catch (MyException e){// интерфейс для калькулятора

           System.out.println(e.getRussionMessage());

       }
    }

    public static void test(int a) throws MyException{// в классе калькулятор

        if(a == 5){

            throw new MyException("5 недопустимый символ");

        }

    }
}
