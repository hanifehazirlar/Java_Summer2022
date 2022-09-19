package day42_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI=20;
    /*
     Interface bir class degildir.

     Abstract class'lar java'da abstraction  (soyutlastirma)
     islevini yapiyordu.
     Ancak abstract bir class'da abstract olmayan methodlar da olabilir
     bu da full abstraction yapma izn vermez

     Eger java'da icinde hic concrete
     method olmasin dedigimiz bir class olusturmak istiyorsaniz bunu class degil
     interface yapmalisiniz.

     1-INTERFACE'LERDE CONCRETE METHOD OLMAZ
     2-Interface'lar full abstraction yaptigindan Interface'lardan obje olusturulamaz
       Hatirladiginiz gibi Interface olan List'den obje olusturamiyorduk
       List<String> liste=new List <>();
       Bunun yerine constructor'i List'in child'i olan ArrayList'den seceriz
       List<String> liste1=new ArrayList<>();
       ArrayList' de List'in tum methodlari override edilmistir
     3-Class'larda bir child birden fazla parent edinemez
       Ancak Interface'lerde concrete method olmadigindan
       biz her methodu child class'da override etmek zorundayiz,
       Override ederken kimin soyledigini override ettigimizin onemi yok
     4- Interface'ler neyin yapilmasi gerektigini soyler
       ama nasil yapilacagina karismaz
     */
    // List<String> liste = new List<>(); Interface'de obje olusturlamadigi icin hata verdi

    List<String> liste1 = new ArrayList<>(); // List'in child i olan ArrayList'de olusturabildik


}