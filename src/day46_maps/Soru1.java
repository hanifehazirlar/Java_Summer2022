package day46_maps;

import java.util.HashMap;

public class Soru1 {
    /*
    Soru 1 ) Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method
            yaziniz
    Ornek : Input : Hellooo output : H=1, e=1, l=2, o=3
    */
    public static void main(String[] args) {
        String input="Hellooo";
        System.out.println(harfSayisiBul("Input"));//{p=1, t=1, u=1, I=1, n=1}

    }
    public static HashMap<String, Integer> harfSayisiBul(String input) {
        HashMap<String, Integer> harfVeSayisiMap = new HashMap<>();
        String[] hashMapArr = input.replaceAll("\\W","").split("");
        Integer harfSayisi=1;
        for (String each:hashMapArr) {
            if (!harfVeSayisiMap.containsKey(each)){
                harfVeSayisiMap.put(each,1);
            }else {
                harfSayisi =harfVeSayisiMap.get(each);
                harfVeSayisiMap.put(each,harfSayisi+1);
            }
        }
        return harfVeSayisiMap;
    }

}
