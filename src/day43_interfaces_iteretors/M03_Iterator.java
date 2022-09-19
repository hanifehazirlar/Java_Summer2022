package day43_interfaces_iteretors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);// [10, 20, 30]
        // list'deki tum elementleri INDEX KULLANMADAN 3 artirin
        for (int each:list) {
            each+=3;
            System.out.print(each+" "); // 13 23 33 atama yapmadigimiz icn kalici olmadi
        }
        System.out.println();
        System.out.println(list);// [10, 20, 30]
        /*
        Java index yapisi olmayan collection'lardaki elementlere ulasmak veya
         degistirmek icin Iterator interface'ini olusturmustur.

         Iterator interface oldugundan ondan obje uretmemiz mumkun degil
         bunun yerine bize iterator donduren list.iterator() method'unu kullaniyoruz
         */
        Iterator it1=list.iterator();
         /*
        biz obje olusturmak icin;
        1-) new ClassAdi()
        2-) variableAdi.DataType kullanabiliriz(LocalDate yaptigimiz gibi..)
         */
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //System.out.println(it1.next());// 30'dan sonra element kalmadigindan next() RTE verir
        // Iterator 'da geri donus yok adim adim sona ulastiktan sonra basa donmek isterseniz
        // yeniden bir Iterator olusturmamiz gerekir

        // [10, 20, 30]
        Iterator it2 = list.iterator();
        //yeni it2'yi kullanarak listenin tum elementlerini silelim
        it2.next();//10'u yukledi
        it2.remove();//10'u sildi
        it2.next(); //20'yi yukledi
        it2.remove();//20'yi sildi
        it2.next(); //30'yi yukledi
        it2.remove();//30'yi sildi

        System.out.println(list);//iterator ile elementleri gezip, remove  yapinca
                                 // list kalici olarak degisti
        list.add(10);
        list.add(20);
        list.add(30);//list i yeniden doldurduk
        System.out.println("yeniden liste : "+list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {//it3'un yaninda eleman oldugu muddetce devam et
            it3.next();//yukledi
            it3.remove();//sildi
        }
        System.out.println("loop'dan sonra list : "+list);// [ ]+
         /*
         Goruldugu gibi Iterator kullanarak yapabildigim
        1- tum collection elementlerini yazdirmak
        2- tum collection elementlerini silmek
        Bu da bize yetmez
         */







    }
}
