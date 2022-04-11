package org.lessons6.ex3;

public class Truck extends Car{
    public int wheels;
    public int maxWeight;


    public int newWheels() {
        return this.wheels = 4;
    }


    public int newMaxWeight() {
        return this.maxWeight = 20000;
    }

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public String outPut() {
        super.outPut();
        System.out.println("Кол-во колес составляет - " + wheels + ", а максимальный вес - " + maxWeight);
        return null;

        //return "Кол-во колес составляет - " + wheels + ", а максимальный вес - " + maxWeight;
    }
}
