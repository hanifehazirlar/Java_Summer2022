package day14_methodCreation;

import java.util.Scanner;

public class C10_Soru3 {
    public static void main(String[] args) {
       /*
          Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
           -@ isareti icermiyorsa gecersiz email yazin
           -@gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
           -@gmail.com ile bitmiyorsa "yazimda bir sorun var, mail i kontrol ediniz"
             yazdirin          
      */
        emailKontrol();
    }
    public static void emailKontrol() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir e mail adresi giriniz");
        String adres= scan.next();
        if (!adres.contains("@")){
            System.out.println("Gecersiz Email adres");
        }
        if(!adres.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresinizi girin");
        }else if (!adres.endsWith("@gmail.com")){
            System.out.println("Yazimda bir sorun var");
    }
    }
}
