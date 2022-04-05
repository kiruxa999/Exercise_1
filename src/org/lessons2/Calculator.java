package org.lessons2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Calculator {

    //public static void main(String[] args) throws IOException {
        //числа считываем
        //BufferedReader calc = new BufferedReader(new InputStreamReader(System.in));
        //String numb = calc.readLine();

        /*double i = Integer.parseInt(numb);
        double y = Integer.parseInt(calc.readLine());
        double z = i + y;
            System.out.println(z);*/




        // int значение
        public int sum(int x, int y){

            return x + y;
        }
        public int raz(int x, int y){

            return x - y;
        }
        public int umn (int x, int y){

            return x * y;
        }
        public double del (int x, int y){

            return x / y;
        }

        // double вводим
        public double sum(double x, double y){
            return x + y;
        }
        public double raz(double x, double y){
            return x - y;
        }
        public double umn (double x, double y){
            return x * y;
        }
        public double del (double x, double y){
            return x / y;
        }

        // вводим long

        public long sum(long x, long y){
            return x + y;
        }
        public long raz(long x, long y){
            return x - y;
        }
        public long umn (long x, long y){
            return x * y;
        }
        public double del (long x, long y){
            return x / y;
        }
    }


