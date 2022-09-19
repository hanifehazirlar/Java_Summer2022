package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static <set> void main(String[] args) {
        //verilen bir Array'deki tekrar eden elementleri silip
        //tekrarsiz halini array'e atayan bir code yaziniz

        int [] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekrarsizSet = new HashSet<>();
        for (int each:arr) {
            tekrarsizSet.add(each);//arr'nin herbir elemanini tekrarsizSet'e attik
        }
        System.out.println(tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]  Set siralama yaparak dondurdu

        int[] tekrarsizArr=new int[tekrarsizSet.size()];

        System.out.println(Arrays.toString(tekrarsizArr));// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int i=0;
        for (Integer each:tekrarsizSet) {//tekrarsizSet'in elemanlarini Integer each'e atar
                                         // Set Integer'lardan olustugu icin each'i Integer sectik
            tekrarsizArr[i]=each;//each'e  gelen elemanlari tekrarsizArr'ye atar
            arr=tekrarsizArr; // bizden bastaki arr'de degisiklik istedigi icin atama yaptik
            i++; //i ile kendi index'imizi olusturduk, her dongude index'i bir arttiriyor
        }
        System.out.println("Bizim Array'in Son Hali : "+Arrays.toString(arr));
        //Bizim Array'in Son Hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //var olan bir array'e yeni bir array ekleyemeyiz
        /*
        int[] arr2=new int[3];

        arr2[0]=2;
        arr2[1]=3;
        arr2[2]=4;
        int[] arr3=new int[4];

        arr2=arr3;
        */



    }
}
