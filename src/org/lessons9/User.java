package org.lessons9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class User {
    public static void main(String[] args) throws IOException {

        // user -  ключ, а int - значение
        Map<User, Integer> map = new HashMap<>();
        User john = new User("John");
        john.setName("John");
        User jack = new User("Jack");
        jack.setName("Jack");
        User bob = new User("Bob");
        bob.setName("Bob");
        map.put(john, 20);
        map.put(jack, 30);
        map.put(bob, 40);

        //Scanner scan = new Scanner(System.in);

        BufferedReader ex = new BufferedReader(new InputStreamReader(System.in));
        String scanner = ex.readLine();
        Set<User> keys = map.keySet();
        System.out.println(keys);


        Integer getResult = getResultFromKey(map, scanner);
        System.out.println("Количество очков у данного имени - " + getResult);
    }

    private static Integer getResultFromKey(Map<User, Integer> map, String scanner) {
        Integer result = null;
        for (Map.Entry<User, Integer> pair : map.entrySet()){
            User key = pair.getKey();
            Integer value = pair.getValue();
            if(key.equals(scanner)){
                result = value;
            }
        }
        return result;
    }


    private String name;

    @Override
    public String toString() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
