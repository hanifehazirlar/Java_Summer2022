package replit.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class C07_collection7 {
    public static void main(String[] args) {
       /*
        bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan
        istenilen pozisyondan başlayarak listeyi yazdıralım.

        LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

        1.elemandan itibaren yazdıralım.
        Beklenen Çıktı:
        beyaz
        mavi
        yesil
        turuncu
        */
        LinkedList<String> arr=new LinkedList <>();
        arr.add("sari");
        arr.add("beyaz");
        arr.add("mavi");
        arr.add("yesil");
        arr.add("turuncu");
        Iterator<String> iterator=arr.listIterator(1);
        // Iterator it1=arr.listIterator(1);
        System.out.println("Baştan sona doğru yazdıralım...");
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }
}
