package replit.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class C09 {
    public static void main(String[] args) {
       /* Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
          LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
        Beklenen Çıktı:
        Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]

        LinkedList Tersi:
        mor
        beyaz
        kirmizi
        yesil
        mavi
        sari
        */
        LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("sari","mavi","yesil","kirmizi","beyaz","mor"));
        ListIterator<String> iterator=linkedList.listIterator();
        System.out.println("Orijinal linked list: "+linkedList);
        System.out.println("LinkedList Tersi : ");
        while(iterator.hasPrevious()) {
            System.out.println((String) iterator.previous());
        }
        //replit icin

        System.out.println("LinkedList Tersi : ");
        for (int i = linkedList.size()-1; i >= 0; i--) {
            System.out.println(linkedList.get(i));

        }

    }
}
