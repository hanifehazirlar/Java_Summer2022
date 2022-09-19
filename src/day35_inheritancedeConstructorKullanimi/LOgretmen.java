package day35_inheritancedeConstructorKullanimi;

public class LOgretmen {
    LOgretmen (){

        System.out.println("LOgretmen parametresiz constructor");
    }
    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli constructor");

    }
}
