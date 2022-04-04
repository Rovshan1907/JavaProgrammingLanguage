package week04withOscar;

public class TrafficLighterSelector {


    public static void main(String[] args) {

        char color = 'r';

        switch (color){
            case 'R': case 'r':
                System.out.println("Red Light");
                break;
            case 'O': case 'o':
                System.out.println("Orange Light");
                break;
            case 'G': case 'g':   // or logic
                System.out.println("Green Light");
                break;
            default:
                System.out.println("Invalid Light");
        }







    }
}
