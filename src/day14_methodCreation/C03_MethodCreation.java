package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // Input olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
        // I**** K***** seklinde yazdiran bir method olusturun

        String isim="Enes";
        String soyisim="Bozkurt";
        ismiGizle(isim,soyisim); // E*** B******
        C02_MethodCreation.rakamlariTopla(654);

    }

    public static void ismiGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim +" "+soyisim);

    }

}
