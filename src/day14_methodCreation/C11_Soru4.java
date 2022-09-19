package day14_methodCreation;

import java.util.Scanner;

public class C11_Soru4 {
    public static void main(String[] args) {
        /*
          Kullanicidan ismini soyismini ve bosluk birakmadan 16 hane olarak
          kredi karti numarasini aliniz
          isim ve soyismin ilk harfleri buyuk diger harfler kucuk olacak sekide
          kknumarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
          duzelten iki method yazin ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun
        */

        String isim = isimduzeltme();
        String kkNo = kknoduzeltme();
    }
    public static String kknoduzeltme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 16 haneli Kredi Karti no ");
        String kkno = scan.nextLine();
        kkno = kkno.substring(0, 4) + " " + kkno.substring(4, 8) + " " + kkno.substring(8, 12) + " " + kkno.substring(12);
        System.out.println("Kredi karti numarasi : " + kkno);
        return kkno;
    }
    public static String isimduzeltme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isim ve soyisim giriniz aralarda enter a basiniz");
        String isim = scan.nextLine();
        System.out.println();
        String soyisim = scan.nextLine();
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1,isim.indexOf(" ")).toLowerCase()+"  "+
                isim.substring(isim.indexOf(" ")+1,isim.indexOf(" ")+2).toUpperCase()+
                isim.substring(isim.indexOf(" ")+2).toLowerCase();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        String sonuc="Isim Soyisim : "+ isim+" "+ soyisim;
        System.out.println(sonuc);
        return sonuc;
    }
}
