package day07_ifStatements;

import java.util.Scanner;

public class C05_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Soru 3-) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek: gun=Pazar output = "Hafta sonu"
               gun=Sali  output = "Hafta ici"
        *** String icin equal merthod'unu kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        // Pazar,pazar,PAZAR,PAZar, PAzar ??? bilemeyiz,
        // pazar, pazar, pazar,pazar,pazar

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")) {
            System.out.println("girilen gun HAFTAİCİ");
        }
        if (girilenGun.equals("cumartesi") || girilenGun.equals("pazar")) {
            System.out.println("Girilen gun  HAFTASONU");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma") || girilenGun.equals("cumartesi") || girilenGun.equals("pazar"))) {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
    }

}
