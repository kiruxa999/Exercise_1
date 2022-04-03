package org.lessons3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

       //Задание 5
        //определяем длину массива
        int[] intArray = new int[7];
        //добавляем в массив
        intArray [0] = 3;
        intArray [1] = 1;
        intArray [2] = 2;
        intArray [3] = 3;
        intArray [4] = 4;
        intArray [5] = 5;
        intArray [6] = 3;
        System.out.println("Массив   " + Arrays.toString(intArray));
        if (intArray [0] == intArray [5]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Задание 6

        int [] intArray2 = new int[] {0,1,2,3,4,5,6,7,8,9};
        for (int i : intArray2) {
            if(i == 3 || i == 1) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }




        /*
        //для обращения по индексу
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        // через foreach, когда не нужно обращать по индексу в массиве
        //это только для обращения ко всем элементам в массиве
        for (int i : intArray) {
            System.out.println(i);
        }*/


    }
}
