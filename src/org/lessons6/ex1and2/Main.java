package org.lessons6.ex1and2;

public class Main {

    public static void main(String[] args) {

        //Создаем клиента с помощью наследуемых методов из класса Human
        Client client = new Client("Ivan", "Ivanov", "Sber");
        System.out.println(client.nameHuman());
        System.out.println(client.senameHuman());
        System.out.println(client.bank);
        client.allInfo();

        BankHuman bankHuman = new BankHuman("Petr", "Petrov", "Alfa");
        String s = bankHuman.nameHuman();
        System.out.println(s);
        bankHuman.allInfo();

        //Делаем через интерфейс - 2 задание. Общие параметры у нас Имя и Фамилия
        Parent clientInter = new ClientInterface();
        System.out.println(clientInter.infoNameSename());

    }



}
