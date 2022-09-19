package day08_ifStatements;

import java.util.Scanner;

public class C07Soru6 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi farklı isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin " yazdirin
        // sayilardan sifira esit olan varsa" sifir carpmaya gore yutan elemandir" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen 2.sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("Sayi1 +sayi2 = " + (sayi1 + sayi2));
        } else if ((sayi1 > 0 && sayi2 < 0) || (sayi1 < 0 && sayi2 > 0)) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("sifir carpmaya gore yutan elemendir");

        } else
            System.out.println("Lutfen baska bir sayi giriniz");
        }

    }

