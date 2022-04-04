package day34_GarbageCollection_AccessModufiers;

public class Constructor_VS_StaticBlock {

    static{
        System.out.println("Static Block");
    }

    public Constructor_VS_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {



        new Constructor_VS_StaticBlock(); //1
        new Constructor_VS_StaticBlock(); //2
        new Constructor_VS_StaticBlock(); //3
        new Constructor_VS_StaticBlock(); //4
        new Constructor_VS_StaticBlock(); //5



    }


}
