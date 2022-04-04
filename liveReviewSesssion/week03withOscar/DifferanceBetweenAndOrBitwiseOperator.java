package week03withOscar;

public class DifferanceBetweenAndOrBitwiseOperator {

    public static void main(String[] args) {

       int i1 = 5;
       int i2 = 10;

        System.out.println(true | false); // true

        System.out.println(true || false); // true again, but does not check the second part of statement

        System.out.println(true | i1>i2); // that means also true

        System.out.println(i2>i1 || ++i1>i2);
        System.out.println("i1 = " + i1);  //  we will get 5

        boolean a = i2<i1  && ++i1<i2;  //  false  && true bitwise and operator ;  if the first statement is false,  DOES NOT check the second statement
        System.out.println("a = " + a);
        System.out.println("i1 = " + i1); //5






    }
}
/*
& - (Condition 1 & Condition 2): checks both cases even if first one is false

&& - (Condition 1 && Condition 2): dosen't bother to check second case if case one is false

&& - operator will make your code run faster, professionally & is rarely used

| - (Condition 1 | Condition 2): checks both cases even if case 1 is true

|| - (Condition 1 || Condition 2): dosen't bother to check second case if first one is true

|| - operator will make your code run faster, professionally | is rarely used

 */