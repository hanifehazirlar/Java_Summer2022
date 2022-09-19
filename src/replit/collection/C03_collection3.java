package replit.collection;

import java.util.ArrayList;
import java.util.List;

public class C03_collection3 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

        ArrayList elemanları: beyaz,siyah,sari,kirmizi,turuncu

        Beklenen Çıktı:
        Arrayin 1. elemani: beyaz
        Arrayin 3. elemani: sari
         */
        List<String> arr=new ArrayList<>();
        arr.add("beyaz");
        arr.add("siyah");
        arr.add("sari");
        arr.add("kirmizi");
        arr.add("turuncu");
        System.out.println("Array'in 1. elemani: "+arr.get(0));
        System.out.println("Array'in 3. elemani: "+arr.get(2));
    }
}
