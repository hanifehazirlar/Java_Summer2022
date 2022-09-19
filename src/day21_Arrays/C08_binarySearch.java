package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
          /*
         Binary search java da eleman aramanin kisa yoludur
         Ancak binary searc'un calismasi icin once
         array'in sirali hale getirilmesi gerekir
         Eger siralama yapmadan binarySearch yaparsaniz
         sonucu bulamayabilir veya yanlis bulabilir
         */
        String[] harfler= {"Y", "B", "D", "G", "O","A"};
        String arananHarf="Y";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));// true

        // binarySearch bize aradigimiz elemanin index'ini dondurur
        // array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        // emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));// [A, B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf)); // true


    }
}
