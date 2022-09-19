package lambda_functional_programming.day03_StringClass;

import lambda_functional_programming.day02.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Ali");
        list.add("Mark");
        list.add("Amanda");
        list.add("Christopher");
        list.add("Jackson");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Benjamin");
        System.out.println(list);//[ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN]
        //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
        elemanlariBuyukHarfleYazdir(list);//ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN

        //2.yol
        // elemanlariBuyukHarfleYazdir02(list);

        //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
        uzunlugaGoreYazdir(list);//Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher

        //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
        uzunlugaGoreTerstenYazdir(list);//Christopher Benjamin Jackson Mariano Alberto Amanda Tucker Mark Ali Ali

        //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
        sonKaraktereGoreTekrasizYazdir(list);//Amanda Ali Mark Jackson Benjamin Mariano Alberto Christopher Tucker

        //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
        onceUzunluklarinaSonraIlkKarekterineGoreSiralaYazdir(list);//Ali Ali Mark Amanda Tucker Alberto Jackson Mariano Benjamin Christopher

        //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
        // bestenBuyukElemanlariSil(list); //[Ali, Ali, Mark]

        //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
        //1.yol
        //baslangiciAolanYadaNIleBiteniSil(list);//[Mark, Christopher, Jackson, Mariano, Tucker, Benjamin]
        //2.yol
        //baslangiciAolanYadaNIleBiteniSil02(list);//[Mark, Christopher, Jackson, Mariano, Tucker, Benjamin]

        //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
        uzunluguSekizIleOnarsiVeOIleBiteniSil(list);//[Ali, Ali, Mark, Amanda, Christopher, Jackson, Tucker]

        //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
        boolean kucukMu=elemanlarOnikidenKucukMu(list);
        System.out.println("elemanlarOnikidenKucukMu : "+kucukMu);//true
        //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
        System.out.println("xIleBaslamiyorMu(list) = " + xIleBaslamiyorMu(list));//true
        //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
        System.out.println("rIleBitenVarMi(list) = " + rIleBitenVarMi(list));//true


    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    private static boolean rIleBitenVarMi(List<String> list) {
        return list.stream().anyMatch(t->t.endsWith("r")||t.endsWith("R"));
        // noneMatch: Belirtilen kriter listede hiçbir elemanda bulunmuyor ise true döndürür
        // allMatch: Belirtilen kriter listede tüm elemanlarda bulunuyor ise true döndürür.
        // anyMatch: Belirtilen kriter listede herhangi bir elemanlarda bulunuyor ise true döndürür
    }
    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    private static boolean xIleBaslamiyorMu(List<String> list) {
       return list.stream().noneMatch(t->t.startsWith("X")||t.startsWith("x"));

    }
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    private static boolean elemanlarOnikidenKucukMu(List<String> list) {

       return list.stream().allMatch(t->t.length()<12);
    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static void uzunluguSekizIleOnarsiVeOIleBiteniSil(List<String> list) {
        System.out.println();
        list.removeIf(t->t.length()>7&& t.length()<11||t.endsWith("o"));
        System.out.println(list);
    }
/*
   public static void baslangiciAolanYadaNIleBiteniSil02(List<String> list) {
        list.removeIf(t->t.startsWith("a")||t.startsWith("A")||t.endsWith("n")||t.endsWith("N"));
       System.out.println(list);
    }
 */
/*
    public static void baslangiciAolanYadaNIleBiteniSil(List<String> list) {
        System.out.println();
        list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
        System.out.println(list);
    }
 */
/*
    public static void bestenBuyukElemanlariSil(List<String> list) {
        System.out.println();
        list.removeIf((t->t.length()>5));
        //removeIf methodu list'in elemanlarinin uzunlugu 5'ten buyuk ise sil
        //bu yontem list mutuble oldugu icin list'te kalici degisiklik yapar
        System.out.println(list);
    }
 */

    public static void onceUzunluklarinaSonraIlkKarekterineGoreSiralaYazdir(List<String> list) {
        System.out.println();
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).
                 forEach(Utils::ayniSatirdaBosluklaYazdir);
        //once uzunluga gore siralar sonra ayni uzunluktakileri ilk harfe gore siralar.
        // 2.siralama olcutu koymasaydik lenght'leri esit olanlari listeye eklenme sirasina gore siralardi
        //thenComparing() :==>siralam icin bir kosul daha belirtir
    }

    public static void sonKaraktereGoreTekrasizYazdir(List<String> list) {
        System.out.println();
        list.stream().distinct().sorted(Comparator.comparing(Utils ::sonKarateriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //son karakteri ayni olan harf varsa yuklenme sirasina gore siralar


    }

    public static void uzunlugaGoreTerstenYazdir(List<String> list) {
       System.out.println();
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils ::ayniSatirdaBosluklaYazdir);
    }

    public static void uzunlugaGoreYazdir(List<String> list) {
        System.out.println();
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //Comparator.comparing siralama kosulunu belirtmek icin kullanilir)
        //yani icine String den lenght yazdigimiz icin lenght' e gore sirala demek

    }

   /* public static void elemanlariBuyukHarfleYazdir02(List<String> list) {
        list.replaceAll(String::toUpperCase); //List mutuble oldugu icin kalici degisiklik yapti
       System.out.println(list);
    }
    */

    public static void elemanlariBuyukHarfleYazdir(List<String> list) {
        System.out.println();
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
}
