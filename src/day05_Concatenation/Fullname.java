package day05_Concatenation;

public class Fullname {

    public static void main(String[] args) {

   String firstName = "Rovshan";
   String lastName = "Ganbarov";
   int age = 45;
   String companyName = "Google_Inc";
   String jobTitle = "SDET";
   double salary = 12000.58;
   String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //Full name of the person is ____
        System.out.println("Full name of person is " + fullName);
        //is years old ___
        System.out.println(fullName + " is " + age +" years old");
        //fullName is JobTitle, works at  CompanyName, and FullName' saalry is salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                +", and "+fullName +"'s salary is $"+ salary );

    }




}
