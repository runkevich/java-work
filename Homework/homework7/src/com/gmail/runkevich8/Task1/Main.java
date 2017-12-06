package com.gmail.runkevich8.Task1;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Collection<Student> students = Arrays.asList(
                new Student("Вася", "Леон",   format.parse("1998-02-02")),
                new Student("Петя", "Катон", format.parse("1995-12-05")),
                new Student("Ева","Снег",format.parse("1994-11-29"))
        );

        System.out.println(getAverageBirthday(students));

    }
    static String getAverageBirthday(Collection<Student> array) {
        int year, month;

        GregorianCalendar currentDate = new GregorianCalendar();
        GregorianCalendar calendarTemp = new GregorianCalendar();

        long averageTime = 0;
        for (Student i : array) {
            averageTime += i.getBd().getTime();
        }

        averageTime = averageTime / array.size();
        calendarTemp.setTime(new Date(averageTime));

        year = currentDate.get(GregorianCalendar.YEAR) - calendarTemp.get(GregorianCalendar.YEAR);

        if (currentDate.get(GregorianCalendar.DAY_OF_YEAR) < calendarTemp.get(GregorianCalendar.DAY_OF_YEAR)) {
            year--;
            month = 12 - calendarTemp.get(GregorianCalendar.MONTH) + currentDate.get(GregorianCalendar.MONTH);
        } else {
            month = currentDate.get(GregorianCalendar.MONTH) - calendarTemp.get(GregorianCalendar.MONTH);
        }

        String answer = (year + " years " + month + " month " );

        return answer;
    }
}
