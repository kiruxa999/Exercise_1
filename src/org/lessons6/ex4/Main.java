package org.lessons6.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Как пример
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.printf("Your number: %d \n", num);*/

        Child child = new Child();
        System.out.println(child.num);
        System.out.println(child.outPut());
    }

}
