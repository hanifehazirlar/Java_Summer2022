package day09_ternary;

import java.util.Scanner;

public class C11_TernarySoru1 {
    public static void main(String[] args) {
        // soru 1-) Kullanicidan iki sayi alin ve buyuk olan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1.sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen 2.sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println(sayi1>sayi2?sayi1:sayi2);

        // Soru 2-) Kullanicidan bir tam sayi alin ve sayinin tek veya cift oldugunu yazdirin

        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi%2==0?"cift sayi":"tek sayi");


        
    }
}
