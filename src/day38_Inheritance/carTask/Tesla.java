package day38_Inheritance.carTask;

public class Tesla extends Car {
    public Tesla(String brand, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" is autoPilot");
    }





}
