package lambda_functional_programming.day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 9, 131, 10, 9, 10, 2, 8);
        System.out.println(list);//[8, 9, 131, 10, 9, 10, 2, 8]

        //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
        tekrarsizCiftElemanlarinKupleriCarpimi(list);// 4096000

        //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
        getMaxEleman01(list);// 131

        //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.(sort methodu ile)
        getMaxEleman02(list);//131

        ///Ödev
        //   8) List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
        getMinEleman(list);

        //   9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
        getYedidenBuyukMin(list);// 8

        // 9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.(sorted ile)
        getYedidenBuyukMin2(list);// 8

        // 9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
        // (sorted ile Comparator.reverseOrder())
        getYedidenBuyukCiftMin3(list);// 8

        //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu)
        // bulan(list olarak) bir method oluşturun.
        getTersSiralamaylaTekrarsizElemanlarinYarisi(list);//[65.5, 5.0, 4.5, 4.0]

    }

    public static void getMinEleman(List<Integer> list) {
       Integer min= list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("List Elemanlarinin En Kucugu : "+min);
        Integer min1=list.stream().distinct().sorted().findFirst().get();
        System.out.println("findFirs :"+min1);
    }

    public static void tekrarsizCiftElemanlarinKupleriCarpimi(List<Integer> list) {
        Integer carpim=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        //[8, 9, 131, 10, 9, 10, 2, 8]
        //distinct()'dan sonra 8, 9, 131, 10, 2
        //filter()'dan sonra 8, 10, 2
        //map()'dan sonra 512, 1000, 8
        // reduce ==> (1, 512)->1*512=512
        //           (512,1000)->512*1000=512000
        //           (512000,8)->512000*8=4096000

        //reduce() methodu tek bir degere indirgemek icin kullanilir.Bu ornekte carpma islemi yaptigimiz icin carpma isleminde
        //etkisiz eleman olan 1'i baslangic elemani olarak yazdik.
        System.out.println("Tekrarsiz Cift Elemanlarin Küpleri Carpimi : "+carpim);
    }
    //1.yol
   public static void getMaxEleman01(List<Integer> liste) {
        Integer max=liste.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        //once ayni elemanlari distinct() ile tekrarlilari eledik
        //reduce() methodunda baslangic degeri olarak Integer.Min_VALUE atamamizin sebebi; elemanlarim negatif de olabilir
        //ve kac olacaklarini bilmiyorum bu yuzden en kucuk Integer degeri aldik
        //[8, 9, 131, 10, 9, 10, 2, 8]
        //distinct()'den sonra 8, 9, 131, 10, 2
        //reduce (min,8)->min>8 ? hayir 8 alir
        //(8,9)->8>9 ? hayir 9 alir
        //(9,131)->9>131 ? hayir 131 alir
        //(131,10)->131>10 ? evet 131 alir
        //(131,2)->131>2 ? evet 131 alir
        System.out.println("List'in en buyuk elemani : "+max);//131
    }
    // 2.yol
    private static void getMaxEleman02(List<Integer> liste) {
        Integer max=liste.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        //2.yol ==>Integer max=liste.stream().distinct().sorted().reduce((t,u)->u).get();
        //baslangic degeri atamazsak get() methodu ile sonucu getiriyoruz
        //[8, 9, 131, 10, 9, 10, 2, 8]
        //distinct()'den sonra 8, 9, 131, 10, 2
        //sorted()'den sonra 2, 8, 9, 10, 131
        //reduce  min,(min,2)->2
        //            (2,8)->8
        //           (8, 9)->9
        //           (9, 10)->10
        //          (10, 131)->131
        System.out.println("List'in Elemanlarinin Sorted Methodu ile  En Buyugu : "+max);//131
    }
    //1.Yol
    public static void getYedidenBuyukMin(List<Integer> liste) {// 8,10
        Integer min=  liste.stream().distinct().filter(t->t%2 == 0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
        System.out.println("List Elemanlarindan 7'den Buyuk Cift Sayilarin En Kucugu : "+ min); // 8
    }
    public static void getYedidenBuyukMin2(List<Integer> liste) {
        Integer min=liste.stream().distinct().filter(t->t%2==0 && t>7).sorted(Comparator.reverseOrder()).
                    reduce(Integer.MAX_VALUE,(t, u)->u);//sonradan geleni al demek boylece en sondaki ve en kucuk deger gelir

        //sorted(Comparator.reverseOrder())==> sorted ile sirala ama icinde Comparator.reverseOrder() old. icin tersten(buyukten kucuge) sirala
        System.out.println("List Elemanlarindan 7'den Buyuk Cift Sayilarin En Kucugu Comparator.reverseOrder() ile : "+min);//8
        //Comparator.reverseOrder() bu method class ismi ile getirildigi icin static bir methoddur.
        // Static olmayan methodlari obje ile cagirmamiz gerekir

    }
    //3.Yol
   public static void getYedidenBuyukCiftMin3(List<Integer> liste) {
       Integer min= liste.stream().distinct().filter(t->t%2==0 && t>7).sorted().findFirst().get();
       //sorted'dan sonra 8, 10
       // findFirst() methodu ilk siradaki elemani buluyor yani 8
       // get()' de 8'i getiriyor
       System.out.println("List Elemanlarindan 7'den Buyuk Cift Sayilarin En Kucugu findFirst ile : "+min);//8
    }
    private static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> liste) {
        List<Double> sonuc= liste.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(sonuc);//[65.5, 5.0, 4.5, 4.0]

        //[8, 9, 131, 10, 9, 10, 2, 8]
        //distinct()'den sonra 8, 9, 131, 10, 2
        //filter()'den sonra  8, 9, 131, 10
        //map()'den sonra   4.0, 4.5, 65.5, 5.0
        //sorted(Comparator.reverseOrder()'den sonra 65.5, 5.0, 4.5, 4.0 buyukten kucuge(tersten) siraladi
        //collect(Collectors.toList())'den sonra [65.5, 5.0, 4.5, 4.0] olur

    }
}
