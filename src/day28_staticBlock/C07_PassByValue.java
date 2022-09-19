package day28_staticBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_PassByValue {
    public static void main(String[] args) {
        /*
        Bir list ve bir array olusturalim ve eleman olarak 10,11,12 ekleyelim.
        Iki method olusturup list ve array'i ve array'i degistirmeyi deneyelim
        -1.method'da array'e yeni bir array assing edelim ve yeni halini yazdiralim
        -2.method'da list'e yeni bir list assing edelim ve yeni halini yazdiralim
        -Method call'dan sonra main method'da yeniden yazdirip degisip degismediklerinin kontrol edelim
         */
        int [] num={10,11,12};
        degistirArray(num);
        System.out.println("method'dan sonra main method'un icinde array :"+ Arrays.toString(num)); // [10, 11, 12]
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        degistirList(list);
        System.out.println("method'dan sonra main method'un icinde list : "+list); //[10,11,12)]
    }

    public static void degistirList(List<Integer> list) {
        list=new ArrayList<>();
        list.add(40);
        System.out.println("method'da list : "+list); // [40]
    }

    public static void degistirArray(int[] num) {
        num=new int[5];
        System.out.println("method'da array : "+Arrays.toString(num)); // [0, 0, 0, 0, 0]
    }
}
