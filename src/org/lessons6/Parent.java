package org.lessons6;

public interface Parent {
    /*public static final String NAME = "name";

    public abstract void printTransportInfo();

    public abstract String transportName();

    //default - метод по дефолту*/

    public static final String name = "Ivan";
    public static final String sename = "Ivanov";

    public abstract String infoNameSename();
        //System.out.println("Это из интерфейса выгрузилось" + name + sename);
}
