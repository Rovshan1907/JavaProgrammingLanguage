package week05withOscar;

import java.util.Scanner;

public class Replit_Quiz_Question {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String result = input.nextLine();

        // your code

        switch(result){
            case"a":
                System.out.println("a iss wrong");
                break;
            case "b":
                System.out.println("b is correct");
                break;
            case "c":
                    System.out.println("c is wrong");
                    break;
            default:
                System.out.println(result+ "is not valid answer");


        }


input.close();



      /*
        if(result.equals("a")){
            System.out.println(result+ "is wrong");
            else if(result.equals( "b"))
                System.out.println(result+"is correct");
            else if(result.equals( "c"))
            System.out.println(result+"is wrong");
            else
            System.out.println(result+"is not valid answer");
        }



       */

    }
}
/*In the given program you have a quiz question and a scanner to get the user input which will be stored on string **a**.

        after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, or invalid answer.

        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune

        a

        a is wrong
        ```

        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune

        b

        b is correct
        ```

        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune

        c

        c is wrong
        ```

        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune

        z

        z is not a valid answer
        ```*/
