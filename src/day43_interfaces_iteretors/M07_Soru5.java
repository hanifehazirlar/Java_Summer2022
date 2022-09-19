package day43_interfaces_iteretors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class M07_Soru5 {
    /*
    Soru 5) (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
    Orn : list : [2,13,56,23,45,14,40]
    artirilmasi istenen eleman sayisi : 3
    output: [7,18,61,23,45,14,40]
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,13,56,23,45,14,40));
        int artIstElemanS=3;
        ListIterator lit1=list.listIterator();
        while(lit1.nextIndex()<artIstElemanS){

            lit1.set((int)lit1.next()+5);
        }
        System.out.println("5 eklendikten sonra list : "+list); // [7, 18, 61, 23, 45, 14, 40]
    }
}
