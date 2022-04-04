package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch = 'B';

        switch(ch){

            case 'A':
                System.out.println("Excelent");
                break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");

                System.out.println(ch);


        }





    }
}
// i can use also that like String result