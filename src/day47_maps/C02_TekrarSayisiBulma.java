package day47_maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        //Verilen bir String'deki kullanilan harfleri
        //ve kullanilan harflerin tekrar sayisini
        //H=20 seklinde yazdirin
        String str= "Heeeeellllooooo Woooorrrrllllllddddd.";
        //harf disindaki karakterleri yok edelim
        str=str.replaceAll("\\W","");
        String[] harflerArr=str.split("");

        //harfleri key,kullanim adedini value yaparak bir map olusturalim
        Map<String,Integer> harflerMap=new HashMap<>();
        Integer harfKullanimSayisi;
        for (String each:harflerArr) {
            if (!harflerMap.containsKey(each)) {//harf daha once eklenmemisse Map'e ekle
                harflerMap.put(each,1);
            }else {
                harfKullanimSayisi =harflerMap.get(each);// get'in icine yazdigimiz key'in value'su geliyor
                harflerMap.put(each,harfKullanimSayisi+1);
            }
        }
        System.out.println(harflerMap);//{r=4, d=5, e=5, W=1, H=1, l=10, o=9}
        System.out.println(harflerMap.get("r"));//4 Map'de get() methodu girdigimiz Map'in key'inin value'sunu bize  dondurur
        Map<String,String> harflerMap1=new HashMap<>();
       harflerMap1.put("a","b");
       harflerMap1.put("c","d");
        System.out.println(harflerMap1.get("b"));//null
        System.out.println(harflerMap1.get("c"));//d
    }
}
