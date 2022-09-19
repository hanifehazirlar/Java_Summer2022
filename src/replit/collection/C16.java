package replit.collection;

import java.util.TreeSet;

public class C16 {
    /*
    Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
    TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
    Beklenen Çıktı:
    Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
    Tree eleman sayısı: 5
     */
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("yesil");
        treeSet.add("sari");
        treeSet.add("mavi");
        treeSet.add("kirmizi");
        treeSet.add("pembe");
        System.out.println("Orjinal TreeSet :" + treeSet);
        System.out.println("Tree eleman sayisi: "+treeSet.size());
    }



}