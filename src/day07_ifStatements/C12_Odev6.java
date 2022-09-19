package day07_ifStatements;

import java.util.Scanner;

public class C12_Odev6 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1.sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen 2.sayiyi giriniz");
        int sayi2=scan.nextInt();
        if (sayi1>0 && sayi2>0) {
            System.out.println("sayilarin toplami:" + (sayi1 + sayi2));
        }else if (sayi1<0 && sayi2<0) {
            System.out.println("sayilarin carpımı:" + (sayi1*sayi2));
        }else if (sayi1>0 && sayi2<0 || sayi1>0) {
        }
    }
}
