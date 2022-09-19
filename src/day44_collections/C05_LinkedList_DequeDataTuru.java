package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4 = new LinkedList();
        ll4.add("Ayse");
        ll4.add("Fatma");
        ll4.add("Salih");
        ll4.add("Hamza");
        ll4.add("Salih");
        ll4.removeLastOccurrence("Salih");//Birden fazla varsa en son olani sil
        System.out.println(ll4);//[Ayse, Fatma, Salih, Hamza]
        System.out.println(ll4.pop());//Ayse pop() ilk elementi getirir
        System.out.println(ll4.remove());//Fatma ilk elementi siler
        ll4.add("Kamil");
        ll4.add("Salih");
        ll4.add("Hamza");
        System.out.println(ll4);//[Salih, Hamza, Kamil, Salih, Hamza]
        System.out.println(ll4.removeFirst());//Salih ilk elementi siler
        System.out.println(ll4.removeLast()); //Hamza son elementi siler

    }
}
