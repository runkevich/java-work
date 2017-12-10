package com.gmail.runkevich8.Task2;

import java.util.Comparator;

public class SortByAgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) { // принимате два значения на вход и не нужно переопределять

        if(o1.getAge() == o2.getAge()) return 0;

        if (o1.getAge() > o2.getAge()) return  1 ;

        return -1;

    }
}
