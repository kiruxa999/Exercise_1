package org.lessons6.ex1and2;

public abstract class Human {
    public String name;
    public String sename;

//конструктор
    public Human(String name, String sename) {
        this.name = name;
        this.sename = sename;

    }

    public String nameHuman() {

        return name;
    }

    public String senameHuman(){
        this.sename = sename;
        return null;
    }

    //Абстрактный метод, в классе наследнике переопределить метод и объявить там логику
    public abstract String allInfo();




    /*private String humanNameAndSernameMethod(){
        return this.name + " " + sename;
    }*/


}
