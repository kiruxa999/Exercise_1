package org.lessons6.ex4;

public class Child extends Parent{

    @Override
    public void outPut() {

        System.out.println("Я прибавил 1. У Вас получилось \n" + (super.num + 1));

    }
}
