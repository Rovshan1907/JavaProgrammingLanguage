package week06withOscar;

public class PrintAllLetters {

    public static void main(String[] args) {

        for(int i = 65; i<= 90; i++ ){
            System.out.print((char)i+" ");
        }

        System.out.println();
        System.out.println("-------------------------");

        for(char c = 'A'; c<='Z' ; c++){
            System.out.print(c+" ");
        }

    }
}
// print all letters from A to Z
//char a=65
//char b=90 {} --> curly braces