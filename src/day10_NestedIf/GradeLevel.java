package day10_NestedIf;

public class GradeLevel {


    public static void main(String[] args) {
     byte gradeLevel = 7;
     String typeOfSchool = "";
     if(gradeLevel>=1 && gradeLevel <=18){

         if(gradeLevel>=1 && gradeLevel <=5){
             typeOfSchool= "Elementary school";
         }else if(gradeLevel >= 6 && gradeLevel <= 8){
             typeOfSchool = "Middle School";
         }else if(gradeLevel >= 9 && gradeLevel <= 12){
             typeOfSchool = "High  school";
         }else if (gradeLevel >= 13 && gradeLevel <= 16){
             typeOfSchool = "College";
         }else{
             typeOfSchool = "Grad School";
         }
     }else{
         System.out.println("Invalid grade Level");
     }
        System.out.println(typeOfSchool);



    }
}


/*
1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */