package day08_ifStatements;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {
         /*
    Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
    Kullanicidan bir sifre girmesini isteyin
    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
    Ilk harf A ise  “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
    Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
    Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
     */
        // ilk harf buyuk mu kucuk mu ?
        // ilk harf A veya z mi ?
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);
        if (ilkHarf>='A'&& ilkHarf<='Z') { // ilk harfi buyuk harf olan kelimeler
            if (ilkHarf == 'A') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        }else if (ilkHarf>='a'&&ilkHarf<='z') { // ilk harfi kucuk olan kelimeler
            if (ilkHarf == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        }

        else{
            System.out.println("Lutfen ilk karakter icin sadece harf kullanin");
        }




    }


}

