package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {


        Employee employee = null;



        try {
            System.out.println(employee.getSalary()); // Null Pointer Exeption

        }catch(IndexOutOfBoundsException e) {
            System.out.println("First catch block"); // first catch block trying catch fish we can tell
            e.printStackTrace();
        }catch(ArithmeticException e) {
            System.out.println("Second catch block"); // second trying
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("Third catch block"); // third catched
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("tested Completed");


        System.out.println("-----------------------------------------------------------------");

        try{
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }





    }
}
