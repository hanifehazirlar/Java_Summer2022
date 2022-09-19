package day10_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {
        String str = "Java ogren, isi kap";
        System.out.println(str.length()); // str'in karakter sayisini dondurur 19

        System.out.println(str.charAt(str.length() - 1)); // son karakterini yazdiralim p

        System.out.println(str.charAt(str.length() - 3)); // sondan 3.karakteri yazdiralim k
        /*
        Java da null pointer (isaretleyici) bir deger degil,
        karsinina yazildigi variable'in hic bir deger almadiginin isaretcisidir
         */
        String str2 =""; // str2 'ye bir deger atanmamıs midir EVET
                         // bu deger nedir: hiclik
        System.out.println(str2.length());  // 0

        String str3 =null;// str3'e bir deger atanmis midir HAYIR
                         // null bu deger atamamayi isaret etmektedir
        System.out.println(str3.length()); // bir deger atanmamis ki nasil uzunlugu olsun?
                                           // NullPointerException olarak hata verir
    }
}
