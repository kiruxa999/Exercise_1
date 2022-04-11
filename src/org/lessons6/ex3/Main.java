package org.lessons6.ex3;

public class Main {
    public static void main(String[] args) {

        Car someCar = new Car(1500, "bmw", 'B', 200);
        someCar.outPut();
        System.out.println(" --------------------------- ");

        Truck conWheels = new Truck(10000, "Man", 'W', 150, 6, 20000);
        System.out.println(conWheels.newWheels());
        System.out.println( " -------------------------- ");
        System.out.println(conWheels.outPut());



    }
}
