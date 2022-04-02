package org.lessons2;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car();
        System.out.println(bmw);

        // Устанавливаем параметры класса
        bmw.setColour("Red");
        bmw.setHorsePower(100);

        //устанавливаем стринг переменную колор и заабираем с помощью гет информацию и выводим с помощью принт
        String colour = bmw.getColour();
        System.out.println(colour);

        int horsePower = bmw.getHorsePower();
        System.out.println(horsePower);

        bmw.setColour("White");
        String color2 = bmw.getColour();
        System.out.println(color2);



        System.out.println("делаем новое авто - mers");
        Car mers = new Car();
        mers.setColour("Black");
        mers.setHorsePower(150);
        System.out.println(mers);

        mers.setColour(bmw.getColour());
        System.out.println(mers);

        // ДЛЯ ПРОВЕРКИ
        //ExlusiveCar fer = new ExlusiveCar();


        //Закрепляю материал
        Car audi = new Car();
        audi.setColour("Red");
        audi.setHorsePower(200);
        System.out.print(audi);
        System.out.print(audi.infoCar());
    }
}
