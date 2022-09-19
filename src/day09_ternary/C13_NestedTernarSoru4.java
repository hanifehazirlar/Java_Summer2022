package day09_ternary;

import java.util.Scanner;

public class C13_NestedTernarSoru4 {
    public static void main(String[] args) {
        int y=5;
        System.out.println((y>5)?(y<10?2*y:3*y):(y>10?2+y:3+y));

        // Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,girilen degerlere gore
        // dikdortgenin kare olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzunlugunu giriniz");
        double u=scan.nextDouble();
        System.out.println("Lutfen dikdortgenin genisligini giriniz");
        double g=scan.nextDouble();
        System.out.println(u==g?"dikdortgen bir karedir":"dikdortgen bir kare degildir");

        // Kullanicidan bir sayi alin ve sayi 3 basamakli ise "Uc basamakli sayi ", yoksa "Uc basakli degil yazdirin
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
        System.out.println((sayi>99 && sayi<1000 )? "Uc basamakli sayi" : "Uc basamakli sayi degil");

    }


}
