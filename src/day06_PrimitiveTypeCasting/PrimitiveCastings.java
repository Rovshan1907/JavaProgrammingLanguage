package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {


byte a = 100;
short b = (short) a;
  // short b = (short) a
        // (short) a

        int c = b;  // implicint casting
        // int c = (int)b


        long d = c;

        // long d = (long)c

        float e = d;
        double f = e;

        int x = 55;
        short y = (short)x;
        System.out.println( x + " : " + y);

        System.out.println("-----------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;

    }




}
