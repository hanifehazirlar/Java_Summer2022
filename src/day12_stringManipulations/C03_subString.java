package day12_stringManipulations;

public class C03_subString {
    public static void main(String[] args) {
        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";
        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); //fil

        System.out.println(isim.substring(2,4)); // le
        // isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan *

        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");
        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");
        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";
        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n" +
                kkIlk4+kkGeriyeKalanlar );
        /*String isim="Suleyman Emre";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";
        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); // fil
        System.out.println(isim.substring(2,4)); // le
        // isim ve soyisim'in ilk harfi buyuk geriye kalan *
        // kartNo 'nun ilk dört rakami görünsün geriye kalan *
        String isimİlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1,8).replaceAll("\\w","*");
        String isim2İlkHarf=isim.substring(9,10).toUpperCase();
        String isim2GeriyeKalanlar=isim.substring(10).replaceAll("\\w","*");
        String soyisimİlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");
        String kkIlk4=kartNo.substring(0,4).toUpperCase();
        String kkİlk4GeriyeKalanlar= " **** **** ****";   //kartNo.substring(4).replaceAll("\\w","*");
        System.out.println(isimİlkHarf+isimGeriyeKalanlar+" "+isim2İlkHarf+isim2GeriyeKalanlar+" "+soyisimİlkHarf+soyisimGeriyeKalanlar+"\n" +
                kkIlk4+kkİlk4GeriyeKalanlar);

         */

    }
}
