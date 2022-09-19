package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.contains("Nutella")); // true
        System.out.println(urunler.contains("Hobby")); // false

        List<String> urunler2= new ArrayList<>();
        urunler2.add("Nutella");
        urunler2.add("Ikram");

        System.out.println(urunler.containsAll(urunler2)); // true (urunler2 nin tüm elementleri urunler de var mi?)

        urunler2.add("Hobbby");
        System.out.println(urunler.containsAll(urunler2)); // false (urunler2 nin tüm elementleri urunler de var mi?)




    }
}
