package org.lessons6.ex3;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public String outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        return null;
    }

    public Car (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car () {

    }
}
