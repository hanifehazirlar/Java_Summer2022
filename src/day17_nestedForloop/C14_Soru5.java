package day17_nestedForloop;

import java.util.Scanner;

public class C14_Soru5 {
    public static void main(String[] args) {
        // Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirin.
        // Kullanicinin hata yapmadigini farz edin.
        // Ornegin kullanici 3 girsin
        // 3*1=3 3*2=6 3*3=9 3*4=12 3*5=15 3*6=18 3*7=21 3*8=24 3*9=27 3*10=30

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");

        int rakam = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(rakam+"*"+i + " = " + rakam * i+" ");

        }
        System.out.println("");
        int bas=1;
        while(bas<=10) {
            System.out.print(rakam+"*"+bas + " = " + rakam * bas+" ");
            bas++;

        }

    }
}
