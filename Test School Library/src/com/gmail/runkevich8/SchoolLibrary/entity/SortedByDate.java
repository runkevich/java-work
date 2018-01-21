package com.gmail.runkevich8.SchoolLibrary.entity;

import java.util.Comparator;

public class SortedByDate implements Comparator<Pupils> {
    @Override
    public int compare(Pupils o1, Pupils o2) {

        int str1 = o1.getAge(o1.getBd());
        int str2 = o2.getAge(o2.getBd());

        if(str1 > str2) {
            return 1;
        }
        else if(str1 < str2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
