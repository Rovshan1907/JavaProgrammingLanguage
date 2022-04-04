package week04withOscar;

public class VendingNestedIf {


    public static void main(String[] args) {


        String selection = "drink";
        String selection1 = "coffee";
        String selection2 = "chips";

        if (selection == "drink"){
            System.out.println("drink option is selected");
            if(selection1 == "tea"){
                System.out.println("Tee item selected");
            }else if(selection1 == "coffee"){
                System.out.println("Coffee item selected");
            }
        } else if (selection == "snack") {

        }else{
            System.out.println("Invalid Entry");
        }







    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
========================================
 */