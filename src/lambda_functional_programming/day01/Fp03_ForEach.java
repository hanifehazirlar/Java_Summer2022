package lambda_functional_programming.day01;

import java.util.Arrays;
import java.util.List;

public class Fp03_ForEach {
    public static void main(String[] args) {
        /*
        1)  forEach() ;
           En basit ve en çok kullanılan, Stream içindeki veriyi tek tek tüketmek için oluşturulmuş bir yapıdır.
           Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir
           ve artık kullanılamayacağı anlamına gelir.
           Örnek üzerinde inceleyelim ;
         */
        List<Integer> list = Arrays.asList(5,1,2,5,7,9,6,4);
        System.out.println(list);//[5, 1, 2, 5, 7, 9, 6, 4]
        list.stream().forEach(t->System.out.print(t+ " ")); // 5 1 2 5 7 9 6 4
        // 2.yol
        list.stream().forEach(System.out::println);// bu sekilde de olur alt alta yazdirir

        // 5 sayısı bizim için uğurlu olduğunu var sayalım.Her 5 sayısı ile karşılaşıldığında ekrana "Şanslısın!" desin.
        list.stream().forEach(t->{if (t==5) System.out.println("Sanlisin");});
        //Sanlisin
        //Sanlisin


    }
}
