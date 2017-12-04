package com.gmail.runkevich8.Task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
       // Student[] studentsArray = {student1, student2, student3};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date birthDate1 = new Date (90, 1, 19);
        Date birthDate2 = new Date (96, 6, 9);
        Date birthDate3 = new Date (95, 12, 1);

        Student student1 = new Student();
        student1.setName("Вася");
        student1.setSurname("Петровец");
        student1.setBd(birthDate1);

        Student student2 = new Student();
        student2.setName("Петя");
        student2.setSurname("Васильев");
        student2.setBd(birthDate2);

        Student student3 = new Student();
        student3.setName("Оксана");
        student3.setSurname("Прекрасная");
        student3.setBd(birthDate3);



        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        calendar.setTime(birthDate1);
        int birthYear = calendar.get(Calendar.YEAR);
        System.out.println(currentYear - birthYear);



    }

}
