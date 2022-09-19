package day45_collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C05_Soru2 {
    public static void main(String[] args) {
     /*
        Soru 2 : Ilk soruya 3.bir islem ekleyelim, set’i Hashset olarak olusturup elemanlari
ekleyelim ve sonra TreeSet’e cevirip yazdiralim
Long time=System.currentTimeMillis() method’unu kullanin
         */
        TreeSet<Integer> trSet=new TreeSet<>();
        Random rnd=new Random();
        HashSet<Integer> hsS=new HashSet<>();
        Long time1 = System.currentTimeMillis();
        System.out.println("time1 = " + time1);
        while (trSet.size()<100) {
            trSet.add(rnd.nextInt(100));
        }
        System.out.println(trSet);
        Long time2 = System.currentTimeMillis();
        System.out.println("time2 = " + time1);
        Long time3 = System.currentTimeMillis();
        System.out.println("time3 = " + time2);
        while (hsS.size()<100) {
            hsS.add(rnd.nextInt(100));
        }
        Set<Integer> set=new HashSet<>();
        set=hsS;
        for (Integer each:set) {
            trSet.add(each);
        }
        System.out.println(trSet);
        Long time4 = System.currentTimeMillis();
        System.out.println("time4 = " + time2);
        System.out.println("tree set "+(time2-time1));
        System.out.println("hash set tree set "+(time4-time3));

    }
}
