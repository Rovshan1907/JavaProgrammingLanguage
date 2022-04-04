package week12withOscar;

public class StaticMethods {
    public int num = 10;

    public static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
      //  System.out.println(num); u will get error here cuz of instance can not be called from static method has many copys num which one i am gonne print out
    }

    public void instanceMethod(){
        System.out.println("count = " + count); // i can call static field from isntance method


        System.out.println("num = " + num);
        displayMessage("hello from instance method");


    }



}
