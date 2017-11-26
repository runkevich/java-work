package com.gmail.runkevich8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) throws IOException {


        Student student1 = new Student();
        student1.setFIO("Лешкевич Лариса Петровна");
        student1.setAge(32);
        student1.setDiagnosis(true);

        Student student2 = new Student();
        student2.setFIO("Козак Василий Петрович");
        student2.setAge(12);
        student2.setDiagnosis(false);

        Student student3 = new Student();
        student3.setFIO("Козак Лариса Игоривна");
        student3.setAge(32);
        student3.setDiagnosis(true);

        Student[] studentsArray = {student1, student2, student3};


        for (Student student: studentsArray){
            printStudent(student);
        }

        System.out.println("\nВыбери критерий поиска 1 - поиск по имени; 2 - поиск по возрасту.");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        switch (i){
            case 1 :
                findFIO(studentsArray);
                break;
            case 2:
                findAge(studentsArray);
                break;
            default:
                System.out.println("Отказ в поиске");
                break;
        }

    }

    private static void findAge(Student[] studentsArray) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст пациента:");

        int temp = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i].getAge() == temp) {
                printStudent(studentsArray[i]);
            }
        }
    }

    private static void findFIO(Student[] studentsArray) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ФИО пациента:");

        String temp = bufferedReader.readLine();
        for (int i = 0; i < 3; i++)
            if (studentsArray[i].getFIO().toUpperCase().contains(temp.toLowerCase())) {
            printStudent(studentsArray[i]);
            }
    }

    private static void printStudent(Student student) {
        System.out.println("Пациент  " + student.getFIO() + " - Возраст = " + student.getAge());

    }

}
