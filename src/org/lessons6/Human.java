package org.lessons6;

public abstract class Human {
    public String name;
    public String sename;


    public String Human(String name, String sename) {
        this.name = name;
        this.sename = sename;
        return name + sename;
    }

    public String nameHuman() {
        this.name = name;
        return null;
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
