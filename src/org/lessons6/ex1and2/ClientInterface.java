package org.lessons6.ex1and2;

public class ClientInterface implements Parent{

    @Override
    public String infoNameSename() {
        return "Это из интерфейса выгрузилось" + " " + name +  " " + sename;
    }
}
