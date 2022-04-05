package org.lessons2;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int u = calc.sum(15,25);
        System.out.println(u);

        int p = calc.raz(15,25);
        System.out.println(p);

        double z = calc.del(15d,25d);
        System.out.println(z);

        double x = calc.sum(3.6d, 4.7d);
        System.out.println(x);

        double c = calc.sum(9223372036854L, 9223372036854L);
        System.out.println(c);
    }


}
