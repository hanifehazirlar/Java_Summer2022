package day34_inheritance;

public class Isci extends Personel{
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.
    mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel class'indaki tum variable ve method'lara ihtiyaci
    oldugunu gorebiliriz.
    Bu durumda yeniden o variable ve method'lari olusturmak yerine
    Personel class'ini kendimize parent ediniriz
    Bir class'i parent edinmek icin extends keyword kullanmaliyiz
    (class Ismi'nin yanina extends yazariz ve onun yanina da parent edinmek istedigimiz class'in adini yazariz)
    bir class baska bir class'i parent edindiginde
    1- parent class'daki tum ozelliklere (variable, method,object) otomatik olarak sahip olur
    2- Parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- Parent class'da olmayan bazi yeni ozellikler(variable, method,object) olusturabilir
    not: parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir
     */
    int persNo=1001;
    public static void main(String[] args) {
        Isci isci1=new Isci(); // Ilk defa icinde bulundugumuz class'dan obje uretiyoruz ve
                              // baska class'dan variable ve method kullaniyoruz.Iste bu durum inheritance oluyor
                             // daha once baska class'ın adı ile obje olusturup o calss'ın variable ve methodlarini kullaniyorduk.
        System.out.println(isci1.isim); //Isim belirtilmedi
        // kendi class'imizda isim variable yok, onun icin parent'a gideriz
        isci1.isim="Selim";
        System.out.println(isci1.isim); // Selim
        System.out.println(isci1.persNo); // 1001 kendi class'imizda varsa onu kullaniriz
        isci1.maas(); // Isciler minumum 15 euro saat ucreti alir

    }
    public void maas(){
        System.out.println("Isciler minumum 15 euro saat ucreti alir");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");


    }
}
