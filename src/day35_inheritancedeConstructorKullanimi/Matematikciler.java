package day35_inheritancedeConstructorKullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler() {
        System.out.println("Matematikciler parametresiz constructor");
    }

    Matematikciler(String isim) {
        this();// burada this() constructor call oldugu icin super() contructor
        // call olmaz ve super(isim)'de yazamayiz
        // this() bize bu class'daki parametresiz constructor'a git der
        System.out.println("Matematikciler parametreli constructor");

    }

    public static void main(String[] args) {
        Matematikciler obj1 = new Matematikciler("Hanife");

    }
    /*
     this() constructor call, icinde bulunulan class'daki constructorlari,
     super() ise parent class'da bulunan constructorlari cagirir
     this() veya super() parametre yapisina uygun bir constructor bulamazsa ?
     Java CTE verir
     constructor konusunda gordugumuz this.
     o class'daki instance variable'lari refere ediyordu
     */
      // System.out.println(super.name); dedigimizde super parent'a gider oraya bakar varsa alir yoksa CTE verir
     // System.out.println(this.name); dedigimizde this once kendi clacc'ina bakar varsa kullanir
     // yoksa parent'a gider
    // onu kullanir hicbirinde yoksa CTE verir

}
