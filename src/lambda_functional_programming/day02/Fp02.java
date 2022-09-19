package lambda_functional_programming.day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    public static void main(String[] args) {
        /*
        1)  t -> "Logic", (t,u) -> "Logic"
            Bu yapiya "Lambda Expression" diyoruz
        2)  Functional Programming kapsaminda "Lambda Expression" kullanilabilir ama onerilmez. Onerilmemesinin sebebi
            methodla calismamiz daha dogru olur
            "Lambda Expression" yerine "Method Reference" tercih edilir.
        3)  "Method Reference" kullanimi " ClassName :: MethodName "
             Ayni zamanda kendi class'larinizi da kullanabilirsiniz.
             Ornegin, bir Animal class'iniz var ve bu class'da "eat()" methoduna sahip ==>  "Animal :: eat"
         */

        List<Integer> list = Arrays.asList(8, 9, 131, 10, 9, 10, 2, 8);

        // 1)  list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
        listElemanlariniYazdirFunctional(list);// 8 9 131 10 9 10 2 8

        //2) çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        ciftElemanlariYazdirFunctional(list);// 8 10 10 2 8

        //3)  tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        tekElemanlarinKareleriniYazdir(list); // 81 17161 81
        //4) tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
        tekrarsizTekElemanlarinKupleriniYazdir(list); // 729 2248091
        //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
        tekrarsizCiftElemanlarinKareleriToplami(list);// 168
        //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
        tekrarsizCiftElemanlarinKüpleriCarpimi(list); // tekrarsizCiftElemanlarinKüpleriCarpimi : 4096000

        //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
        getMaxEleman(list);//List in max elemani : 131

        //Ödev
        //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
        getMinEleman(list);//2

        //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
        yedidenBuyukCiftMin(list);//8

        //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
        tersSiralamaylaTekrarsizBestenBuyukElemanlarinYarisi(list);


    }

    public static void tersSiralamaylaTekrarsizBestenBuyukElemanlarinYarisi(List<Integer> list) {
       List<Double> newList= list.stream().distinct().filter(t->t>5).map(Utils::yarisiniAl).
                             sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       //collect kullanmamizin sebebi sonuclari bir List' e atamak. Atama yapmadan forEach ile de yazdirabilirdik
        System.out.println("tersSiralamaylaTekrarsizBestenBuyukElemanlarinYarisi : "+newList);//[65.5, 5.0, 4.5, 4.0]
    }

    private static void getMinEleman(List<Integer> list) {
        Integer min=list.stream().distinct().reduce(Math::min).get();
        System.out.println("List Elemanlarinin Min : "+min);
    }

    private static void yedidenBuyukCiftMin(List<Integer> list) {
        Integer min=list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math :: min).get();
        System.out.println("List Elemanlarinin yediden Buyuk Min : " + min);
    }

    private static void getMaxEleman(List<Integer> list) {
        Integer max=list.stream().distinct().reduce(Math ::max).get();
        System.out.println("List in max elemani : "+max);
    }

    private static void tekrarsizCiftElemanlarinKüpleriCarpimi(List<Integer> list) {
       Integer carpim= list.stream().distinct().filter(Utils :: ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println("tekrarsizCiftElemanlarinKüpleriCarpimi : "+carpim);
    }

    public static void tekrarsizCiftElemanlarinKareleriToplami(List<Integer> list) {
       Integer toplam= list.stream().distinct().filter(Utils :: ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
       //reduce de baslangic degeri yazdigimizda get gerekmedi
       //2.yol==> Integer toplam= list.stream().distinct().filter(Utils :: ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        //Math class'indan addExact methodunu kullandı bu method gelen elemanlarin herbirini topluyor, get de getiriyor
        //3.yol==>Integer toplam= list.stream().distinct().filter(Utils :: ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
        // Integer class indan sum methodunu kullandik sum methodu da toplama methodudur.
        System.out.println("TekrarsizCiftElemanlarinKareleriToplami : "+toplam);

    }

    public static void tekrarsizTekElemanlarinKupleriniYazdir(List<Integer> list) {
        System.out.println();
        list.stream().distinct().filter(Utils :: tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
       System.out.println();
       list.stream().filter(Utils ::tekElemaniSec).map(Utils :: karesiniAl).forEach(Utils ::ayniSatirdaBosluklaYazdir);

    }

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        System.out.println();
        list.stream().filter(Utils ::ciftElemaniSec).forEach(Utils ::ayniSatirdaBosluklaYazdir);
    }

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        System.out.println();
        list.stream().forEach(Utils :: ayniSatirdaBosluklaYazdir); // 8 9 131 10 9 10 2 8
    }
}
