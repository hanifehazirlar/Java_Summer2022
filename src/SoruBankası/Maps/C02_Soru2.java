package SoruBankası.Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_Soru2 {
    /*
    2) There is a Map which contains product names as key and number of the products as value.
       Type code to check if ‘Laptop’ is among the products
       Anahtar olarak ürün adlarını ve değer olarak ürün sayısını içeren bir Harita bulunmaktadır.
        Ürünler arasında "Dizüstü Bilgisayar" olup olmadığını kontrol etmek için kodu yazın
     */
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        String arananUrun="Laptop";
        String sonuc="";
        for (String each: product.keySet()) {
            if (each.equalsIgnoreCase(arananUrun)){
                sonuc="Aranan urun listede var";
                break;
            }else{
                sonuc="Aranan urun listede yok";

            }
        }
        System.out.println("sonuc : "+sonuc);

        if (product.containsKey("TV")){
            System.out.println("Aranan urun vardir");
        }else{
            System.out.println("Aranan urun yoktur");
        }
    }
}
