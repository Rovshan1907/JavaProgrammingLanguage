package week01withOscar.week02withOscar;

public class CarInfo {

    public static void main(String[] args) {
     // I want to you give some example about your car which you will buy after find good paid job

     int year = 2022;
     String make = "Tesla";
     String model = "M3";
     // automatic = true; manual = false;
        boolean transmission = true;
        String color = "black";
        int milage = 0;
        int price = 100000; // for europe

        System.out.println(year+ " " +make+" "+model+"/nAutomatic transmission :"+transmission );
        System.out.println(color+"|"+milage+" kilometers|"+price+"Euros");

                // let's turn this value into TL 1 Euro = 15.5 Tl


        double priceInTl = price * 15.55;
        double taxRate = 1.80; // for this kind of car
        double priceAfterTaxInTl = priceInTl + (priceInTl*taxRate);
        System.out.println("priceAfterTaxInTl = " + priceAfterTaxInTl);
        // Variables are used, because it makes our data reusable and maintainable









    }





}
