package day14_methodCreation;

import java.util.Scanner;

public class C09_S0ru1Return { public static void main(String[] args) {
        /*kullanıcıdan bır sayı alın bu sayının tek mı cıft mı oldugunu
          sıfırdan buyuk mu kucuk mu oldugunu ve ayrıca
          100'den buykse birler,onlar ve yuzler basamagindaki rakamların toplamını
          100'den kucukse birler basamagını donduren 3 method olusturun
        */
    int sayi=tekCift();
    int sayi2=sıfırdanBuyukKucuk();
    int sayi3= yuzdenBuyukKucuk();
}
    public static int yuzdenBuyukKucuk() {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi3=scan.nextInt();
        if (sayi3>=100 && sayi3<1000){
            int bBas=sayi3%10;
            int onBas=(sayi3/10)%10;
            int yuzBas=sayi3/100;
            int rakamlarToplami=bBas+onBas+yuzBas;
            System.out.println("Girilen sayi>=100 ve Girilen sayilarin toplami : "+rakamlarToplami);
        } else if (sayi3<100){
            System.out.println("Girilen sayi<100 ve Birler Basamagi : "+ (sayi3%10));
        }else {
            System.out.println("Yanlis giriş");
        }
        return sayi3;
    }
    public static int sıfırdanBuyukKucuk() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi2=scan.nextInt();
        if (sayi2<0) {
            System.out.println("sayi sıfırdan kucuktur");
        } else if (sayi2==0) {
            System.out.println("girilen sayi sıfırdır");
        }else {
            System.out.println("sayi sıfırdan buyuktur");
        }
        return sayi2;
    }
    public static int tekCift() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi%2==0) {
            System.out.println("sayi cifttir");
        }else {
            System.out.println("sayi tektir");
        }
        return sayi;
    }
}
