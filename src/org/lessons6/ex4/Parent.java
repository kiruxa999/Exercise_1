package org.lessons6.ex4;

import java.util.Scanner;

public class Parent {
    int num = 5;

    public void outPut () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число \n");
        System.out.println("Ваше число равно " + num);

    }

}
