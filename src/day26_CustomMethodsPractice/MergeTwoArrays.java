package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        int[] arr3 = merge(arr1, arr2);

        System.out.println(Arrays.toString(arr3));

    }

    public static int[] merge(int[] arr1, int[] arr2){ // giving two array there
        int[] result = new int[arr1.length + arr2.length]; // 1234 and 5678 plus

        int i= 0;

        for (int each : arr1) { // for each array giving each result here ++ means 1
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }


}