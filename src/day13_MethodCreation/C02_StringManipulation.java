package day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
          /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();
        int kontrol=0;
        // ilk harf kontrolu
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else{
            System.out.println("Ilk harf buyuk harf olmali");
        }
        // son harf kontrolu
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else{
            System.out.println("Son harf kucuk harf olmali");
        }
        // bosluk kontrolu
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        } else {
            kontrol++;
        }
        // sifre uzunluk kontrolu
        if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        if (kontrol==4){
            System.out.println("Sifre basari ile tanimlandi");
        }else{
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");

           /* 2.cozum
           Scanner scan=new Scanner(System.in);
       System.out.println("lutfen bir sifre giriniz");
       String sifre=scan.nextLine();
       boolean ilkHarf=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
       boolean sonHarf=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
       boolean bosluk=!sifre.contains(" ");
       boolean uzunluk=sifre.length()>=8;
       if(!ilkHarf) {
           System.out.println("sifre icerisinde ilk harf buyuk olmali");
       }
       if (!sonHarf){
           System.out.println("son harf kucuk olmali");
       }
       if(!bosluk){
           System.out.println("bosluk olmamali");
       }
       if(!uzunluk){
           System.out.println("uzunluk en az 8 olmali");
       }
       if (ilkHarf && sonHarf && bosluk && uzunluk) {
           System.out.println("Sifre basari ile tanimlandi");
       } else {
           System.out.println("Islem basarisiz, Lutfen yeni bir sifre girin");
       }
            */
        }
    }

}

