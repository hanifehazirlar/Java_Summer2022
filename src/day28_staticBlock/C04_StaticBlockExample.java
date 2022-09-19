package day28_staticBlock;

public class C04_StaticBlockExample {
    public static int age;
    static{
        System.out.println("Static block 2 calisti");
        age=24;
    }
    static {
        System.out.println("Static block 1 calisti");
        age=23;
    }
    public C04_StaticBlockExample(){
        System.out.println("Constructor calisti");
        System.out.println(++age);

    }

    public static void main(String[] args) {
        System.out.println("Main method calisti 1");
        System.out.println(++age);
        C04_StaticBlockExample obj=new C04_StaticBlockExample();
        System.out.println("Main method calisti 2");

    }
}
