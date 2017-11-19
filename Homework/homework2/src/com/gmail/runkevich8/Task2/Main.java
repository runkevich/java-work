package com.gmail.runkevich8.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static ArrayList<Float> el = new ArrayList<Float>();      //чисто для сохранения элементов которые уже были проверены
    public static void main (String[] args) {
        float[] array = {1, 2, 3, 5, 3, 8, 8, 1, 3, 2};           //пример массива
        float element = 0;                                                                             //сохраняем элемент для вывода
        int count = 0;
        //сохоаняем колличество совпадений для вывода
        for (int i = 0; i < array.length; i++) {                                                  //тут считаем элемены
            if (c_element(array[i])) {
                for (int j = 0; j < array.length; j ++) {
                    if (array[i] == array[j]) {
                        count++;
                        element = array[j];
                        el.add(array[i]);
                    }
                }
            }
            if (count > 1) System.out.println("[" + element + "]"+ " - повторений "+ count);  //если совпадений больше 1 то выводим на экран
            count = 0;                                                                                    //тут сбрасываем счетчик
        }
    }
    private static boolean c_element (float arr_i) {               //тут бует проверка элемента, считали ли мы его?
        for (int k = 0; k < el.size(); k++) {
            if (arr_i == el.get(k)) return false;
        }
        return true;
    }
}

