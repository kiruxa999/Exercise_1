package org.lessons5;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLessons {
    public static void main(String[] args) {

        String string1 = "Java";
        String string2 = new String("JavaJava");
        String string3 = "olololo";
        String string4 = "Java is not a бяка";
        String string6 = "sihT si a tset gnirts";


        strCheck(string1, string2);
        strPalindrom(string3);
        cenzCheck(string4);
        revStr(string6);
        indxStr(string1, string2);


    }

    //Упражнение 1
    public static void strCheck(String string1, String string2) {
        if (string1.length() > string2.length()) {
            System.out.println("Первая строка больше");
        } else {
            System.out.println("Вторая строка больше");
        }
    }

    //Упражение 2

    public static void strPalindrom(String word) {
        StringBuilder drow = new StringBuilder(word);
        String s = String.valueOf(drow.reverse());

        if (word.equals(s)) {
            System.out.println("palindrom");
        } else {
            System.out.println("ne palindrom");
        }

    }

    //Упражнение 3
    public static void cenzCheck(String text) {
        System.out.println(text.replace("бяка", "[Цензура]"));
        /*String bad = "бяка";
        String good = "Цезура";
        String [] checkwrd = text.split(" ");
        for (String s1 :checkwrd) {
            if (s1.equalsIgnoreCase(bad)){
                s1.replace(good, bad);
                System.out.println(s1);
            }
        }*/


    }

    //Упражнение 4
    public static void indxStr(String str1, String str2) {
        /*int a = 1447777;
        String intNum = String.valueOf(a);

        //получаем часть строки с помощью substring (или подстроку)
        System.out.println(intNum.substring(2)); //выводим данные со второго индекса
        System.out.println(intNum.substring(0, 4)); //выводим данные с нулевого индекса по четвертый*/

        /*boolean count = true;
        String str = new String(str1);
        String substr = new String(str2);
        if(str.contains(substr)){
            System.out.println(count);
        }*/

        int count = 0;
        Pattern pattern = Pattern.compile(str1);
        Matcher matcher = pattern.matcher(str2);
        do {
            count++;
        } while(matcher.find());
        System.out.println(count-1);
        }




    //Упражнение 5
    public static void revStr(String text) {
        String[] checkWrd = text.split(" ");
        StringBuilder drow = new StringBuilder();
        for (String s1 : checkWrd) {
            //System.out.println(s1);
            drow.append(new StringBuilder(s1).reverse().append(" "));

        }
        System.out.println(drow);


    }

}







               /* if (i == j){
                    System.out.println("Палиндром");
                } else {
                    System.out.println("не палиндром");
                }*/

                /*String [] wordnorm = word.split(" ");
                for (String s1 :wordnorm) {
                }
                */











