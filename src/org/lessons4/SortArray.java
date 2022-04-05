package org.lessons4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) throws IOException {
        int[] ints = new int [] {0,1,2,3};
        //ex1(ints);
        ex2();
    }


    public static void ex1 (int[] ints) {
        boolean result = false;
        for(int i = 0; i < ints.length - 1; i++) {
            if (ints[i] < ints[i + 1])
                result = true;
            else {
                result = false;
                System.out.println("Please try again");
                break;
            }
        }
        if (result)
            System.out.println("OK");
        }

    public static void ex2() throws IOException {

        BufferedReader arrLength = new BufferedReader(new InputStreamReader(System.in));
        //String numb = ex.readLine();
        System.out.print("Array lenght:       ");
        int i = Integer.parseInt(arrLength.readLine());
        int[] intArray = new int[i];

        for (int j = 0; j < i; j++) {
           //int[i] = arrLength.readLine();
            BufferedReader arrNumb = new BufferedReader(new InputStreamReader(System.in));
            int k = Integer.parseInt(arrLength.readLine());
            intArray[j] = k;
        }
        System.out.println(Arrays.toString(intArray));



        }



    }
















    /*public static int[] bubbleSortedArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int aj = array[j];
                    int ai = array[i];
                    array [j] = ai;
                    array [i] = aj;

                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    */