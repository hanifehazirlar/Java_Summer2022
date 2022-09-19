package replit.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class C14 {
    /*
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından descendingIterator()
    fonksiyonunu kullanarak ters sıradan yazdıralım.

    TreeSet elemanları: yesil,sari,mavi,turuncu,kirmizi
    Beklenen Çıktı:
    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
    Tersten Siralanisi:
    yesil
    turuncu
    sari
    mavi
    */
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(Arrays.asList("yesil", "sari", "mavi", "turuncu", "kirmizi"));
        //replit add ile eklemeyi kabul ediyor
        System.out.println("Orjinal Tree sonucu: " + treeSet);
        System.out.println("Tersten Siralanisi:");
        Iterator it1 = treeSet.descendingIterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());


        }
    }





    }
