package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C01_Listiterator {
    public static void main(String[] args) {
        /*
        Soru 3) Bir listedeki istenen sayi araliginda olmayan elementleri
        silen bir program yaziniz …(2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
         */
        List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));

        System.out.println(list); // [2, 13, 56, 23, 45, 14, 40]

        ListIterator li1= list.listIterator();
        int basSinir=30;
        int bitSinir=40;
        while(li1.hasNext()){
            Integer temp=(Integer)li1.next();
            if (temp<basSinir || temp>bitSinir){
                li1.remove();
            }
        }
        System.out.println(list);
    }

}
