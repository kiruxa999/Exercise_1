package org.lessons6;

public class ClientInterface implements Parent{

    @Override
    public String infoNameSename() {
        return "Это из интерфейса выгрузилось" + " " + name +  " " + sename;
    }
}
