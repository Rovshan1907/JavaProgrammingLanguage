package day05_Concatenation;

import java.sql.SQLOutput;

public class Calculator {

    public static void main(String[] args) {

    int firstNumber = 100;
    int secondNumber = 50;
               int addition = firstNumber + secondNumber;
               int subtraction = firstNumber - secondNumber;
               int cross = firstNumber * secondNumber;

        // 100 + 50 = 150
        // 100 - 50 = 50
        // 100 * 50 = 5000

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition );
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction );
        System.out.println(firstNumber + " * " + secondNumber + " = " + cross );



    }



}
