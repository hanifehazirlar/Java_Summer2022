package replit.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class C12 {
    /*
    Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
     HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
     Beklenen Çıktı:
     Tree Set Elemanlari:
     kirmizi
     mavi
     sari
     turuncu
     yesil
     */
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>(Arrays.asList("sari","mavi","yesil","turuncu","kirmizi"));
        TreeSet<String> treeSet1 = new TreeSet<>();
        System.out.println("Tree Set Elemanlari:");
        for (String each:hashSet1) {
            treeSet1.add(each);
        }
        treeSet1.forEach(item-> System.out.println(item));
    }
}
