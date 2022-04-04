package day13_String;

public class Exercise_01 {
    public static void main(String[] args) {

        String str = "Ali ata bak yaz";

        int n = str.length();// finding string length
        char first = str.charAt(0); // later first character of string
        char last = str.charAt(n - 1); //  second characters of string
        System.out.println("first = " + first);// print first and last
        System.out.println("last = " + last);





    }
}
/*
1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */