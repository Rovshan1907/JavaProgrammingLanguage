package day05_Concatenation;

public class ShippingAddress {


    public static void main(String[] args) {

/*
String name = "James";
String buildingNumber = "1123B"
 */

        String name = "James King",
                buildingNumber = "1123B",
        streetName = "Osmanczyka",
                city = "Warsaw",
                state = "Poland",
                zipCode = "01-494";

        //  System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state +" " + zipCode );
 System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state +" " + zipCode );
        System.out.println(name + "\n" + buildingNumber + " " + streetName + "/n" + city +", " + state +" " + zipCode );



    }



}

/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
3. Use concatenation to print the full address
 */