package day35_inheritancedeConstructorKullanimi;

public class DPersonel {
    // extends olmayan classlarda Super(); olmaz
    DPersonel() {
        System.out.println("Personel parametresiz constructor");
    }
    DPersonel (String isim){
        System.out.println("Personel parametreli constructor");
    }
}
