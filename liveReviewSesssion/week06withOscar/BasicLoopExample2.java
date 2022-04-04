package week06withOscar;

public class BasicLoopExample2 {
    public static void main(String[] args) {

        for(int i = 3; i < 130 ; i += 2){
            System.out.print(i+" ");
        }
        for (int i = 3; i<=130 ; i++) {
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }



    }
}
/**
 * Question-2:

 Write a program that
 displays all odd numbers between 3-130
 in the same line
 we can do also that method
 for (int i = 3; i<=130 ; i++) {
 if (i%2!=0){
 System.out.print(i+ " ");
 }
 }
 */