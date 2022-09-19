package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Leyla");
        ll3.add("Salih");

        //queue kuyruk demektir. sira onemlidir
        //gelen sona gelir,giden bastan gider.
        System.out.println(ll3);//[Adem, Zeynep, Leyla, Salih]
        System.out.println(ll3.remove());// Adem
        System.out.println(ll3);//[Zeynep, Leyla, Salih]
        System.out.println(ll3.remove("Leyla"));// true (listede var ve sildim)
        System.out.println(ll3);// [Zeynep, Salih]
        System.out.println(ll3.element());//Zeynep (ll3'un ilk siradaki elementi'i getirir
        System.out.println(ll3.peek());//Zeynep
        //peek() ve element() silmeden ilk elementi dondurur
        // element() methodu Queue bossa exception dondurur
        // peek() Queue bossa null dondurur

        Queue<String> ll4 = new LinkedList();
        //System.out.println(ll4.element()); Run Tme Exception (throws exception NoSuchElementException)
        System.out.println(ll4.peek());//null
        // peek ve element silmeden ilk elementi bize dondurur
        // aralarindaki fark bos liste olursa peek null doner, element exception firlatir

        ll3.offer("Ahmet");
        ll3.offer("Esma"); //offer  sona ekler
        System.out.println(ll3);//[Zeynep, Salih, Ahmet, Esma]

        System.out.println(ll3.poll());//Zeynep ilk elemani siler
        //System.out.println(ll4.remove());// ll4'un ilkelemanini silmek istedik ve olmayinca NoSuchElementException RT Exc
        System.out.println(ll4.poll());//null
        System.out.println(ll3.remove());// ilk elemani siler


    }
}
