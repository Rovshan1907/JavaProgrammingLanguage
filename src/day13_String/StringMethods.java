package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String word = "Cydeo";
        // index =  01234

        char thirdChar = word.charAt(2);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("----------------------------------");


        String s1 = "Batch 25 is the best batch. Java Programming Language";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length() - 1); //last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();

        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentences = "Today is a great day to learn java programming language.";
        sentences = sentences.toUpperCase();
        System.out.println(sentences);

        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentences1 = "Today is a great day to learn java programming language.";
        sentences1 = sentences1.toLowerCase();
        System.out.println(sentences1);


        scan.close();

    }
}
