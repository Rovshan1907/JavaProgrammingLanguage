package week03withOscar;

public class UnaryReview {


    public static void main(String[] args) {

        int a = 20;

        System.out.println("a++ = " + a++); // 20
        System.out.println("a = " + a);  // 21

        int b = 20;
        System.out.println("++b = " + ++b); // 21 increase by 1 then use the variable

        int c = 20;
        System.out.println(++c + 1);  // 22

        boolean isMarried = true;
        System.out.println("isMarried = " + !isMarried); // not operator


        int x = 12;
        if(++x>12){  // pre - increament operator
            System.out.println("x in the IF statement part : "+ x);
        }else{
            System.out.println("x value in the ELSE statement"+ x);
        }


        int y = 12;  // post- increament operator
        if(y++>12){  // pre - increasing
            System.out.println("y in the IF statement part : "+ y);
        }else{
            System.out.println("y value in the ELSE statement "+ y);
        }

    }
}
