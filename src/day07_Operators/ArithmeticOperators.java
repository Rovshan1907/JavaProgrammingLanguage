package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

  int num1 = 10;
  int num2 = 3;

        int division = num1/num2; //divisable variable contains the result of number 1 divided by num2
        int remainder = num1%num2; //remainder variable contains the remainder of num1 divided num 2




  // 10 divide by 3 is equal to 3 with a reminder of 1

        System.out.println(num1 +" divided by " + num2 + " is equal to " + division + " with remainder of " + remainder );

// what is the remainder of 25 divided 4;

        System.out.println( 25 % 4 );

        // what is the remainder of 25 divided 5;

        System.out.println( 25 % 5 );





    }




}

/*
Arithmetic operators:
20 / 6 = 3
20.0 / 6 = 3.333....
10/2 = 5
10/3 = 3.3333...
remainder = numerator -(denominator * integer result) // do not forgot that formula
     10      - (3 * 3) = 1
     1/3 = 0.3333....
     10 % 3 ==> 1
     45 / 8 = 5.625
     45 - (8 * 5 ) =5
 */