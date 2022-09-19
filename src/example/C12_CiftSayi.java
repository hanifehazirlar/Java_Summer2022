package example;

public class C12_CiftSayi {
    public static void main(String[] args) {
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                System.out.print((100-i)+" ");
            }
        }
        System.out.println("");
        int bas=0;
        int bit=100;
        while(bas<=100){
            if (bas%2==0) {
                System.out.print((100 - bas) + " ");
            }
            bas++;
        }
    }
}
