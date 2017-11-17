import java.util.Arrays;

public class Main {

    public static void main (String[] arg) {
        int[] array = {4, 9, 2, 8, 19, 4, 7, 3, 1, 10};      // Задание №1
        int min = array[0];
        int max = array[0];
        int indexMin = 0, indexMax = 0;
        for (int i = 0; i < array.length; i++) {
                if (min > array[i]){
                    min = array[i];
                    indexMin = i;
                }
                if (max < array [i]){
                    max = array[i];
                    indexMax = i;
                }
        }

        array[indexMin] = 0;
        array[indexMax] = 99;
        System.out.println("min value = " + min);
        System.out.println("min value = " + max);
        System.out.println(Arrays.toString(array));
        System.out.println(" ");


        float [] array2 = {1, 7, 3, 9, 7, 10, 7, 3};

        int count = 0;
        float a;
        for (int i = 0; i < array2.length; ++i){
            for (int j = 0; j < array2.length; ++j) {

                if (array2[i] == array2[j] && j!=i) {

                    a = array2[j];
                    count++;
                    System.out.println(a);
                    break;
                }
            }
        }
      // System.out.println(array2[i]);
        System.out.println("Повторений всего - " + count);

    }
}
