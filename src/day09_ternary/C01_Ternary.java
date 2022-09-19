package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi=scan.nextDouble();
        System.out.println(sayi>=0 ? sayi: (-1*sayi));
    }
}
