package day32_stringBuilder;

public class C08_equals_CompareTo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");

        String str="Java";
        // System.out.println(str==sb2); String ve StrinBuilder farkli data turu old.icin == kullanilamaz
        // altini kirmizi cizer(CTE)

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1)); // true




        // StringBuilder'da equals() methodu ancak ayni obje olursa true doner
        // String'deki gibi dusunmemek lazim

        System.out.println(sb1.compareTo(sb2)); // 0 (sb1 ile sb2'nin ayni indexlerindeki karakterlerin
                                               // ascii degerleri farkini verir)
        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3)); // -4

         /*
         compareTo() iki stringBuilder'i bastan baslayarak
         harf harf karsilastirir
         ilk harfler ayni ise, ikincilere gecer
         ikinciler ayni ise 3.lere gecer ve
         ilk farkli olan harfe kadar gider
         farkli olan iki harfin ascii kodlari arasindaki farki verir
         eger hic farkli harf yoksa
         sonuc olarak 0 dondurur
         */
    }
}
