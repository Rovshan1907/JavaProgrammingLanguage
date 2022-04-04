package day20_Arrays;

import java.util.Arrays;

public class MonthTask {
    public static void main(String[] args) {


        String[] months = {"January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"};

        System.out.println(Arrays.toString(months));

        int num = 9;

        if ( num <1 || num > 12){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println( months[num-1]);

        System.out.println("------------------------------------------");

        for (int i = 0; i < months.length; i++) {
            System.out.println( months[i]);
        }


        System.out.println("------------------------------------------------------------");

        for (int i =  months.length-1; i >=0; i-- ){
            System.out.println(months[i]);
        }


    }
}
