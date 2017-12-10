package com.gmail.runkevich8.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {// collection - помогают в удобном виде хранить данные

    public static void main(String[] args) throws IOException {

        List<String> array = new ArrayList<>();
        //List<String> array = new LinkedList<>();

        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");

        System.out.println("Size of list: " + array.size());
        array.add("5");

        System.out.println("Size of list: " + array.size());
        System.out.println("Value: " + array.get(0));

        //удаляем значение со значением 2
        array.remove("2");
        System.out.println(array);

        //добавляем в индекс 3 значение,существующие сдвигаются
        array.add(3,"mo");

        //заменяем значение под индексом 3 на новое
        array.set(3, "noo");

        //ВНУТРИ arraylist находится обычный массив,который увеличивается(пересоздается) при 75% заполненности (16 элементов !)
        // минус arraylist  - вставка\удаление с середины
        // минус arraylist  - быстры доступ к элементу


        for (String text : array){ // для удаление лучше использовать while
            // т.к. не запомниает изменение размера
//            if(){
//                array.remove(i);
//            }

        }
//..............LinkedList - двухсвязный список...................................................
        //каждый элемент имеет ссылку на предыдущий и на следующий
        //плюсы: решает вопрос со вставками и удаленим в середине
        //минусы: доступ к элеенту происход за более долгое время ,чем у arraylist


//.......................Example.................................................................
        //....................многомерные массивы.......................................
        int[][] a = new int[5][5];
        a[0][0] = 1;

        List<Student> studentList = new ArrayList<>();
//
//        boolean i = true;
//       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//
//       // int i = Integer.parseInt(bufferedReader.readLine());
//
//        while (i){
//
//            System.out.println("Введите имя и возраст студента:");
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            String name = bufferedReader.readLine();
//            int age = Integer.parseInt(bufferedReader.readLine());
//
//             Student student = new Student(name,age);
//             studentList.add(student);
//        }
//
//        for (Student student : studentList){
//            System.out.println("name " + student.getName());
//            System.out.println("age " + student.getAge());
//        }

        Student student1 = new Student("Name", 25);
        Student student2 = new Student("Name", 22);

        if(student1.equals(student2)){

        }
        System.out.println(student2.toString());

        Collections.sort(array);

        Comparator sortByAge = new SortByAgeComparator();
        Collections.sort(array, sortByAge);

    }

}
