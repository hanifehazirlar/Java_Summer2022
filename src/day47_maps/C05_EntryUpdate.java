package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {
        //soyismi Can olanlarin bransini DataScience yapalim
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        // entryleri alalim
        System.out.println(sinifListMap.entrySet());
        //[101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Devaps, 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester]
        Set<Map.Entry<Integer, String>> entrySeti=sinifListMap.entrySet();

        System.out.println(entrySeti);
        //[101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Devaps, 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester]

        String entryValue;
        String[] entryArr;

        for (Map.Entry<Integer, String> entry : entrySeti) {//1.dongu 101=Ali, Can, JDev,

        entryValue=entry.getValue();// Ali, Can, JDev

        entryArr=entryValue.split(", ");//[Ali, Can, JDev]


        if (entryArr[1].equals("Can")){ // soyisim 1.index'de o yuzden entryArr[1]
            entryArr[2]="DataScience";  // brans 2.index'de o yuzden entryArr[2]

            entry.setValue(entryArr[0]+", "+entryArr[1]+", "+entryArr[2]);

            // atayacagimiz degeri setValue() parantezinin icine yazmaliyiz
        }
        }
        System.out.println(sinifListMap);
        //{101=Ali, Can, DataScience, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Devaps, 105=Enes, Can, DataScience, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}
    }
}
