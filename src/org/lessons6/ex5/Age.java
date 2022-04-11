package org.lessons6.ex5;

import java.io.IOException;
import java.util.Scanner;


public class Age {
    int num;

    public void outAge () throws IOException {

        Scanner a = new Scanner(System.in);
        System.out.println("Введите Ваш возраст:");
        num = a.nextInt();
    }
}

/*public Age() throws IOException {
        BufferedReader ageLength = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст ");
        String a = ageLength.readLine();
    }*/
