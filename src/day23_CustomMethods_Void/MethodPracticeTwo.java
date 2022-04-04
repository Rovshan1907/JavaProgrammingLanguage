package day23_CustomMethods_Void;

public class MethodPracticeTwo {

    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("-------------------------------");

       helloCydeo5Times();

        System.out.println("-------------------------------");

       evenNumbers();

    }

    // create a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }


    }




    //create a fuction that can print hello cyde 5 times ==> helloCydeo5Times()
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }
    }




    //create a fuction taht can print all the even numbers from 1`10 ==> evenNumbers

    public static void evenNumbers(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }





}
