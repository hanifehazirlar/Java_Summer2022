package day40_final;

public class A {
    String isim = "Cuneyt";
    //final String okul="Yildiz Koleji"; // access modifier final oldugu icin son deger anlamina gelir ve degistirilemez
    // B child class'inda degerini degistirmek istedigimiz icin CTE verdi
    final static String OKUL = "Yildiz Koleji"; // child class'dan cagirabilmek  icin static static
                                               // ekledik ve variable ismini buyuk harflerle yazdik
     /*
     Bir variable final olarak tanimlandiysa
     baska class'lardan veya icinde oldugumuz class'dan
     bu variable'a baska deger atanmasi mumkun degildir.
     Madem ki degeri degistirilemiyor
     genelde static de yaparak
     bu variable'a erisim kolaylastirilabilir
     ve genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir
     */

    final void finalMethod() {
        System.out.println("final method'lat override edilemez");

        /*
          bir method'u final olarak isaretlerseniz
          bu method degistirilemez demektir
          (override edilemez)
         */
    }

    }
//Parent classlar final edilemez
// final yaptigimiz classlar inherit edilemez
