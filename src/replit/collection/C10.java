package replit.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class C10 {
    /*
       Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

       LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

       hint(ipucu): Collections.swap();

       Beklene Çıktı:
       Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
       Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
    */
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList<>(Arrays.asList("mavi","kirmiz","beyaz","siyah","yesil","turuncu"));
        System.out.println("Baslangicta linkedList : "+linkedList);
        Collections.swap(linkedList,0,3);
        //Collections.swap() methodu icin ilk siraya list'in adi 2.siraya degistirmek istedigimiz ilk elemanin index'i
        //3.siraya degistirmek istedigimiz ikinci elemanin index'i'
        System.out.println("Collections.swap()'tan sonra linkedList : "+linkedList);

    }
}
