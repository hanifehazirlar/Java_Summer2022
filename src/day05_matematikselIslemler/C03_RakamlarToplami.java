package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        // Kullanicidan 4 basamakli bir sayi alin ve rakamalar toplamini bulup yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt(); //5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        // suanda sayi=5267 birler b.=0 rakamlar t.=0

        birlerBasamagi=sayi%10; // 7
        rakamlarToplami +=birlerBasamagi; // 0+7=7
        sayi /=10; //5267/10=526
        // suanda sayi=526 birler b.=7 rakamlar t.=7

        birlerBasamagi=sayi%10; // 6
        rakamlarToplami +=birlerBasamagi; // 7+6=13
        sayi /= 10; //526/10=52
        // suanda sayi=52 birler b.=6 rakamlar t.=13

        birlerBasamagi=sayi%10; // 2
        rakamlarToplami +=birlerBasamagi; // 13+2=15
        sayi /=10; //52/10=5
        // suanda sayi=5 birler b.=2 rakamlar t.=15

        birlerBasamagi=sayi%10; // 5
        rakamlarToplami +=birlerBasamagi; // 15+5
        sayi /=10; // 5/10=0
        //  suanda sayi 0 birler b.=5 rakamlar t.= 20
        System.out.println(ilkGirilenSayi +" sayisinin rakamlar toplami :"+ rakamlarToplami);

    }
}
