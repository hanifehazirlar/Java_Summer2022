package day35_inheritancedeConstructorKullanimi;

public class OTest01 extends NDerived{
    public OTest01(String temp){
        super(temp);
        System.out.println("OTest01 calss "+ temp);
    }

    public static void main(String[] args) {
        OTest01 obj = new OTest01("Hanife");
    }
}
