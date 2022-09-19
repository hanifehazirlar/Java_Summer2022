package replit.collection;

import java.util.TreeSet;

public class C15 {
    /*
   Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

   TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

   Beklenen Çıktı:
   Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
   ilk elemen: kirmizi
   son eleman: yesil
    */
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("sari");
        treeSet.add("mavi");
        treeSet.add("yesil");
        treeSet.add("kirmizi");
        treeSet.add("turuncu");
        treeSet.add("pembe");
        System.out.println("Orjinal Tree:" + treeSet);
        System.out.println("ilk eleman:" + treeSet.first());
        System.out.println("son eleman:" + treeSet.last());
    }
}
