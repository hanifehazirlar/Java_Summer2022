package day12_stringManipulations;

public class C07_Soru4 {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyisim isteyin ve hangisinin daha uzun oldugunu yazdirin
        String  isim="Hanife";
        String soyisim="Hazirlar";

        System.out.println(isim.length()>soyisim.length()?isim+" isminiz daha uzun ":isim.length()==soyisim.length()
                ?"isminiz ve soyisminiz esit uzunlukta"
                : soyisim+" soyisminiz daha uzun ");
    }

}
