package org.lessons5;

public class StringExample {
    public static void main(String[] args) {
        String string = "Java";
        /*String string2 = new String("Java");

        System.out.println(string);
        System.out.println(string2);

        System.out.println(string == string2); // так нельзя!
        System.out.println(string.equals(string2));// чтобы сравнить строки нужно использовать метод equals
        System.out.println(string.equalsIgnoreCase(string2)); // чтобы сравнивать строки и не обращать внимание на регистр*/

        string = string.concat("123"); // переопределям и склеиваем и это запись равна string = string + 123
        System.out.println(string);

        //split - можно преобразовать в массив строк


        //преобразование числа к строку
        int a = 1447777;
        String intNum = String.valueOf(a);

        //получаем часть строки с помощью substring (или подстроку)
        System.out.println(intNum.substring(2)); //выводим данные со второго индекса
        System.out.println(intNum.substring(0, 4)); //выводим данные с нулевого индекса по четвертый


        // стринбилдер далее
        StringBuilder builder = new StringBuilder();
    }
}
