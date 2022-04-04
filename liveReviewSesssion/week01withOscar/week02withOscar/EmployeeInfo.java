package week01withOscar.week02withOscar;

public class EmployeeInfo {

    public static void main(String[] args) {



       String name, companyName , jobTitle;
       name = "Rovshan";
       companyName = "Google";
       // String jobTitle = "Instructor"; // can NOT double declare, will give compiler error
        jobTitle = "Account Strategist";
        char gender = 'M';
        int employeeId = 1234;
        boolean hasBenefits = true;
        char isMarried = 'Y';
        System.out.println("name = " + name);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("gender = " + gender);
        System.out.println("employeeId = " + employeeId);
        System.out.println("hasBenefits = " + hasBenefits);
        System.out.println("isMarried = " + isMarried);

        System.out.println("------------------------------------");

        System.out.print(name+"\n"+companyName+"\n"+jobTitle+"\n"+jobTitle+"\n"+gender+"\n");
        System.out.print(employeeId+"\n"+hasBenefits+"\n"+isMarried);







    }





}
/*
 * name
 * companyName ----- camelCase  first letter starts small, second one starts Capital
 * jobTitle
 * gender --- char  M/F
 * salary  ---  double
 * employeeID  -- int
 * hasBenefits(Y/N) --- boolean  true/false
 * isMarried --- char  Y/N
 */
