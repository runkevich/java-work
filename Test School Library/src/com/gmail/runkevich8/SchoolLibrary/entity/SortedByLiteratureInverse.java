package com.gmail.runkevich8.SchoolLibrary.entity;

import java.util.Comparator;

public class SortedByLiteratureInverse implements Comparator<Pupils> {
    @Override
    public int compare(Pupils o1, Pupils o2) {
        int str1 = o1.getCurLiterature();
        int str2 = o2.getCurLiterature();

        if(str1 > str2) {
            return -1;
        }
        else if(str1 < str2) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
