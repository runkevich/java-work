package com.gmail.runkevich8.Task1;

import java.util.*;

public class Main {

        public static void main(String[] args) {

            List<String> array = new ArrayList<>();
            Set<String> testSet = new HashSet<>();
            //Вводим данные в массив
            while (true){

                System.out.println("Вводите любые данные:");
                Scanner in = new Scanner(System.in);
                String line = in.nextLine();
                if (line.equals("stop")){
                    System.out.println(array);
                    //метод сортировки полученного массивы и вывод его на экран
                    fix(array);

                    //Переводим в хешсет , затем обратно  - для удаления дубликатов
                    testSet.addAll(array);
                    array.clear();
                    array.addAll(testSet);
                    System.out.println("Массив без дубликатов: "+ array.toString());
                    return;
                }
                array.add(line);
            }

        }

        private static List<String> fix(List<String> array) {

            for (int i = 0; i<=array.size()-1; i++){

                System.out.println( array.get(i).replace("a",""));
            }

            return array;
        }



}
