package replit.collection;

import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C11 {
    /*
    HashSet ile list oluşturalım ve TreeSet ile sıralayalım ve listeyi yazdıralım.

    HashSet List: sari,mavi,kirmizi,yesil,mor
    Beklenen Çıktı:
    TreeSet elements:
    kirmizi
    mavi
    mor
    sari
    yesil
     */
    public static void main(String[] args) {
        HashSet<String> list=new HashSet<>();
        list.add("sari");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("mor");
        System.out.println("HashSet list : "+ list); //HashSet list : [sari, mor, yesil, mavi, kirmizi]
        TreeSet<String> listSet = new TreeSet<String>();
        System.out.println("TreeSet elements:");
        for (String each:list) {
            listSet.add(each);
        }
       listSet.forEach(item -> {
           System.out.println(item);
       });
        list.forEach(item -> System.out.println(item));



    }
}
