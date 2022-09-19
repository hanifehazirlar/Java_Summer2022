package lambda_functional_programming.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Fp02StreamMethodlari {
    /*
      stream() methodlari;Stream kelimesinin türkçesine baktığımızda “akış, nehir, akarsu” dur.
             Aslında bu şekilde düşündüğümüzde yapısını kolayca anlayabiliriz.
             Bir nehir var ve devamlı akmakta, akıp gittiği için stream içindeki elemanlar sadece bir kere ziyaret edilir.
             Aynı elemanı tekrar işleme dahil edebilmek için yeni bir stream/nehir oluşturmamız gerekmektedir.
             Bu akış genel itibariyle kullanmış olduğumuz işlemlerin türüne bağlı olacak şekilde bir boru hattı gibi düşünülebilir.
             Metod	        Açıklama
            forEach	 ---   İterasyon
            filter	---    Filtreleme
            map	   ---     Dönüştürme
            reduce	---    İndirgeme
            distinct --- Tekilleştirme
            sorted	---    Sıralama
            limit	---    Limitleme
            count	---    Sayma
            collect	 ---   Toplamak/Biriktirme
      1) Filter: Bir listeyi bir veya birden çok parametreye göre kısıtlayabiliriz.
                Örneğin elimizde kullanıcı listeli olsun ve bu listede kullanıcıların
                bazı kriterlerine göre listeyi indirgeyelim.
      2)  Sorted: Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz. 2 türü bulunmaktadır.
                  Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
                  İkinci formatı ise Comparator arayüzünden türediği için bizim belirlemiş olduğumuz
                  parametreye göre sıralama işlemi yapar.

      3) Map: Map, stream içerisinde erişilen her bir nesneye özgü işlemler yapmamızı sağlar.
               Örneğin elinizde rakamlar olan bir liste var map ile her rakamın karesini alabilir
               veya farklı matematiksel işlemler yapabilirsiniz.
      4) Match: Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
               Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
               değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır.

         a) noneMatch: Belirtilen kriter listede hiçbir elemanda bulunmuyor ise true döndürür.

         b) allMatch: Belirtilen kriter listede tüm elemanlarda bulunuyor ise true döndürür.

         c)  anyMatch: Belirtilen kriter listede herhangi bir elemanlarda bulunuyor ise true döndürür.
      5) Reduce: Türkçe karşılığı indirgeme/azaltma olarak geçen reduce çeşitli şekillerde kullanılırken
                genel olarak map metoduyla birlikte kullanılmakta. Tek başına reduce kullanımında elemanları
                teker teker işler. Bir önceki adımda elde edilen sonuç, bir sonraki elemanla işlemle tutulur.
       6) ForEach: En basit ve en çok kullanılan, Stream içindeki veriyi tek tek tüketmek için oluşturulmuş bir yapıdır.
                Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
                artık kullanılamayacağı anlamına gelir.
       7) distinct() :Stream içerisinde bulunan ve tekrar eden elemanlar varsa bunları distinct metodu ile çıkartabilir
                     ve elimizde tekrar etmeyen birbirinden farklı elemanlar barından bir veri setimiz kalır.
       8) limit() : Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
                   sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında Stream içerisinde dönen
                   çok sayıda veri var ancak sen bize şu kadarını göster diyoruz.
       9) count() :  Stream içerisinde bulunan toplam veri sayısını öğrenmemize yarar.
       10)collect() : Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye, veri yapısına dönüştürmek için kullanılır.
                     Collector arayüzünden türeyen bir parametre beklemektedir. Bu parametre bilgisi ile istenilen
                     türe dönüşüm sağlanabilir.
                     Collector türünden arayüzler Collectors sınıfının içinde bulunan metodlar ile elde edilebilir.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,5,4,7,9,10,12,7,5));
        System.out.println(list.stream().allMatch(t -> t % 2 == 0));//false
        //list' deki tum elemanlarin 2'ye bolumunden kalan sifir mi?
        System.out.println(list.stream().allMatch(t -> t > 0));//true
        //list' deki tum elemanlar 0'dan buyuk mu?
        System.out.println(list.stream().anyMatch(t -> t % 5 == 0));// true
        //list' deki herhangi bir eleman 5'e tam bolunuyor mu?
        System.out.println(list.stream().noneMatch(t -> t < 0));//true
        //list' deki hicbir eleman 0'dan kucuk degil mi?

        list.stream().filter(t -> t%2 == 0).limit(2).forEach(t -> System.out.print(t+" "));// 4 10
        System.out.println();
        System.out.println(list.stream().filter(t -> t % 2 != 0).findFirst().get()); // 3

        // Arraylerde Stream kullanabilmek icin 2 yol vardir
        //1) Stream <Integer> isim=Stream.Of(arr)
       // 2) Arrays.stream(arr).

        Integer [] arr1={2,5,7,6,9};
        Arrays.stream(arr1).filter(t -> t % 2 != 0).forEach(t -> System.out.print(t+" "));// 5 7 9
        System.out.println();
        Stream<Integer> streamArr=Stream.of(arr1);
        //streamArr.filter(t -> t % 2 != 0).forEach(t -> System.out.print(t+" ")); // 5 7 9
        //  Count() :Stream içerisinde bulunan toplam veri sayısını öğrenmemize yarar.
        System.out.println(streamArr.filter(t -> t % 2 != 0).count());//3


    }
}
