package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : "+ sayilar1.size()); // Listenin Boyutu : 3
        // size() bize list in element sayisini,boyutunu verir
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);// [5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin yeni boyutu : "+ sayilar1.size()); // Listenin yeni Boyutu : 8

        sayilar1.set(2,8); // sayilar1'in 2.index indeki ifadeyi silip yerine 8'i atadi.
        // burada sout'dan once atama yaptigimiz icin eski degeri yazdirmiyor
        System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12)); // 5    (atamayi sout'un icinde yaptigimiz icin
                                                     // burada önce silinen degeri yazdiriyor)
        System.out.println(sayilar1);  // [12, 3, 8, 2, 5, 3, 2, 2]  // Ikinci defa yazdirdigimizda
                                                                    // atama yapilmis halinin yazdiriyor
          /*
         set method'u istenen index'deki eski elementi silip,
          yerine verdigimiz yeni elementi set eder.
          eger eski elementi silmek istemiyorsak,

          add(index,deger) method'unu kullanabiliriz
          set() sildigi eski elementi de bize dondurur
         */


    }
}
