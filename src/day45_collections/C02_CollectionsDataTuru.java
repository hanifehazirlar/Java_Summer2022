package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        // liste.add(5);
        // liste.add('s');
        // liste.add(true);
        //Data Turu olarak String sectigimiz icin String eklememiz gerekir
        List<Object> list=new ArrayList<>();
         list.add(5);
         list.add('s');
         list.add(true);
         list.add("Ali");
        System.out.println("list : "+list);// list : [5, s, true, Ali]
        //list.set(0,(list.get(0)+5);
        list.set(0,(Integer)list.get(0)+5);
        System.out.println(list);
        //list.set(3,list.get(3)+"Can");

        list.set(2,(boolean)list.get(2));
        System.out.println(list);
         //Data Turu olarak Object secersek Object tum class'larin atasi oldugu icin farkli data turu ekleyebiliyoruz
        // B ucollections'in bir ozelligidir
        // ama islem yaparken sorun yasayabiliriz.Amacimiz sadece depolamak ise
        // arkli data turu elemanlar eklemede sikinti olmaz.

        Set<Object> set1=new HashSet<>();//HashSet class'inda olusturduk objeyi.
        set1.add(5);
        set1.add(true);
        set1.add('*');
        System.out.println("set1 : "+set1);// set1 : [5, *, true]

    }
}
