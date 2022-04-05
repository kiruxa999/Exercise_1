package org.lessons3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) throws IOException {

        /*System.out.println("Задание 1");
        for (int i = 1; i <= 99; i++)
            if (i % 2 == 1) {
                System.out.println(i);
            }*/

        System.out.println("Задание 2");
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Делится на 3 и на 5: " + i);
            } else  if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0){
                System.out.println("Делится на 5: " + i);
            }



        /*//Задание 3
        BufferedReader ex = new BufferedReader(new InputStreamReader(System.in));
        //String numb = ex.readLine();
        System.out.print("Введите первое число:        ");
        int i = Integer.parseInt(ex.readLine());
        System.out.print("Введите второе число:        ");
        int y = Integer.parseInt(ex.readLine());
        System.out.print("Введите третье число:        ");
        int z = Integer.parseInt(ex.readLine());

        if (z == i + y){
            System.out.println("Результат    " + true);
        } else {
            System.out.println("Результат    " + false);
        }*/



        /*//Задание 4
        BufferedReader ex = new BufferedReader(new InputStreamReader(System.in));
        //String numb = ex.readLine();
        System.out.print("Введите первое число:        ");
        int i = Integer.parseInt(ex.readLine());
        System.out.print("Введите второе число:        ");
        int y = Integer.parseInt(ex.readLine());
        System.out.print("Введите третье число:        ");
        int z = Integer.parseInt(ex.readLine());

        if (y > i && z > y){
            System.out.println("Результат    " + true);
        } else {
            System.out.println("Результат    " + false);
        }*/


    }
}