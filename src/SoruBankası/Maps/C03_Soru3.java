package SoruBankası.Maps;

import java.util.*;

public class C03_Soru3 {
    /*
    3) There is a Map which contains product names as key and number of the products as value.
       Print the prices in ascending order
       Anahtar olarak ürün adlarını ve değer olarak ürün sayısını içeren bir Harita bulunmaktadır.
        Fiyatları artan sırada yazdırın
     */
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53) ;

        System.out.println(product.values());//[82, 53, 12, 87, 53]

        List<Integer> listMapValue=new ArrayList<Integer>(product.values());
        Collections.sort(listMapValue);
        System.out.println(listMapValue);//[12, 53, 53, 82, 87]





    }

}
