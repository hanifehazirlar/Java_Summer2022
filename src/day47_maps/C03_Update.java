package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
          map.containsKey(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
          map.containsValue(value) ==> bir butun olarak value'nun map'de olup olmadigini doner
          ONEMLI NOT : map.containsValue(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak
                      map uzerinde manipulation yapmamiz lazim
           map.get(key) ==> verilen key'e ait degeri dondurur
         */
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.containsKey(104));// true
        System.out.println(sinifListMap.containsKey(114));// false
        System.out.println(sinifListMap.containsValue("104"));// false
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true Map'in bir value'sunu bir butun olarak sorgular
        System.out.println(sinifListMap.containsValue("Ali"));//false

        // Verilen Map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // Kismi degisiklerde kullanilamaz
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        //Map'i guncelleme yapmak icin key,yeni degeri Map'e eklemeliyiz
        //ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin sinifListMap.put(101,Ali, Can, JavaDeveloper)  olmali

        //bunu yapabilmem icin herbir key'e ve ona ait value'ye ihtiyacim var

        System.out.println(sinifListMap.keySet());//[101, 102, 103, 104, 105, 106, 107]

        Set<Integer> keySeti =sinifListMap.keySet();
        String eachValue;

        System.out.println(sinifListMap.get(101)); // Ali, Can, JDev


        for (Integer each:keySeti) {//keySet=[101, 102, 103, 104, 105, 106, 107]

            eachValue=sinifListMap.get(each); // get(101)=Ali, Can, JDev...get(102)=Enes, Cem, Tester...

            eachValue=eachValue.replace("JDev","JavaDeveloper");

            sinifListMap.put(each, eachValue); //buradaki each Integer-eachValue String kismi
            /*
             biz key'lerin tamamini aldik
             herbir key'in value'sunu get'irdik
             value uzerinde degisikligi yapip
             yeni halini put(key, yeniDeger) ile map'e koyduk
             */

        }
        System.out.println(sinifListMap);
        // {101=Ali, Can, JavaDeveloper, 102=Enes, Cem, Tester, 103=Taha, Emre, JavaDeveloper,
        // 104=Derya, Deniz, Devaps, 105=Enes, Can, Tester, 106=Taha, Deniz, JavaDeveloper, 107=Derya, Cem, Tester}

    }
}
