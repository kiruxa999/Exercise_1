package org.lessons2;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int z = calc.sum(1,2);
        System.out.println(z);

        double x = calc.sum(3.6d, 4.7d);
        System.out.println(x);

        long c = (long) calc.sum(3, 2);
        System.out.println(c);
    }


}
