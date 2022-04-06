package org.lessons4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ArrayThFour {
    public static void main(String[] args) throws IOException {
        //int[] ints2 = new int[]{5, 6, 7, 2, 7, 9};
        int[] ints3 = new int[]{1, 2, 3, 1, 2, 4};
        //System.out.println(ints2);
        //bubbleSortedArray(ints2);
        //System.out.println(Arrays.toString(bubbleSortedArray(ints2)));
        System.out.println(Arrays.toString(uniqNumb(ints3)));


    }


    public static int[] bubbleSortedArray(int[] array) {
        int i = array[0];
        int j = array[array.length - 1];
        array[0] = j;
        array[array.length - 1] = i;

        return array;
    }


    public static int[] uniqNumb(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int c = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    c++;
                }
            }
            if (c == 0){
                System.out.print(array[i] + " ");
                break;
                // если нужно чтобы все уникальные были - нужно поставить break в верхний if
            }
        }
        return array;
    }
}
