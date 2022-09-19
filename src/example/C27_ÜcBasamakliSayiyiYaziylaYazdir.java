package example;

import java.util.Scanner;

public class C27_ÜcBasamakliSayiyiYaziylaYazdir {
    //  Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uc basamakli sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi > 99 && sayi < 1000) {
            switch (sayi / 100) {
                case 1:
                    System.out.println("Yüz");
                case 2:
                    System.out.println("Ikiyüz");
                case 3:
                    System.out.println("Ucyüz");
                case 4:
                    System.out.println("Dortyüz");
                case 5:
                    System.out.println("Besyüz");
                case 6:
                    System.out.println("Altiyüz");
                case 7:
                    System.out.println("Yediyüz");
                case 8:
                    System.out.println("Sekizyüz");
                case 9:
                    System.out.println("Dokuzyüz");
                default:
                    break;
            }
            switch ((sayi / 10) % 10) {
                case 1:
                    System.out.println("on");
                case 2:
                    System.out.println("yirmi");
                case 3:
                    System.out.println("otuz");
                case 4:
                    System.out.println("kirk");
                case 5:
                    System.out.println("elli");
                case 6:
                    System.out.println("Altmis");
                case 7:
                    System.out.println("yetmis");
                case 8:
                    System.out.println("seksen");
                case 9:
                    System.out.println("doksan");
                default:
                    break;
            }
            switch (sayi % 10) {
                case 1:
                    System.out.println("bir");
                case 2:
                    System.out.println("iki");
                case 3:
                    System.out.println("üc");
                case 4:
                    System.out.println("dort");
                case 5:
                    System.out.println("bes");
                case 6:
                    System.out.println("alti");
                case 7:
                    System.out.println("yedi");
                case 8:
                    System.out.println("sekiz");
                case 9:
                    System.out.println("dokuz");
                default:
                    break;
            }
        } else {
            System.out.println("Hatali giris");
        }
    }
}
