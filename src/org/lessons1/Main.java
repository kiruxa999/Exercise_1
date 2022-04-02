package org.lessons1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("JAVA.");


        int q = 46;
        int w = 10;
        int e = 3;
        int r = 29;
        int t = 4;
        int y = -15;
        System.out.println((q + w) * (w / e));
        System.out.println(r * t * y);


        int number = 10500;
        double result = (number * 1.0 / 10) / 10;
        System.out.println(result);

        double u = 3.6d;
        double i = 4.1d;
        double o = 5.9d;
        double resultFourEx = u * i * o;
        System.out.println(resultFourEx);


        //Задание 5

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        if (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        if (scanner.hasNext()) {
            System.out.println(scanner.next());
        }


        //Задание 6

        int b = scanner.nextInt();
        if (b > 100) {
            System.out.print("Выход за пределы диапазона");
        } else if (b > 0 && b % 2 == 0) {
            System.out.print("Четное");
        } else
            System.out.print("Нечетное");
    }
}
