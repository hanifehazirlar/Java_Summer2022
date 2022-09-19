package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcidan iki sayı alip
        bu sayilarin carpimini yazdiriniz
         */
        // 1.adim
        Scanner scan = new Scanner(System.in);
        // 2.adim
        System.out.println("lutfen ilk sayiyi girin");
        // 3.adim
        double sayi1= scan.nextDouble();

        // 2.sayi icin 2.ve 3. adimlari tekrarlariz

        System.out.println("Lutfen 2.sayiyi giriniz");

        double sayi2 = scan.nextDouble();
        System.out.println("Girilen sayilarin carpimi : " + sayi1*sayi2);
    }

}
