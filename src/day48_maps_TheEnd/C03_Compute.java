package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {
        Map<String,Integer> harfMapi=new HashMap<>();
        harfMapi.put("A",5);
        harfMapi.put("B",1);
        harfMapi.put("C",2);
        harfMapi.put("D",4);
        harfMapi.put("E",4);
        System.out.println(harfMapi);//{A=5, B=1, C=2, D=4, E=4}

        harfMapi.compute("A", (k,v)->v*2+3);
        // map'de compute() methodu value'larda matematiksel ifadelerle degisiklik yapmamizi saglar
        //Map<String,String> ise o zaman compute methodu + ile concat yapar diger islemler kullanilmaz
        harfMapi.compute("D",(a,b)->b*b);
        harfMapi.computeIfAbsent("C",(v)->30);
        harfMapi.computeIfAbsent("F",(v)->30);

        //Map'de computeIfAbsent() methodu belirtigimiz key varsa degisiklik yapmaz
        //yoksa belirtigimiz key'in value'sunu degistirir
        harfMapi.computeIfPresent("E",(k,v)->v+5);
        harfMapi.computeIfPresent("G",(k,v)->v+5);
        //Map' de compute() methodu varsa degisim yapar, yoksa hic bir sey yapmaz aynisini kalir
        System.out.println(harfMapi);//{A=13, B=1, C=2, D=16, E=9, F=30}
        //burada computeIfAbsent methodu ile F=30 eklenmis
        //computeIFPresent methodu ile E' ye 5 eklemis E=9 olmus



    }
}
