package day36_inheritanceDataTypeKullanimi;

public class GTest01 extends FParentClass {
   public void getDetails() {

        System.out.println("Test class " );
       super.getDetails();

    }

    public static void main(String[] args) {
        FParentClass obj = new GTest01();
        obj.getDetails();
    }
}
