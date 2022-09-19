package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Listitaretor {
    public static void main(String[] args) {
        // Soru 4) Bir listedeki elementleri iterator kullanarak
        // sondan basa dogru yazdirin
        List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        // sondan basa gelebilmek icin
        // once sona gitmek lazim
        ListIterator li1 = list.listIterator(list.size());// parantezin icine yazdigimiz elemandan baslar okumaya
        while (li1.hasPrevious()) {
            System.out.print(li1.previous() + " ");
        }
    }
}
