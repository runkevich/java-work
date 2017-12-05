package com.gmail.runkevich8.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        //..................................................................................
        //не проеряемый вид ошибки
        //если есть возможность сделать через if вместо TRY-CATCH - лучше делать через иф
        FileOutputStream o = null;
        try {
            //блок кода в котором потенциально может быть проблема
            int a = 5 / 0;
            SimpleDateFormat sdf = new SimpleDateFormat("");
            Date date = sdf.parse("kjjj");

            o = new FileOutputStream(new File(""));


        } catch (ArithmeticException e) {
            //блок кода , который выполнится если в блоке try
            //произошла ошибка
            System.out.println("Ошибочка " + e.toString());//ошибка для себя
        } catch (ParseException luboeNazvanie) {
            // e.printStackTrace();
            System.out.println("ошибка - проблема с датой");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
           // if (o != null) o.close();
        }
        //................................................................
        // проверяемый тип :


//        try {
//            double result = test(5, 0);
//        } catch (){
//
//        } *(1)

        //double result = test(5, 0);
        // }
        //...........................
//
//    public  static double test(int  a, int b) throws ArithmeticException{ //отправляет на обработку выше (*(1))
//        return a = 5/0;
//    }
//    public  static double test(int  a, int b) throws ParseException{ //отправляет на обработку выше (*(1)) - делать try-catch
//       if (b == 0) {
//        throw  new ParseException("fff",0);
//       }
//       return 0;
//    }
        //.......СВОЕ ИСКЛЮЧЕНИЕ..............
        try {
            double result = test(5, 5);
        } catch (FiveException e) {
            System.out.println("Ошибка, вводить запрещено 5");
        }
    }

    public static double test(int a, int b) throws FiveException, ArithmeticException { //отправляет на обработку выше (*(1)) - делать try-catch
        if (b == 5) {
            throw new FiveException();
        }
        return a / b;
    }
}
