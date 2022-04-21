package org.lessons9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Any {
    public static void main(String[] args) {
        List<Integer> intArray1 = new ArrayList<>();
        int i = 1000000;
        for (int j = 0; j < i; j++) {
            intArray1.add(j);
        }
        //System.out.println(intArray1);

        List<Integer> intLinked = new LinkedList<>();
        int k = 1000000;
        for (int j = 0; j < k; j++) {
            intLinked.add(j);
        }
        //System.out.println(intLinked);

        long start = System.nanoTime();
        arrayVsLinked(intArray1);
        long finish = System.nanoTime();
        long dif = finish - start;
        System.out.println("Время Array - " + dif);


        /*long start1 = System.nanoTime();
        arrayVsLinked(intLinked);
        long finish1 = System.nanoTime();
        long dif1 = finish1 - start1;
        System.out.println("Время Linked - " + dif1);*/



    }

    public static void arrayVsLinked (List <Integer> AnyArray) {
        Random rand = new Random();
        int numberOfElements = 100000;
        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = rand.nextInt(AnyArray.size());
            int randomElement = AnyArray.get(randomIndex);
            System.out.println(randomElement);
        }
        //System.out.println(numberOfElements);
    }
}




