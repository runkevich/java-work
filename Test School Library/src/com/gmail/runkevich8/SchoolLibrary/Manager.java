package com.gmail.runkevich8.SchoolLibrary;

import com.gmail.runkevich8.SchoolLibrary.entity.*;

import java.util.*;

public class Manager {
    protected void firstTask(List<Literature> literatureList) {

        System.out.println("Литература доступная для чтения:");
        String array[] = new String[literatureList.size()];
        for(int j =0;j<literatureList.size();j++){
            array[j] = String.valueOf(literatureList.get(j).getName());
        }

		//Вывод на экран ArrayList
        for(String k: array)
        {
            System.out.println(k);
        }
    }

    protected void secondTask(List<Pupils> pupilsList) {

        Comparator<Pupils> sortByLiterature = new SortedByLiterature();
        Collections.sort(pupilsList, sortByLiterature);

        System.out.println("Отчет об учениках,которые прочитали больше 1 книги:");
        String nameP;
        int curL;
        Iterator<Pupils> iter =  pupilsList.iterator();
        while (iter.hasNext()) {
            Pupils s = iter.next();

            if ((s.getCurLiterature() == 1) || s.getCurLiterature() == 0 ){
                iter.remove();
            } else  {
                nameP = String.valueOf(s.getName());
                curL = s.getCurLiterature();
                System.out.println(nameP + " : " + curL);
            }
        }
    }

    protected void thirdTask(List<Pupils> pupilsList) {

        System.out.println("Отчет об учениках,которые прочитали меньше 2 книг с сортировкой по количеству прочитанного:");
        Comparator<Pupils> sortByLiteratureInverse = new SortedByLiteratureInverse();
        Collections.sort(pupilsList, sortByLiteratureInverse);

        String nameByLitInv;
        int curByLitInv;
        Date dateByLitInv;

        Iterator<Pupils> iter =  pupilsList.iterator();
        while (iter.hasNext()) {
            Pupils s = iter.next();

            if (s.getCurLiterature() >= 2) {
                iter.remove();
            } else {
                nameByLitInv = String.valueOf(s.getName());
                curByLitInv = s.getCurLiterature();
                dateByLitInv = s.getBd();
                System.out.println(nameByLitInv + " " + dateByLitInv + " : " + curByLitInv);
            }

        }
    }

    public void thirdTask2(List<Pupils> pupilsList) {

        System.out.println("Отчет об учениках,которые прочитали меньше 2 книг с сортировкой по возрасту (от младших в старшим)");
        Comparator<Pupils> sortByDate = new SortedByDate();
        Collections.sort(pupilsList, sortByDate);
        String nameByLitInv;
        int curByLitInv;
        Date dateByLitInv;

        Iterator<Pupils> iter =  pupilsList.iterator();
        while (iter.hasNext()) {
            Pupils s = iter.next();

            if (s.getCurLiterature() >= 2) {
                iter.remove();
            } else {
                nameByLitInv = String.valueOf(s.getName());
                curByLitInv = s.getCurLiterature();
                dateByLitInv = s.getBd();
                System.out.println(nameByLitInv + " " + dateByLitInv + " : " + curByLitInv);
            }

        }
    }
}

