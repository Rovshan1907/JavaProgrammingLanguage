package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

      char ch = 'A';


      switch(ch){

          case 'A':
              System.out.println("Passed");
              break;

          case 'B':
              System.out.println("Passed");
              break;

          case 'C':
              System.out.println("Passed");
              break;

          case 'D':System.out.println("Passed");
              break;

          default:
              System.out.println("Failed");
      }

        System.out.println(ch);


    }
}
/*
char ch = 'E';
        String result = "";
        //  ||
        switch (ch){

            case 'A': case 'B': case 'C': case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);
 */