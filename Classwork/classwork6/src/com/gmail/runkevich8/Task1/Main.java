package com.gmail.runkevich8.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Main {

    public static void main(String[] arg){

        Date date = new Date();
        System.out.println(date.toString());    // хранилка времени
        System.out.println(date.getTime());

        SimpleDateFormat std = new SimpleDateFormat("dd MMMM yyyy", Locale.FRENCH);    //Java sdata format;  https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

        String dataText = std.format(date);
        System.out.println(dataText);

       //..................................

        String inputData = "2017-11-30 17:59";
        Date data2 = null;

        SimpleDateFormat std2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        try {
            data2 = std2.parse(inputData);      //ПАРСИТЬ - из одного типа в другой переход!
        } catch (Exception e) {
            System.out.println("неверный формат!");
        }

        System.out.println(data2.toString());


       //.......................................

        int day = date.getDate();
        String pattern = "MMMM dd'" + getPostFix(day) + "' hh:mm a";
        //обязательно одинарные кавычки !!!!
        //(одинарная кавычка экранирует,выводит срдержимое как есть без замены на дату)
        SimpleDateFormat sd3 = new SimpleDateFormat(pattern, Locale.ENGLISH);
        String dataText3 = sd3.format(date);
        System.out.println(dataText3);
//........................................
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        int dayM = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        int mu = calendar.get(GregorianCalendar.MONTH);

        //прибавляем 30 дней, если отнять, то -30
        calendar.add(GregorianCalendar.DATE,30);
        System.out.println(calendar.getTime().toString());
       // calendar.setTimeZone(TimeZone.getTimeZone("g+3"));
    }
//...................................
    private static String getPostFix(int day) {

        if (day>= 11 && day<=13) return "th";
        switch (day%10){
            case 1:{
                return "st";
            }
            case 2:{
                return "nd";
            }
            case 3:{
               return "rd";
            }
            default:{
                return "th";
            }
        }

    }
}
