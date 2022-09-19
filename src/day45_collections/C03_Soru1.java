package day45_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class C03_Soru1 {
    //Soru 1 : Bir TreeSet ve HashSet’e random 100 sayi ekleyin, islem surelerini kiyaslayin
    public static void main(String[] args) {

        Random rnd=new Random();

        LocalTime baslangic1=LocalTime.now();
        TreeSet<Integer> treeSet = new TreeSet<>();
        while(treeSet.size() <100) {
            treeSet.add(rnd.nextInt(100));
        }
        System.out.println(treeSet.size());
        LocalTime bitis1=LocalTime.now();

        LocalTime baslangic2=LocalTime.now();
        HashSet<Integer> hashSet = new HashSet<>();
        while(hashSet.size() <100) {
            hashSet.add(rnd.nextInt(100));
        }
        System.out.println(hashSet.size());
        LocalTime bitis2=LocalTime.now();
        System.out.println("TreeSet ile "+ (bitis1.getNano()-baslangic1.getNano()));
        System.out.println("HashSet ile "+ (bitis2.getNano()-baslangic2.getNano()));
        //HashSet Treeset'den daha hizli
    }
}
