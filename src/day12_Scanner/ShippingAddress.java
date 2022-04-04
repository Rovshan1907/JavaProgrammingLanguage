package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your full name");
        String name = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.next();

        System.out.println("Enter your Zip Code");
        String zipCode = scan.next();



        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);


        System.out.println( name + " "  + " " + buildingNumber + " " + " " + streetName +" "
                + cityName +  " "  + stateName + " " + zipCode  );



        scan.close();
    }
}
