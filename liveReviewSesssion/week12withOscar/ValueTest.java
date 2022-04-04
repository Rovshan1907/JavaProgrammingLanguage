package week12withOscar;

public class ValueTest {
    public static void main(String[] args) {

        Value value = new Value();

        // print if i called set value aethod
        System.out.println(value.calledMethod);
        // print the parameter without assigning anything

        System.out.println(value.getValue());


        value.setValue(5);
        System.out.println(value.calledMethod); //true
        System.out.println(value.getValue());  //0


        System.out.println(value.getValue());
        Value value1 = new Value(3);
        System.out.println(value1.calledConstructor); // true
        System.out.println(value1.calledMethod); // false
        System.out.println(value1.getValue()); // 3





    }
}
