package org.lessons9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Random {
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


    }

    public static void arrayVsLinked (List <Integer> AnyArray) {
        Random rand = new Random();
        int numberOfElements = 100000;
        for (int o = 0; o < numberOfElements; o++) {
            int randomIndex = rand.nextInt(AnyArray.size());
            int randomElement = AnyArray.get(randomIndex);
        }
        System.out.println(numberOfElements);
    }
}




