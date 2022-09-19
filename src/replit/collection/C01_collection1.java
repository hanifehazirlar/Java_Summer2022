package replit.collection;

import java.util.ArrayList;
import java.util.List;

public class C01_collection1 {
    /*Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

    Array elemanları: siyah,sari,mavi,turuncu

    Beklenen Çıktı:
            siyah
            sari
            mavi
            turuncu
            */
    public static void main(String[] args) {
       List<String> arr=new ArrayList<>();
       arr.add("siyah");
       arr.add("sari");
       arr.add("mavi");
       arr.add("turuncu");
        for (int i = 0; i <arr.size(); i++) {
            System.out.println(arr.get(i)); // get() methodu List de kullanılır ve istenilen index teki elemani getirir
        }
    }
}
