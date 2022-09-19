package replit.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class C08 {
    public static void main(String[] args) {
        /*Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

        LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

        Beklenen Çıktı:
        Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
        Listenin ilk elemani: sari
        listenin son elemani: beyaz

         */
        LinkedList<String> ll = new LinkedList<String>(Arrays.asList("sari","mavi","turuncu","siyah","yesil","beyaz"));

        System.out.println("Orjinal list elemalari : "+ll);
        System.out.println("Listenin ilk elemani : "+ll.peekFirst());
        System.out.println("Listenin son elemani : "+ll.peekLast());

        //iterator ile cozumu
        ListIterator lit1= ll.listIterator();
        System.out.println("ilk eleman : "+lit1.next());
        ListIterator lit2= ll.listIterator(ll.size());
        System.out.println("son eleman : "+lit2.previous());



    }
}
