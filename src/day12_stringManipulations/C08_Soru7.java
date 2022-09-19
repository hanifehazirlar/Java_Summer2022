package day12_stringManipulations;

import java.util.Scanner;

public class C08_Soru7 {
    public static void main(String[] args) {
        // kullanıcıdan ismini,soy ismini ve kredi kartını alın ve asagıdakı gıbı yazdırın
        // isim-soyisim:M***** B******
        //kart no :************1234

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("lütfen kart numaranızı giriniz");
        String kartNo = scan.nextLine();


        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");
        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");
        String kkson4=kartNo.substring(kartNo.length()-4);
        String kkgeriyekalan= "**** **** **** ";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n" +kkgeriyekalan+
                kkson4);

    }
}
