package day43_interfaces_iteretors;

import java.util.*;

public class M05_Soru3 {
    /*
    Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …
    (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
    Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
    output: [23,40]
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        ListIterator lit1=list.listIterator();

        Integer temp;
        while(lit1.hasNext()) { // lit1'in yaninda eleman oldugu müddetce devam eder
            temp=(Integer)lit1.next();
            if (!(temp>=20 && temp<=40)){
                lit1.remove();
            }
        }
        System.out.println(list);//[23, 40]
    }
}
