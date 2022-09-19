package day39_exceptions;

import java.util.Scanner;

public class C06_Soru1 {
    // Kullanicidan carpma yapmak icin bir String isteyin
    // kullanicinin girdigi String sadece sayilardan olusuyorsa sayiyi
    // 2 ile carpip sonucu yazdirin.
    // Kullanici sayilardan olusmayan bir string girerse girdiginiz String sayiya cevirilemez yazdirin
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("String olarak sayi giriniz");
        String stringSayi=scan.next();
        try {
            int sayi=Integer.parseInt(stringSayi);
            System.out.println("Sonuc"+2*sayi);
        } catch (NumberFormatException e) {
            System.out.println("Girdiginiz String sayiya cevirilemez");
        }
    }
}
