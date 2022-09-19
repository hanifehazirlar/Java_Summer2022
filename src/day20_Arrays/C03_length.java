package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {
        // iki sekilde Array olusturabiliriz

        int sayilar[]={1,2,3};
        String harfler[]=new String[4];

        System.out.println("sayilarin array'in uzunlugu : "+sayilar.length); // 3
        // String length() method'unda parantez var,array'de yok
        System.out.println("harfler array'in uzunlugu : "+harfler.length); // 4 icine eleman koymasakta 4 elemanlik yer ayirdi
        System.out.println(Arrays.toString(harfler)); //[null, null, null, null]

        // harfler array'inin son elemanini yazdiralim
        System.out.println(harfler[harfler.length - 1]); // son elemani yazdirmak istersek boyle yazariz

        System.out.println(harfler[5]); // Array'in uzunlugundan buyuk sayi girersek Run Time Error(RTE) verir


    }

}
