package day43_interfaces_iteretors;

import java.util.*;

public class M06_Soru4 {
     /*
     Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
     */
     public static void main(String[] args) {
         //List<String> names = new ArrayList<>(Arrays.asList("Ali","Fatma","Ayse","Salih","Esma","Hamza"));
         List<String> names =Arrays.asList("Ali","Fatma","Ayse","Salih","Esma","Hamza");
         ListIterator<String> lit1=names.listIterator(names.size());// buraya index girip islem yapmaya istedigimiz
                                                                     // elemandan baslayabiliriz.
                                                               // iterator'u girdigimiz index'deki elemani soluna koyar
         String temp="";
         while(lit1.hasPrevious()) {
             temp=(String) lit1.previous()+" ";
             System.out.print(temp);//Hamza Esma Salih Ayse Fatma Ali

         }

     }
}
