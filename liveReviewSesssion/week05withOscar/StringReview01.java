package week05withOscar;

public class StringReview01 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1 == str2); // true: the reason str1 and str2 are pointing the same object

        String str3 = new String("Java");
        System.out.println(str1 == str3); // false: The reason str1 and str3 are pointing different object


        //what does equals() method do? it is checking for the value of the project

        System.out.println((str1.equals(str3))); // true

        String str4 = new String("JAVA");
        //if you want to check without case sensitivity
        // equalsIgnoreCase
        System.out.println(str2.equalsIgnoreCase(str4));


    }
}
