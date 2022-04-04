package week03withOscar;

public class EvenOrOdd {

    public static void main(String[] args) {

        // task; find if a given integer is even number or odd number
        // hint; use % operator , and control flow statement

        int number = 0;

        boolean condition = number%2==0;

        if(condition){
            System.out.println("The number is EVEN");
        }else{
            System.out.println("The number is ODD");
        }



    }
}
