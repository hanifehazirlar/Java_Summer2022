package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler =hanife hazirlar 40 seklinde yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        /*
        String verileri scanner ile alirken
        next( ) : ilk bosluga kadar olan kismi (1 kelime) alir
        nextLine() : satirin sonuna kadar ne yazarsak alir
        Not : eger ardarda birden fazla String deger alacaksak nextLine() kullanmaliyiz
         */
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");

        double yas=scan.nextDouble();
        // girilen bilgiler=hanife hazirlar 40 seklinde yazdirin
        System.out.println("girilen bilgiler= "+isim+" "+soyisim+" "+yas);

    }
}
