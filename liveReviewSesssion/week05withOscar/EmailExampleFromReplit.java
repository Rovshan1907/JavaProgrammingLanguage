package week05withOscar;

import java.util.Scanner;

public class EmailExampleFromReplit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid email: craig_federighi@apple.com ");
        String email = input.next(); // mike_smith@gmail.com

        int indexof_ = email.indexOf("_");
        int indexofAtSign= email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        String firstName = email.substring(0,indexof_);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName); // Mike

        String lastName = email.substring(indexof_+1,indexofAtSign);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);



input.close();

    }
}
//Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
//
//        Example:
//
//
//        Input: craig_federighi@apple.com
//
//

//
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//
/*
Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a valid email:");
        String email = scan.nextLine();
        String first = email.substring(0,email.indexOf("_"));
        String second = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        first = first.toUpperCase().charAt(0) + first.substring(1).toLowerCase();
        second = second.toUpperCase().charAt(0) + second.substring(1).toLowerCase();

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("domain = " + domain);


 */