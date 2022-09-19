package day37_overridding;

public class PolymorphismChild extends PolymorphismParent{
    public int getDetails (String temp){
        System.out.println("Test class "+temp);
        return 0;
    }

    public static void main(String[] args) {
        PolymorphismChild obj=new PolymorphismChild();
        obj.getDetails("GFG");
    }
}
