package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
      /*
      Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
      FileInputStream Class'indan yardim aliriz.
      Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya
      ekleme veya update yapmak istersek
      FileOutputStream Class'indan yardim aliriz.

       */
      //public static void main(String[] args) throws FileNotFoundException {
         // FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");
          // bu ismi Test.txt dosyasina sag click-->Copy/Path Referans-->
          // cikan isme tikliyoruz ve  parantezin icine "" koyarak "" içine yapistiriyoruz
          // FileInputStream altini kirmizi cizgi veriyor uzerine gelip more actions dan 1.sikki isaretleriz
          // main yanina throws FileNotFoundException gelir
           /*
          Goruldugu gibi compile time'da altini kirmizi cizen her durum
          Compile Time Error degildir
          Java'da bazi exception'lar da
          Compile Time Exception'dir
          Ozellikle dosya okuma ve yazma ile ilgili exception'lar
          Compile Time Exception'dir

          Compile time Exception olustugunda Java cozum icin 2 ihtimal onerir
          1- try-catch ile cevrelemek
          2- method signature'ina throws keyword ile beklenen exception turunu yazmak

          throws Exception , sadece olayin farkinda oldugumuzun deklarasyonudur
          exception'in handle(ele almak,kontrol altina almak) edilmesinde hicbir rolu yoktur
          Yani try catch ile kontrol altina aldigimiz exception'lar da
          kod calismaya devam ediyordu
          Ancak throws Exception yazdigimizda Java bir exception ile karsilasirsa
          hic bir sey yapmamisiz gibi hata mesaji yayinlayip, calismayi durdurur
         */


}
