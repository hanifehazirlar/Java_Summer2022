package day14_methodCreation;

import java.util.Scanner;

public class C08_Soru1 {
    /*kullanıcıdan bır sayı alın bu sayının tek mı cıft mı oldugunu
      sıfırdan buyuk mu kucuk mu oldugunu ve ayrıca
      100'den buykse birler,onlar ve yuzler basamagindaki rakamların toplamını
      100'den kucukse birler basamagını yazdıran
      3 method olusturun
    */
    /* cozum asamalari
      1) tek mi cift mi methodu
      2) sifirdan buyuk mu kucuk mu
      3) yuzden buyuk mu kucuk mu
     */
    public static void main(String[] args) {

        tekMiCiftMi();
        sifirdanBuyukMuKucukMu();
        yuzdenBuyukMuKucukMu();
    }

    public static void yuzdenBuyukMuKucukMu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scanner.nextInt();
        if (sayi>=100 && sayi<1000){
            int bBas=sayi%10;
            int oBas=(sayi/10)%10;
            int yBas=sayi/100;
            int rakamlarınToplami=bBas+oBas+yBas;
            System.out.println("Girilen  sayi 100'e esit veya buyuk ve girilen sayilarin toplami : "+rakamlarınToplami);
        }else if (sayi<100){
            System.out.println("Girilen sayi 100'den kucukse birler basamagi : "+(sayi/10));
        }
    }
    public static void sifirdanBuyukMuKucukMu() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi=scan.nextInt();
        if (sayi<100){
            System.out.println("Sayi sifirdan kucuk");
        }else{
            System.out.println("Sayi sifirdan buyuk");
        }
    }

    public  static void tekMiCiftMi() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi=scan.nextInt();
        if (sayi%2==0){
            System.out.println("Sayi cifttir");
        }else{
            System.out.println("Sayi tektir");
        }

    }
}
