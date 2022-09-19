package replit.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C06_collection6 {
    public static void main(String[] args) {
         /*
        Bir linkedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

        LinkedList elemanları: sari,mavi,mor,yesil,beyaz

       Beklenen Çıktı:
       sari
       mavi
       mor
       yesil
       beyaz
         */
        LinkedList<String> arr=new LinkedList <>();
        arr.add("sari");
        arr.add("mavi");
        arr.add("mor");
        arr.add("yesil");
        arr.add("beyaz");


        for (int i = 0; i <arr.size(); i++) {
            System.out.println(arr.get(i));

        }
        // foreach ile çözümü
        for (String each:arr) {
            System.out.println(arr.get(arr.indexOf(each)));
        }
             {

        }







    }
}
