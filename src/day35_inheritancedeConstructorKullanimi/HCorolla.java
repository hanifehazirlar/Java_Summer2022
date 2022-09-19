package day35_inheritancedeConstructorKullanimi;

public class HCorolla extends GToyota{
    HCorolla(){
        System.out.println("HCorolla parametresiz constructor");
    }
    HCorolla(String isim){
        super(isim);
        System.out.println("HCorolla parametreli constructor"+isim);
    }
}
