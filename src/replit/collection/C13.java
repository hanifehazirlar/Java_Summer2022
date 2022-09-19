package replit.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class C13 {
   /* Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

    TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
    Beklenen Çıktı:
    beyaz
    kirmizi
    mavi
    sari
    siyah
    yesil
    */
   public static void main(String[] args) {
       TreeSet<String> treeSet = new TreeSet<String>();
       treeSet.add("beyaz");
       treeSet.add("kirmizi");
       treeSet.add("mavi");
       treeSet.add("sari");
       treeSet.add("siyah");
       treeSet.add("yesil");
       treeSet.forEach(item-> System.out.println(item));
   }



}
