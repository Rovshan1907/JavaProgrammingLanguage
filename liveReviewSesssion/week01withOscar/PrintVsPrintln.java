package week01withOscar;

public class PrintVsPrintln {

    public static void main(String[] args) {


        System.out.print("one");  // control +d, command +d
        System.out.println("two"); // print fist then go to the next line
        System.out.print("three");

        System.out.println("");

        System.err.println("two");


 /*
        \t : tab
        \n: takes it to next line
        \\ : prints \
        \" : prints "
         */

        System.out.println("Learn\tJava\n\tthe\nHard\tWay\n\n"); //   \H : illegal escape squence

        System.out.println("\tLearn JAVA the \" EASY WAY \" Way! \n\t\t With Oscar \\\\");

// second share for print


        System.out.print("One"); // CTRL + D , CMND+D
        System.out.println("Two"); // print first then go to the next line
        System.out.print("Three");

        System.err.println("Error Statement");

        // Single Line Commenting: it means, JAVA does not run these lines
        /*
        Whatever in between multiple comment lines or, block comment
         */


        // some important rules

        /*
    1. Your class name and file name has to be same
    2. At JAVA for every opening brackets "{","(","[" you need to have closing brackets "}",")","]" (balanced brackets)
    3. you need to have semi column at each line of code ";"
    4. You need to have main method to run your codes
     */



    }



}
