package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap= ReusableMethods.mapOlustur();
        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();
        System.out.println("Cleardan sonra map : " + sinifListMap);//Cleardan sonra map : {}

        sinifListMap=ReusableMethods.mapOlustur(); // clear'dan sonra listeyi tekrar yukledik
        System.out.println(sinifListMap.getOrDefault(104, "Aradıgınız key yok"));//Derya, Deniz, Devaps
        System.out.println(sinifListMap.getOrDefault(110, "Aradıgınız key yok"));//Aradıgınız key yok
        // getOrDefault() methodu aradigimiz key Map'de varsa values'i getirir
        // yoksa icine yazdıgimiz yaziyi getirir.

        System.out.println(sinifListMap.isEmpty());// false

        System.out.println(sinifListMap.putIfAbsent(104, "Derya, Okyanus, Developer"));//Derya, Deniz, Devaps
        System.out.println(sinifListMap.putIfAbsent(108, "Aysun, Can, Devops"));//null
        //putIfAbsent() methodu Map'de belirtigimiz key'de values varsa bir sey yapmaz aynisini dondurur
        //yoksa belirtigimiz values'leri atar ve null dondurur ve values'leri belirttigimiz key'e atar

        ReusableMethods.entryYazdir(sinifListMap);
        /*
        SinifListesiMap'e key olarak 106 yoksa , value "Mevlut, Han, Tester" ekleyin
        106 daha onceden varsa, "eski degeri degistirmek istediginizden emin misiniz ?"
        yazdirin. putIfAbsent methodu ile cozun.
        106'nin oldugunu kontrol etmek icin containskey daha mantikli ama biz yeni ogrendigimiz method ile yapalim

        map.putIfabsent (key, value) ==> key varsa
          ekleme yapmaz, bize o key ile kayitli olan value'yu dondurur
          ==> key daha onceden map'e eklenmemisse
          eklemeyi yapar ve bize null dondurur
        */
        if (sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester")==null){
            System.out.println("Kayit basarili");
        } else {
            System.out.println("Eski degeri degistirmek istediginzden emin misiniz?");
            //Eski degeri degistirmek istediginzden emin misiniz?
        }
        System.out.println(sinifListMap.putIfAbsent(109,"Mevlut, Han, Tester"));//null
        ReusableMethods.entryYazdir(sinifListMap);
        /*
        101=Ali, Can, JDev
        102=Enes, Cem, Tester
        103=Taha, Emre, JDev
        104=Derya, Deniz, Devaps
        105=Enes, Can, Tester
        106=Taha, Deniz, JDev
        107=Derya, Cem, Tester
        108=Aysun, Can, Devops
        109=Mevlut, Han, Tester
         */

        sinifListMap.remove(106);//106'yi silip bana sildigini dondurur
        sinifListMap.remove(109,"Esma, Gul, JDev");//yazdirirsak false doner
        // iki remove sekli de silme islemini yapar sadece dondurdukleri degisir

        ReusableMethods.entryYazdir(sinifListMap);
        /*
        101=Ali, Can, JDev
        102=Enes, Cem, Tester
        103=Taha, Emre, JDev
        104=Derya, Deniz, Devaps
        105=Enes, Can, Tester
        107=Derya, Cem, Tester
        108=Aysun, Can, Devops
        109=Mevlut, Han, Tester
         */
        sinifListMap.replace(105,"");//value ya hi.l'k yapti
        ReusableMethods.entryYazdir(sinifListMap);


    }

}
