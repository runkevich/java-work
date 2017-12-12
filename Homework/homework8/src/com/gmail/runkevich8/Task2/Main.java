package com.gmail.runkevich8.Task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Учеба-курсы\\listOfStudent.doc");

        if (file.exists()){
            readFile();

            System.out.println("Хотиет удалить файл? \n1-да; 2-нет");
            Scanner scanner = new Scanner(System.in);
            int cur = scanner.nextInt();
            switch (cur){
                case 1:
                    file.delete();
                case 2:
                    break;
                default:
                    System.out.println("Неправильно выбрали номер операции");
            }
        } else {
            createFile();
        }
    }


    private static void readFile() {

        try (FileReader fileReader = new FileReader("D:\\Учеба-курсы\\listOfStudent.doc")){

            Scanner scanner = new Scanner(fileReader);
            int i = 1;

            while (scanner.hasNextLine()) {
                System.out.println(i + " : " + scanner.nextLine().toString());
                i++;
            }

            fileReader.close();

        } catch (IOException ex){
            System.out.println("Ошибка");
        }
    }

    private static void createFile() {

        List<Student> studentList = new ArrayList<>();
        System.out.println("Добавить студента в список? \n1-да; 2-нет");
        Scanner scanner = new Scanner(System.in);
        int   i = scanner.nextInt();

        while (i == 1){

            System.out.println("Введите имя и Фамилия студента:");
            String name = scanner.next();
            String surName = scanner.next();

            Student student = new Student(name,surName);
            studentList.add(student);
            System.out.println("Добавить еще студента в список? \n1-да; 2-нет");
            scanner = new Scanner(System.in);
            i = scanner.nextInt();
        }

            try (FileWriter writer = new FileWriter("D:\\Учеба-курсы\\listOfStudent.doc")){

                for (Student student : studentList){
                writer.write(student.toString());
                writer.append("\n");
                }
                writer.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
    }
}
