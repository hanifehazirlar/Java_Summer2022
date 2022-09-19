package replit.collection;

import java.util.ArrayList;
import java.util.List;

public class C02_collection2 {
    public static void main(String[] args) {
           /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

       Array List: siyah,mavi,kirmizi,beyaz

      en başa: pembe

      mavi-kirmizi arasına yesil renk eklenecek.

     Beklenen Çıktı:
     [pembe,siyah,mavi,yesil,kirmizi,beyaz]
         */
        List<String> arr=new ArrayList<>();
        arr.add("siyah");
        arr.add("mavi");
        arr.add("kirmizi");
        arr.add("beyaz");
        arr.add(0,"pembe"); // Bu sekilde istenilen index e istenilen elemani koyar diger elemanlari saga kaydirir


        int kirmizininIndex=arr.indexOf("kirmizi");

        arr.add(kirmizininIndex,"yesil");
        System.out.println(arr);
    }
}
