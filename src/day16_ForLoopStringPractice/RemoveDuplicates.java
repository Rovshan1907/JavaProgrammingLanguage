package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbaacc";


        String result = ""; //abc

        for (int i = 0; i < str.length() ; i++) { // i: represents the index numbers of str(start from 0)

            String ch = ""+str.charAt(i); // represents each Character of str

            if(!result.contains(ch)) {
                result += ch; // the character will be added to the result
            }


        }

        System.out.println(result);
    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC
				Output:
					ABC
			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */
