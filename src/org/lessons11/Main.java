package org.lessons11;

import com.sun.istack.internal.localization.NullLocalizable;

import javax.print.DocFlavor;
import java.io.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Ex 1
        File file = new File("filesForLessons11/textJava.txt");
        //consoleReader(file);

        //Ex 2
        String q = " Java is the best one";
        //consoleWriter(q);

        //Ex 3
        File file1 = new File("filesForLessons11/textJava.txt");
        File file2 = new File("filesForLessons11/textJavaToWrite.txt");
        File file3 = new File("filesForLessons11/textJavaGlue.txt");
        //consoleGlue(file1, file2, file3);

        //Ex 4
        changeSymbol(file);


    }

    //1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static void consoleReader(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = null;
            while((input = reader.readLine()) != null){
                System.out.println(input);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    //2.	Написать метод, который записывает в файл строку, переданную параметром.
    public static void consoleWriter(String str) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("filesForLessons11/textJavaToWrite.txt"))) {
            writer.write(str + "\n");
            System.out.println(str);

        /* for (String s : str) {
        }*/
        /*for (int i = 0; i < str.length(); i++) {
            //writer.write(str + "\n");
            System.out.println(str);
        }*/
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



    //3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
    public static void consoleGlue (File file1, File file2, File file3){
        /*try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String input1 = null;
            while((input1 = reader.readLine()) != null){
                System.out.println(input1);
            }
            try (BufferedReader reader2 = new BufferedReader(new FileReader(file2))){
                String input2 = null;
                while((input2 = reader.readLine()) != null){
                System.out.println(input2);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }*/

        InputStream is1 = null;
        InputStream is2 = null;
        OutputStream os = null;

        try{
           is1 = new FileInputStream(file1);
           is2 = new FileInputStream(file2);
           os = new FileOutputStream(file3);

           while (is1.available() > 0){
                os.write(is1.read());
           }

           while (is2.available() > 0){
               os.write(is2.read());
           }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (is1 != null && is2 != null && os != null){
                    is1.close();
                    is2.close();
                    os.close();
                }
            } catch (IOException e){
                System.out.println( e.getMessage());
            }
        }

    }

    public static void changeSymbol (File file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = null;
            while((input = reader.readLine()) != null){
                /*System.out.println(input.replace(" ", "$")
                                        .replace(",", "$")
                                        .replace("—", "$")
                                        .replace("(", "$")
                                        .replace(")", "$")
                                        .replace(".", "$")
                                        .replace(";", "$")
                                        .replace("-", "$")
                );*/
                System.out.println(input.replaceAll("[^а-яА-Яa-zA-Z\\d]", "\\$"));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
