package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
   /*
        sinifMap.put(no=102,isim=Enes, soyisim=Cem, brans=Tester);
        sinifMap.put(103,"Taha, Emre, JDev");
        sinifMap.put(104,"Derya, Deniz, Devaps")
    */
   public static void main(String[] args) {
       Map<String,String> ogr101=new HashMap<>();
       ogr101.put("isim","Enes");
       ogr101.put("soyisim","Cem");
       ogr101.put("brans","Tester");
       Map<String,String> ogr102=new HashMap<>();
       ogr102.put("isim","Taha");
       ogr102.put("soyisim","Emre");
       ogr102.put("brans","JDev");
       Map<String,String> ogr103=new HashMap<>();
       ogr103.put("isim","Derya, ");
       ogr103.put("soyisim","Deniz");
       ogr103.put("brans","Devops");

       Map<Integer,Map<String,String>> ogrnciNestedMap=new HashMap<>();
       ogrnciNestedMap.put(101,ogr101);
       ogrnciNestedMap.put(102,ogr102);
       ogrnciNestedMap.put(103,ogr103);

       System.out.println(ogrnciNestedMap);
       //{101={soyisim=Cem, brans=Tester, isim=Enes}, 102={soyisim=Emre, brans=JDev, isim=Taha},
       // 103={soyisim=Deniz, brans=Devops, isim=Derya}}
       //alt alta yazdirmak icin
       //key ve value bir arada almak istersek Entry set en ideali
       Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySeti=ogrnciNestedMap.entrySet();
       for (Map.Entry each:ogrenciEntrySeti) {
           System.out.println(each);
           /*
           101={soyisim=Cem, brans=Tester, isim=Enes}
           102={soyisim=Emre, brans=JDev, isim=Taha}
           103={soyisim=Deniz, brans=Devops, isim=Derya}
            */
       }

       //102 nolu kisinin ismini yazdiralim
       System.out.println(ogrnciNestedMap.get(102).get("isim")); // Taha


   }

}
