package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // Verilen 3 basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim


        int input=423;

        rakamlariTopla(input);
        C04_MethodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("Nuri");
    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=input; // İlk sayi kaybolmasin diye input u atadik

        birlerBasamagi=input%10; // 423%10=3
        rakamlarToplami+=birlerBasamagi;
        input/=10; // 423/10=42

        birlerBasamagi=input%10; // 42%10=2
        rakamlarToplami+=birlerBasamagi;
        input/=10; // 42/10=4

        birlerBasamagi=input%10; // 4%10=4
        rakamlarToplami+=birlerBasamagi;
        input/=10; // 4/10=0

        System.out.println("Girdiginiz "+girilenSayi+" sayisinin rakamlar toplami "+ rakamlarToplami);
    }
}
