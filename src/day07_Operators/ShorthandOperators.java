package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

  //assignment;
  int number =100;
        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); //200

        String word = "Java Programming";
        System.out.println("word = " + word); // "Java Programming"

        word = "Wodden Spoon";
        System.out.println("word = " + word);  //"Wodden Spoon"
        word = "Cydeo";
        System.out.println("word = " + word); // "Cydeo"
        //word=123; we can not use like so
        word = "Java Programming";

        System.out.println("word = " + word);
        System.out.println("____________________________________________");

        //addition assignment;
        int x = 100;
        System.out.println("x = " + x);
        System.out.println( x + 200); // 300
        System.out.println("x = " + x);
        x = x + 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += "Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
          System.out.println("num1 = " + num1); // 2.5

          num1 += 5.5;
          System.out.println("num1 = " + num1); //8.0


          double availableBalance = 1000.50;

          // deposit 300$
          availableBalance += 300;
          System.out.println("availableBalance = " + availableBalance); // 1300.50

          System.out.println("_________________________________");

          // withdrawing 500$;
          availableBalance -= 500;
          System.out.println("availableBalance = " + availableBalance);

          // withdrawing 200$ and later depositing 500$

          availableBalance -= 200;
          availableBalance += 400;

          System.out.println("availableBalance = " + availableBalance);

          System.out.println("__________________");

          double salary = 50000.50;
          System.out.println("salary = " + salary);
          salary *= 2;
          System.out.println("salary = " + salary);
          double doge = 0.00000001;
          doge *= 1000000;
          System.out.println("doge = " + doge);
          System.out.println("---------------------------");
          double num2 = 25000;
          num2 /= 2;
          System.out.println("num2 = " + num2);
          System.out.println("-----------------------------");
          double num3= 100;
          num3 %= 3;
          System.out.println("num3 = " + num3);
          System.out.println("--------------------------");
          int amount = 127; // cent
          int quarters = amount / 25;
          int cents = amount % 25;
          System.out.println("quarters = " + quarters);
          System.out.println("cents = " + cents);
          System.out.println("----------------------------");
          int cent2 = 127;
          cent2 %= 25;
          System.out.println("cent2 = " + cent2);

          System.out.println("----------------------------");
          int y = 300;
          y %= 16;
          System.out.println("y = " + y);
          System.out.println("-----------------------");
          int balance = 3500;
          // insurance fee = 153$;
          balance %= 153;
          System.out.println("balance = " + balance);














    }



}
