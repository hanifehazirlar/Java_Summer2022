package SoruBankası;

public class C02 {
    public static void main(String[] args) {
       /*
      Bir String değişkeni oluşturun ve konsoldaki ilk karakter ve son karakter dışındaki tüm karakterleri büyük harflerle
      yazdırın.
     Örnek: Dize 'Java' ise konsola 'AV' yazdırmalısınız.
     */

        String str="hanife";
        String kalan=str.substring(1,str.length()-1).toUpperCase();
        System.out.println("kalan: " + kalan);
    }
}
