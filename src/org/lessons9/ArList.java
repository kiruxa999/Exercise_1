package org.lessons9;

import java.util.*;

public class ArList {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(3);
        intArray.add(4);
        intArray.add(4);
        intArray.add(4);
        intArray.add(4);
        intArray.add(5);
        intArray.add(5);
        intArray.add(5);
        intArray.add(6);
        //System.out.println(intArray);

        //1 Упражнение
        copyRemoveMethod(intArray);

    }

    public static void copyRemoveMethod(List<Integer> set) {
        Set array = new HashSet(set);
        System.out.println(array);
        /*Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
        }*/
    }


}
