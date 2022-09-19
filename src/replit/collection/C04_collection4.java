package replit.collection;

import java.util.ArrayList;
import java.util.List;

public class C04_collection4 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

        Array Elemanları: sari,yesil,mavi,pembe

         mavi rengini turuncu ile değiştirelim.

        Beklene Çıktı:
        [sari,yesil,mavi,pembe]
        [sari,yesil,turuncu,pembe]

         */
        List<String> arr=new ArrayList<>();
        arr.add("sari");
        arr.add("yesil");
        arr.add("mavi");
        arr.add("pembe");
        System.out.println(arr);
        int mavininIndexi=arr.indexOf("mavi");
        arr.set(mavininIndexi,"turuncu"); // set() methodu istenilen index teki elementin yerine istenen elemani koyar
        System.out.println(arr);
    }
}
