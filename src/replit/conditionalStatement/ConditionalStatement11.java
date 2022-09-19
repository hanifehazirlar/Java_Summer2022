package replit.conditionalStatement;

import java.util.Scanner;

public class ConditionalStatement11 {
    public static void main(String[] args) {
      /*
       Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
       değilse sessiz harf olduğunu ekrana yazdırsın.
       Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
       (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

          Sesli harfler: a,e,i,o,u
          Test Data:
          a
          Beklenen Çıktı:
          a harfi sesli harfdir.
          Test Data:
          d
          Beklenen Çıktı:
          d harfi sesiz harftir.
          Test Data:
          we  yada %
          Beklenen Çıktı:
          Yanlis karakter girdiniz!

       */
        Scanner in=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String isim=in.next().toLowerCase();
        String sesliHarfler="a,e,i,o,u";
        char harf=isim.charAt(0);
        if (isim.length()!=1){
            System.out.println("Hatali giris, lutfen harf giriniz");
        }else if(!(harf>='a' && harf<='z')){
            System.out.println("Hatali giris, lutfen harf giriniz");
        }else if(sesliHarfler.contains(isim)){
            System.out.println(harf+" sesli harf");
        }else{
            System.out.println(harf+" sessiz harf");
        }
    }
}
