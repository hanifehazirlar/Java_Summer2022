package SoruBankası.Maps;

import java.util.*;

public class C06_Soru6 {
    /*
    6) How to check the number of repeated elements in a List
       Bir Listede tekrarlanan öğelerin sayısı nasıl kontrol edilir
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer, Integer> myMap = new HashMap<>();
        Map<Integer, Integer> tekrarEdenMap = new HashMap<>();
        for (Integer each:myList) {
            if (!myMap.containsKey(each)){
                myMap.put(each,1);
            }else{
                myMap.put(each,myMap.get(each)+1);
            }
        }
        System.out.println(myMap);//{35=1, 21=2, 12=3, 13=1}
        //bu kisimda tekrarli kac eleman var onu bulduk
        int kacTane=0;
        for (Integer each:myMap.values()) {
            if (each!=1){
                kacTane++;
            }
        }
        System.out.println("Tekrar eden eleman sayisi : "+kacTane+" tane");//Tekrar eden eleman sayisi : 2 tane

        //tekrar eden elemanlardan hangisi kaç kez tekrar etmis bulmak istersek tekrarli kac eleman var bulmak istersek
        Set<Map.Entry<Integer, Integer>> entr = myMap.entrySet();
        int count=0;
        for (Map.Entry<Integer, Integer> each: entr) {
            if (each.getValue()>1){
                count++;
                System.out.println("there are "+ each.getKey() + ", "+ each.getValue()+" defa tekrar etmis");
                //there are 21 = 2 defa tekrar etmis
                //there are 12 = 3 defa tekrar etmis
                System.out.println("Tekrar eden eleman sayisi : "+kacTane+" tane");//Tekrar eden eleman sayisi : 2 tane


            }
        }
    }
}