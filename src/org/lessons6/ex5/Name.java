package org.lessons6.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name extends Age{
    String name;

    @Override
    public void outAge() throws IOException {
        super.outAge();
        BufferedReader nameLength = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Ваше имя:");
        String b = nameLength.readLine();

        //setNum(Integer.parseInt(name));
    }



}
