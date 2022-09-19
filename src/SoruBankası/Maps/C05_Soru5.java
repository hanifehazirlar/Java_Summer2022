package SoruBankası.Maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Soru5 {
    /*
    5) Type code to count the number of occurrences of the words in a String. (Case insensitive)
    Bir Dize'deki kelimelerin oluşum sayısını saymak için kod yazın. (Büyük/küçük harfe duyarsız)
    String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
     */
    public static void main(String[] args) {
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        s=s.replace(".","").toLowerCase();
        System.out.println(s);//Apex is easy Type codes to learn apex To earn money learn apex

        Map<String,Integer> map = new HashMap<String,Integer>();
        String [] arr=s.split(" ");

        for (String each : arr) {
            if (!map.containsKey(each)){
                map.put(each,1);
            }else{
                map.put(each,map.get(each)+1);// get'in icine yazdigimiz key'in value'su geliyor

            }
        }
        System.out.println(map);//{codes=1, money=1, learn=2, earn=1, is=1, to=2, type=1, easy=1, apex=3}



    }
}
