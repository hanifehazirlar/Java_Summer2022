package SoruBankası.Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Soru1 {
    /*
    1) There is a Map which contains product names as key and number of the products as value.
    Type code to find the total number of products
    Anahtar olarak ürün adlarını ve değer olarak ürün sayısını içeren bir Harita bulunmaktadır.
    Toplam ürün sayısını bulmak için kodu yazın
     */

    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        Integer toplam=0;
        for (Integer each: product.values()) {
            toplam+=each;
        }
        System.out.println("Toplam :"+toplam);

    }

}