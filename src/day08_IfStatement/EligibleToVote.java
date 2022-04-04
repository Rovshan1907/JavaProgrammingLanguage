package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

   String name = "Josh";
   int age = 38;
   String citizen = "USA";


   boolean isEligible = age >= 21 && citizen == "Usa";


       // Eligible
if(isEligible){
    System.out.println("Eligible");
}
if(!isEligible){  //!true means is not true that means false
    System.out.println("Not Eligible");

}



        //Not Eligible




    }




}
