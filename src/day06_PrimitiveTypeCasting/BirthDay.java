package day06_PrimitiveTypeCasting;

import java.sql.SQLOutput;

public class BirthDay {

    public static void main(String[] args) {


String name = "Jhon";
int birthDay = 25;
String birthMonth = "April";
int birthYear = 1999;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay +"/" + birthYear);
        System.out.println("----------------------------");

        //My favorite name is "Bookname"

        String bookName = "Harry Poter";
        System.out.println("My favorite book is \""  + bookName + "\"" );

    }




}

/*
1. Create a class named BirthDay and create the following variable
 name, birthDay(int), birthMonth(String),
birthYear(int)
 use concatenation to display the birthday of
the person
 if  name = "John"
 birthDay = 25
     birthMonth = "April"
     birthYear = 1995;
 output:
 John was born on
April/25/1995.
 */