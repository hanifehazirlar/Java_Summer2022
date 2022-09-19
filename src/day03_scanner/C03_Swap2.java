package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu bos kova kullanmadan yapin
        int sayi1 = 10;

        int sayi2 = 20;

        System.out.println("swaptan önce :" + sayi1);
        System.out.println("swaptan önce :" + sayi2);

        sayi1 = sayi1 + sayi2; // sayi1=10+20=30

        sayi2 = sayi1 - sayi2; // sayi2=30-20=10

        sayi1 = sayi1 - sayi2; //sayi1=30-10=20

        System.out.println("swaptan sonra sayi1 :" + sayi1);
        System.out.println("swaptan sonra sayi2 :" + sayi2);


    }
}
