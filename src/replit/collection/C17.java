package replit.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class C17 {
    /*
    Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp
    aynı olanlar için "yes" farklı olanlar için "no" yazdıralım.
    TreeSet: mavi,yesil,kirmizi,sari
    TreeSet: yesil,mavi,pembe,turuncu
    Beklenen Çıktı:
    1. TreeSet: [kirmizi,mavi,sari,yesil]
    2. TreeSet: [mavi,pembe,turuncu,yesil]
    Karsilastirma Sonucu:
    no
    yes
    no
    yes
     */
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("mavi");
        treeSet1.add("yesil");
        treeSet1.add("kirmizi");
        treeSet1.add("sari");
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("yesil");
        treeSet2.add("mavi");
        treeSet2.add("pembe");
        treeSet2.add("turuncu");
        System.out.println("1. TreeSet: " + treeSet1);
        System.out.println("2. TreeSet: " + treeSet2);
        for (String each : treeSet1) {
            if (treeSet2.contains(each)) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        /*
        Iterator it1 = treeSet1.iterator();
        Iterator it2 = treeSet2.iterator();
        //burada ayni indexleri karsılastiriyor
        while (it1.hasNext()) {
            if (it1.next().equals(it2.next())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        */
    }
}