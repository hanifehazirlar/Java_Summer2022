package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe {
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {

        System.out.println("Yan Hizmetliler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigortasi() {
        System.out.println("Yan Hizmetliler %30 indirmli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        /*
         overriding child class'daki bir method'un
        parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir.
        Overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise
        eger bir obje olusturulurken
        data turu ve constructor farkli ise
        objenin ozelliklerini belirlerken

        3 konuya dikkat cekmeliyiz
        1- Obje constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
           ordada bulamazsak CTE verir
        3-   eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        aranan ozellik method ise
        degeri yazdirmadan once override edilmis mi diye kontrol etmemiz gerekir
        eger override edildiyse(daha spesifik olan) en guncel degeri yazdiriz
        */

        BMuhasebe yh1 = new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai); // 8 BMuhasebeden alir
        System.out.println(yh1.saatUcreti); // 10 BMuhasebeden alir


        yh1.maas();//Yan Hizmetliler : 2160 maas alir (EYanHizmetliler alir)
        yh1.ozelSigorta(); //BMuhasebeden
        yh1.sigorta(); // Apersonelden alir
        System.out.println(yh1.isim);//Apersonelden  alir
        System.out.println(yh1.soyisim);//Apersonelden alir
        System.out.println(yh1.departman);//Apersonelden alir
        // System.out.println(yh1.issizlikSigortasi); (Bunu bulamadik)  CTE verdi


    }

}