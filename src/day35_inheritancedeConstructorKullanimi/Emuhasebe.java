package day35_inheritancedeConstructorKullanimi;

public class Emuhasebe extends DPersonel{
    Emuhasebe(){
      // Burada gorunmeyen Super(); var
        System.out.println("Muhasebe parametresiz constructor");
    }
    Emuhasebe (String isim) {
        // Burada gorunmeyen Super(); var
        System.out.println("Muhasebe parametreli constructor");
    }
}
