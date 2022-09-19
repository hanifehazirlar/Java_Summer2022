package lambda_functional_programming.day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
        /*
        1) Lambda (Functional Programming) Java 8 ile kullanilmaya baslanmistir.
        2) Functional Programming ' de Ne yapilacak" (What to do) uzerine yogunlasilir.
         Stractured(Yapisal)Programming "Nasil yapilacak" (How to do) uzerine yogunlasilir.
        3) Functional Programming Arrays ve Collections ile kullanilir.
        4) "entrySet() methodu ile Map, Set' e donusturulerek  Functional Programming' de kullanilir.
         */
    public static void main(String[] args) {
        //1) Ardışık list elementlerini aynı satırda aralarında
        // boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);//[8, 9, 131, 10, 9, 10, 2, 8]
        //  1) ard arda olarak list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        //Structured(simdiye kadar ogrendiklerimizle) olarak
        ardisikElementleriYazdirStructured(liste);//List elemanlarinin sirali hali : 8 9 131 10 9 10 2 8

        //1) ard arda olarak  list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional olarak
        ardisikElementleriYazdirFunctional(liste);//forEach() ile list elemanlarinin sirali hali : 8 9 131 10 9 10 2 8

        //2)ard arda olarak çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        ciftElemanlariYazdirStructured(liste);//Cift list elemanlari Structured : 8 10 10 2 8

        //2)ard arda olarak çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional Programming)
        ciftElemanlariYazdirFunctonal(liste);//Cift list elemanlari functional ile : 8 10 10 2 8

        //3) Ardışık tek list elementlerinin karelerini aynı satırda
        // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        tekElemanlariKareleriniYazdirFunctional(liste);//81 17161 81 2.yol sadece forEach ile : 81 17161 81

        //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak
        // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
        tekrarsizTekElemanlarinKupleriniYazdir(liste);//Tekrarsiz tek list elemanlarinin küpü : 729 2248091

        //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
        tekrarsizCiftElemanlarinKareleriToplami(liste);//Tekrarsiz Cift Elemanlarin Kareleri Toplami : 168

    }

    private static void tekrarsizCiftElemanlarinKareleriToplami(List<Integer> liste) {
        System.out.println();
        System.out.println("Tekrarsiz Cift Elemanlarin Kareleri Toplami : "
                + liste.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0,(t,u)->t+u));
        // burayi istersek Integer'a atayabilirdik
        //reduce() methodu tek bir degere indirgemek icin kullanilir.Bu ornekte toplama islemi yaptigimiz icin toplama isleminde
        // etkisiz eleman olan 0'i baslangic elemani olarak yazdik.distinct() ve filter()'dan sonra degerlerim 2,8,10,
        // map()'den sonra 4,64,100
        // yani, (0,4)->0+4=4
        //      (4,64)->4+64=68
        //      (68,100)->68+100=168 son deger 168 olur
    }
    public static void tekrarsizTekElemanlarinKupleriniYazdir(List<Integer> liste) {
        System.out.println();
        System.out.print("Tekrarsiz tek list elemanlarinin küpü : ");
        liste.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));//729 2248091
        // distinct() methodu ayni elemanlari incelemez, filtre gibi

    }

    public static void tekElemanlariKareleriniYazdirFunctional(List<Integer> d) {
        System.out.println();
        System.out.print("Tek list elemanlarinin karesi functional ile :");
        d.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t +" "));//81 81 17161
        System.out.println();

        System.out.println("2.yol sadece forEach ile : ");
        d.stream().filter(t->t%2!=0).forEach(t-> System.out.print(t*t +" "));//81 81 17161
    }

    public static void ciftElemanlariYazdirFunctonal(List<Integer> a) {
        System.out.println();
        System.out.print("Cift list elemanlari functional ile : ");
        a.stream().filter(t->t%2==0).forEach(t-> System.out.print(t +" "));
    }
    public static void ciftElemanlariYazdirStructured(List<Integer> b) {
        System.out.println();
        System.out.print("Cift list elemanlari Structured ile : ");
        for (Integer i : b) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void ardisikElementleriYazdirFunctional(List<Integer> c) {
        System.out.println();
        System.out.print("List elemanlarinin sirali hali functional ile : ");
        c.stream().forEach(t-> System.out.print(t+" "));//forEach() ile list elemanlarinin sirali hali : 2 8 8 9 9 10 10 131
        // stream() methodu collection'dan elementleri akisa dahil etmek ve methodlara ulasmak icin kullanilir
    }
    public static void ardisikElementleriYazdirStructured(List<Integer> l) {
        System.out.print("List elemanlarinin sirali hali Structured ile : ");
        for (Integer each : l) {
            System.out.print(each + " ");//List elemanlarinin sirali hali : 2 8 8 9 9 10 10 131
        }
    }
}
