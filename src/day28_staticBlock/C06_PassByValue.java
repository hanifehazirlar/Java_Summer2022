package day28_staticBlock;

import java.util.ArrayList;
import java.util.List;

public class C06_PassByValue {
    public static void main(String[] args) {
        /*
        Bir list olusturalim.Eleman olarak 10,11,12 ekleyelim.Iki method olusturup list elemanlari artirmayi deneyelim
        -1.Method'da elemanlari for each loop kullanarak artirin
        -2.method'da elemanlri set method'u kullanarak artirin
        -method'lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim
         */
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);

        degistir(list);
        System.out.println("method 1'den sonra orıginal list : "+list); // [10,11,12]
        degistir2(list);
        System.out.println("method 2'den sonra orıninal list : "+list); // [13,14,15]
    }
    public static void degistir(List<Integer> list) {
        for (Integer each:list){
            each=each+3;
            System.out.print(each+" "); // 13 14 15 (10+3=13 11+3=14 12+3=15)
        }
        System.out.println();
        System.out.println("method 1' de list method()'u kullanmadan : "+list);//[10,11,12]
    }
    public static void degistir2(List<Integer> list){
        for (int i = 0; i <list.size(); i++) {
            list.set(i,list.get(i)+3);
            System.out.print(list.get(i)+" "); // 13 14 15 (10+3=13 11+3=14 12+3=15)
        }
        System.out.println();
        System.out.println("method 2' de list method()'u kullanarak : "+list); // [13,14,15]

    }
}
