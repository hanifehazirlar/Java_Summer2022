package SoruBankası.Maps;

import java.util.*;

public class C04_Soru4 {
    /*
    There is a Map which contains product names as key and number of the products as value.
    Print the product names in alphabetical order
    Anahtar olarak ürün adlarını ve değer olarak ürün sayısını içeren bir Harita bulunmaktadır.
    Ürün adlarını alfabetik sırayla yazdırın
     */
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);
        List<String> mapKeyList = new ArrayList<String>(product.keySet());
        Collections.sort(mapKeyList);
        System.out.println(mapKeyList);//[Laptop, Mobile Phone, Music System, Refrigerator, TV]

    }
}
