package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifList = new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev");
        //Map key ve values'lardan olusur.key 1 tane,values istedigimiz kadar olabilir.Values aralarina virgul koyariz
        //virgulden sonra bosluk koyuyorsak her valuesten sonra virgul bosluk koymaliyiz.Yani format hepsinde ayni olmali
        sinifList.put(102,"Lale, Gul, Tester");
        sinifList.put(103,"Taha, Tan, JDev");
        sinifList.put(104,"Veli, Ak, Tester");
        //Burada yazilim sintex'i hepsi icin ayni olmali,yoksa hata verir
        System.out.println(sinifList);
        //{101=Ali, Can, JDev, 102=Lale, Gul, Tester, 103=Taha, Tan, JDev, 104=Veli, Ak, Tester}
        System.out.println(sinifList.keySet());//[101, 102, 103, 104] //tum key'leri dondurur
        System.out.println(sinifList.values());//[Ali, Can, JDev, Lale, Gul, Tester, Taha, Tan, JDev, Veli, Ak, Tester]
        System.out.println(sinifList.values().size());// 4

        // tum ogrencilerin isim ve soyisimlerini alt alta yazdirin
        Collection<String> tumValueColl=sinifList.values();
        String[] eachArr;
        int sira=1;
        for (String each:tumValueColl) {//burada tumValueColl olusturmadan sinifList.values() yazabilirdik
            eachArr = each.split(", ");
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);

            sira++;
            /*
            1- Ali Can
            2- Lale Gul
            3- Taha Tan
            4- Veli Ak
             */
        }
        //Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
        //bir sinif listesi olusturun
        List<String> sinifIsimSoyisimList=new ArrayList<>();
        for (String each:tumValueColl) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0]+" "+eachArr[1]);

        }
        System.out.println(sinifIsimSoyisimList);//[Ali Can, Lale Gul, Taha Tan, Veli Ak]

    }
}
