package example;

public class C16_SayilarinTop {
    public static void main(String[] args) {
        int bas=1;
        int bit=100;
        int top=0;
        System.out.print("Sayilarin Toplami : ");
        while(bas<=bit) {
            top+=bas;
            bas++;
        }
        System.out.println(top);
    }
}
