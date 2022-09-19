package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        List ile calisirken en kotu ozelligi elemanlari tek tek eklemek
         */
        Integer [] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};
        /*
        bu kadar cok elemanli bir listeyi tek tek eleman
        olarak girmek yerine array olusturup,
        for loop ile olusturdugumuz list'e tasiyabiliriz
         */
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        Bu islemi yapmasi icin Java'nin olusturdugu bir method da var
        ancak bu yontemin cok yan etkisi var
         */
        List<Integer> sayilar2= Arrays.asList(arr);

    }

}
