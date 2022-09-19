package example;

import java.util.Scanner;

public class C04_SonIkiHarfiYazdirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim = scan.next();

        if (isim.length()>= 2) {
            String sonIki = (isim.substring(isim.length()-2));
            System.out.println(sonIki+sonIki+sonIki);
        }else{
            System.out.println("Iki harften daha uzun isim giriniz");
        }

        }
    }