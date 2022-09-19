package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        // Eger ternary icindeki sonuclar farklı data turlerinde ise atama yapamayız, sadece yazdirabiliriz
        // double sonuc=sayi>0? "Sayi Pozitif" : (sayi*sayi); bu sekilde atama yaptiramiyoruz
        // System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));

        System.out.println(sayi>0?"Sayi Pozitif":sayi<0?sayi*sayi:"Sayi sifira esittir");

        // bu da nested seklidir uc ve daha fazla asama olursa böyle kullaniriz




    }
}
