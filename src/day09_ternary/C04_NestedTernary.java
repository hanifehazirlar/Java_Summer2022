package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
       // Soru2 : Kullanicidan bir harf isteyin
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scanner.next().charAt(0);
        // String  sonuc=(harf>='a' && harf<='z')?("kucuk harf") :("buyuk harf veya gecersiz karakter");

        String  sonuc=harf>='a' && harf<='z' ? "kucuk harf" :
                      harf>='A' && harf<='Z' ? "buyuk harf" :"girdiginiz karakter harf degil";

        String  sonuc2=(harf>='a' && harf<='z') ? ("kucuk harf") :
                ((harf>='A' && harf<='Z' )? "buyuk harf" :"girdiginiz karakter harf degil");

        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
}
