package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];


        for (int i = 0; i < numbers.length; i++) { //numbers later do  for i write for that



            if (numbers[i] > max){ // if tehre is element in the arrey thats greater than the current mac number

                max = numbers[i]; // assigning greater number to variable max

            }


        }

        System.out.println(max);





    }
}
/*

        for (int i = numbers.length - 1; i >= 0; i--) {

        }   this is for min we are using first write numbers later dot and later forr and r
 */