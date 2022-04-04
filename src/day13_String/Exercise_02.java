package day13_String;

import java.util.Scanner;
public class Exercise_02 {

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String string1 = scan.nextLine();
        System.out.println("Please enter a second one:");
        String string2 = scan.nextLine();

        System.out.println((string1.length() > string2.length()? string1: string2));


        scan.close();
        }
        }











/*public class Exercise_02 {
    public static void main(String[] args) {
        String input = "Juventus";
        String input2 = "";
        String [] a = input.split(" ");
        String [] b = input2.split(" ");
        int maxLength = 0;
        String longestString = null;
        for (String s : a){
            if (s.length() > maxLength){
                maxLength = s.length();
                longestString = s;
            }
        }
        System.out.println("Longest string: "+ longestString);

 */







/*
2. write a program that asks user to enter two strings, and print out the
longest string
 */