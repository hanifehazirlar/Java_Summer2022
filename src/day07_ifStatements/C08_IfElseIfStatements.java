package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Bir önceki soruda,kullanici negatif deger girerse uyaralım
        Not: birden fazla if- else if birbirine baglanmıssa son durum onemlidir
       eger else ile bitiyorsa butun ihtimaller kapsanıyor demektir
       ama else if ile bitiyorsa kapsanmıyor durumlar olabilir

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if(yas<0){
            System.out.println("Lutfen gecerli bir yas giriniz");
        }else if (yas<65){
            System.out.println("emekli olamazsin,  "+ (65 - yas) +"  yil daha calismalisin");
        } else{
            System.out.println("Emekli olabilirsin");
        }
    }
}
