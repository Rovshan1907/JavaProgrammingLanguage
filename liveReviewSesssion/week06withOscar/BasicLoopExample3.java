package week06withOscar;

public class BasicLoopExample3 {
    public static void main(String[] args) {

       int countOfEven=0;
       for(int i=5; i<=50;i++){
           if(i%2==0){
               ++countOfEven;
           }
       }

        System.out.println("Count Of Even numbers between 5 and 50 = " + countOfEven);


    }
}
/*
         * Question-3:

            Write a program that displays
            the number of even numbers between 5 and 50 (included)
            * asking how many?

         */