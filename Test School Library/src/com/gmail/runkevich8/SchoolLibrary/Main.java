package com.gmail.runkevich8.SchoolLibrary;

import com.gmail.runkevich8.SchoolLibrary.entity.Literature;
import com.gmail.runkevich8.SchoolLibrary.entity.Pupils;
import com.gmail.runkevich8.SchoolLibrary.entity.SortedByLiterature;
import javafx.collections.transformation.SortedList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        List<Literature> literatureList = new ArrayList<>();

        literatureList.add(new Literature("Book1"));
        literatureList.add(new Literature("Book2"));


        List<Pupils> pupilsList1 = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        pupilsList1.add(new Pupils("Вася",format.parse("1994-11-29"), 5));
        pupilsList1.add(new Pupils("Соня",format.parse("1999-12-10"),4));
        pupilsList1.add(new Pupils("Катя",format.parse("1996-02-08"),3 ));
        pupilsList1.add(new Pupils("Лола",format.parse("1999-02-08"),1 ));
        pupilsList1.add(new Pupils("Оля",format.parse("1999-12-10"),0));

        List<Pupils> pupilsList2 = new ArrayList<>();
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        pupilsList2.add(new Pupils("Вася",format.parse("1994-11-29"), 5));
        pupilsList2.add(new Pupils("Соня",format.parse("1999-12-10"),4));
        pupilsList2.add(new Pupils("Катя",format.parse("1996-02-08"),3 ));
        pupilsList2.add(new Pupils("Лола",format.parse("1995-02-08"),1 ));
        pupilsList2.add(new Pupils("Оля",format.parse("1999-12-10"),0));



        Manager manager = new Manager();
        manager.firstTask(literatureList);
        manager.secondTask(pupilsList1);
        manager.thirdTask(pupilsList2);
        manager.thirdTask2(pupilsList2);

    }
}
