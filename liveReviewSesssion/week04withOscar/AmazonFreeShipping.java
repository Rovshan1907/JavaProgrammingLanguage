package week04withOscar;

public class AmazonFreeShipping {


    public static void main(String[] args) {

        int totalPrice = 65;
        if (totalPrice >= 35) {
            System.out.println("Free Shipping Eligible");
        } else {
            System.out.println("Free Shopping is NOT Eligible");
        }


        System.out.println("Thanks for shopping with us !");

        System.out.println("-------------------------------");
        double totalPrice1 = 55.50;

        if (totalPrice1 >= 25.0) {
            System.out.println("FREE Shipping eligible. Your order total : $ " + totalPrice);
        } else {
            System.out.println("NOT Eligible for free shipping : $ " + totalPrice);
        }

        System.out.println("Thanks for shopping with us !");

    }
}
/*
add a class AmazonFreeShipping
add main method
assign double value to totalPrice variable

if totalPrice is more than or equal to 25
print "FREE SHIPPING ELIGIBILE. Your order total: $55"
ELSE
print "NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. less than minimum of $25"
 */