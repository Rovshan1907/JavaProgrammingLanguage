package day15_ForLoop;

import java.util.Locale;

public class FormatFullName {


    public static void main(String[] args) {

       String firstName = "rovSHan",
        lastName = "GANBAROV";

        //firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        firstName = ( "" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
//              "C"                                     ydeo   ==>    Cydeo
        System.out.println(firstName);

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);

// this is for change first character and last character one way we can use it



    }
}
