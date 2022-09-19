package day17_nestedForloop;

import java.util.Scanner;

public class C15Soru6 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve
        // toplam kac tane olduklarini ekrana yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        int adet = 0;
        System.out.print(sayi+" sayisinin tam bolenleri :");
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
                adet++;
            }
        }
        System.out.println("");
        System.out.println(sayi + " sayisinin " + adet + " tane tam boleni vardir.");
        adet=0;
        int tamBol = 1;
        System.out.print(sayi+" sayisinin tam bolenleri :");
        while (tamBol <= sayi) {
            if (sayi % tamBol == 0) {
                System.out.print(tamBol + " ");
                adet++;
            }
            tamBol++;
        }
        System.out.println("");
        System.out.println(sayi + " sayisinin " + adet + " tane tam boleni vardir.");
    }
}
