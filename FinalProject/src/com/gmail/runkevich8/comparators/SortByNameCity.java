package com.gmail.runkevich8.comparators;

import com.gmail.runkevich8.entity.Schedule;

import java.util.Comparator;

public class SortByNameCity implements Comparator<Schedule>{
    @Override
    public int compare(Schedule o1, Schedule o2) {
        String str1 = o1.getLocationEnd();
        String str2 = o2.getLocationEnd();

        return str1.compareTo(str2);
    }
}
