package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
          Java Entry<K,V> map'in icerisinde bulunan her bir kaydi
          K=V seklinde tutar
          dolayisiyla herhangi bir Entry'e ulastigimizda
          hem key'e hem de value'ya ulasabilir ve istedigimiz islemleri yapabiliriz
          entry.getKey() bize key'i getirir
          entry.getValue() bize value'yu getirir
          entry.setValue() value'yu istedigimiz deger olarak update eder
         */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        //Map'in her bir elemani alt alta yazdirin
        System.out.println(sinifListMap.entrySet());
        //[101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Devaps, 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester]
        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();

        for (Map.Entry each: sinifEntrySet) {
            System.out.println(each);
            /*
            101=Ali, Can, JDev
            102=Enes, Cem, Tester
            103=Taha, Emre, JDev
            104=Derya, Deniz, Devaps
            105=Enes, Can, Tester
            106=Taha, Deniz, JDev
            107=Derya, Cem, Tester
             */
            //Entry'nin istersem key'ini, istersem value'sunu alabilirm, get methodu da var
        }
        // Map'in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim
        String eachValue;
        System.out.println(sinifEntrySet);
        //[101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Devaps, 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester]

        for (Map.Entry<Integer,String> each: sinifEntrySet) {

            eachValue=each.getValue(); // 1.dongu  Ali, Can, JDEV
            eachValue=eachValue.replace("Tester", "QA");//varsa degistiriyor yoksa birsey yapmiyor
            each.setValue(eachValue);//eacValue 1.value'sunu  each'in 1.value'suna atiyor dongu boyle devam ediyor

            //each.setValue(each.getValue().replace("Tester", "QA"));  bu sekilde de yapabilirdik
        }
        System.out.println(sinifListMap);
        //{101=Ali, Can, JDev, 102=Enes, Cem, QA, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Devaps, 105=Enes, Can, QA, 106=Taha, Deniz, JDev, 107=Derya, Cem, QA}
    }
}
