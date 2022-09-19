package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{
    /*
      Abstract parent silsilesinden gelen
      ilk concrete class
      Parent'i olan tum class'daki abstract method'lari
      concrete hale donusturmek (override etmek) ZORUNDADIR
      Bu kuralin istisnasi
      parent class'lardan herhangi birinde
      concrete hale donusturulmus, abstract method'lardir
     */
    /*
    FMercedes(parent) abstract class'inda DAraba(grandparent) abstract class'inda ki
    tum abstract methodlarin hepsi FMercedes(parent) abstract class'inda
    olusturuldugu icin(tum kurallari gerceklestirdigi icin) child class olan (concrete class) HA160' a is kalmamistir.
    Bu yuzden H160'da abstract methodlari cagirmak zorunda degiliz istersek cagirabiliriz de
     */
    public static void main(String[] args) {
        HA160 araba1=new HA160();

        // concrete bir class dan istedigimiz bir objeyi uretebiliriz

        FMercedes araba2=new FMercedes();
        // FMercedes de concrete
        //EToyota araba3=new EToyota();
        DAraba arb=new HA160();
        EToyota araba4=new GCorolla(); // boyle olursa sorun cıkmaz.Data turu abstract olabilir constractor'i abstract olamaz
                                       // bu yuzden constractor'i concrete child class olan GCorolla () sectik
        //Abstract class'lar constractor barindirir ama obje uretemezler
        // EToyota class'i abstract class oldugundan obje uretilemez

        //List<String> list1=new List<String>(); //List'de bir abstact class'dir obje uretemz
        List<String> list2=new ArrayList<String>(); //ArrayList List'in concrete child class'idir
        /*
         Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        Data turunu istedigimiz abstract class
        constructor'i ise child'i olan concrete bir class'dan seceriz
         */
    }

}
