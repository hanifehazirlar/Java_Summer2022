package day45_collections;

import java.time.LocalTime;
import java.util.*;

public class C04_Soru2 {
    /*
    Soru 2 : Ilk soruya 3.bir islem ekleyelim, set’i Hashset olarak olusturup elemanlari
    ekleyelim ve sonra TreeSet’e cevirip yazdiralim
    Long time=System.currentTimeMillis() method’unu kullanin
     */
    public static void main(String[] args) {

        Random rnd=new Random();
        Long time3=System.currentTimeMillis();
        TreeSet<Integer> treeSet = new TreeSet<>();
        while(treeSet.size() <100) {
            treeSet.add(rnd.nextInt(100));
        }
        Long time4=System.currentTimeMillis();

        Long time1=System.currentTimeMillis();
        HashSet<Integer> hashSet = new HashSet<>();
        while(hashSet.size() <100) {
            hashSet.add(rnd.nextInt(100));
        }
        Set<Integer> set1 = new HashSet<Integer>();
        set1=hashSet;
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
        for (Integer each:set1) {
            treeSet2.add(each);
        }
        Long time2=System.currentTimeMillis();
        System.out.println("TreeSet :"+(time4-time3));
        System.out.println("HashSet-Set-TreeSet : "+(time2-time1));
        /*

       TreeSet :15
       HashSet-Set-TreeSet : 0 Bu degerler bilgisayarin hizina gore degisiklik gosterebiliyor
       Ama HashSet TreeSet'den daha hizli
         */

    }
}
