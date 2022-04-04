package day09_IfStatements;

public class NumberToWord {

    public static void main(String[] args) {

   int n = 1; // 0 ~ 9

   String number;

   if(n == 0){
       System.out.println("Zero");
   }
   if(n == 1){
       System.out.println("One");
   }
   if(n == 2){
       System.out.println("Two");
   }
   if(n == 3){
       System.out.println("Three");
   }
   if(n == 4){
       System.out.println("Four");
   }
   if(n == 5){
            System.out.println("Five");
   }
   if(n == 6){
       System.out.println("Six");
   }
   if (n == 7){
       System.out.println("Seven");
   }
   if (n == 8){
       System.out.println("Eight");
   }
   if (n == 9){
       System.out.println("Nine");
   }

   // this way I did which I got also right answer

        System.out.println("----------------------------------------");


   // this is just example which in task solution group someone shared

   int number1 = 5;  // please type number between 0~9
        String word;

        if(number1==0){
            word = "zero";
        }
        else if (number1==1){
            word = "one";
        }
        else if(number1==2){
            word = "two";
        }
        else if(number1==3){
            word = "three";
        }
        else if(number1==4){
            word = "four";
        }
        else if(number1==5){
            word = "five";
        }
        else if(number1==6){
            word = "six";
        }
        else if(number1==7){
            word = "seven";
        }
        else if(number1==8){
            word = "eight";
        }
        else{
            word = "nine";
        }

        System.out.println("word = " + word);











    }
}
/*
1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
 */