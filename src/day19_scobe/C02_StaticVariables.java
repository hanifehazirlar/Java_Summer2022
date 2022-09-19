package day19_scobe;

public class C02_StaticVariables {
    static int staticSayi=10;
    String isim="Mehmet";
    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level'daki variable'lara deger atamasak da Java kabul ediyor
     */
    public static void main(String[] args) {
       /*
       bir variable static olusturulduysa
       objeler icin degil class icin gecerlidir
        */
        System.out.println(staticSayi); // 10
        staticMethod(); // 10 // baslangic degeri yazdirir ama o methot'da yeni atama yapildigi icin degeri degistirir,
                             //tekrar cagirdigimizda veya yazdirdigimizda yeni degeri yazdirir)
        staticSayi=12;
        System.out.println(staticSayi); // 12
        staticMethod(); // 12 cunku static sayiya 18.satirda yeni atama yaptik
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 12
        C02_StaticVariables obje2=new C02_StaticVariables();
        obje2.staticOlmayanMethod(); // 20 (asagida staticOlmayanMethod()'da yeni atama yaptigimiz icin yeni degeri yazdirdi)
        System.out.println(staticSayi); // 20 (asagida staticOlmayanMethod()'da yeni atama yaptigimiz icin yeni degeri yazdirdi)
        /*
         instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
         istenen satira kadar kodu takip etmeliyiz
         Static variable'da ise class'in en basindan baslayarak
         istenen satira kadar kodu tekip edip
         static variable'in son degerini bulmamiz gerekir
         */
    }
    public static void staticMethod(){
        System.out.println(staticSayi); // Methodlar sadece biz cagirirsak calisir.
        // staticMethod() icindeki sout'u yazdirabilmemiz icin main method'da StaticMethod() methot'dunu method call yapmaliyiz
    }
    public void staticOlmayanMethod(){
        /*
        static variable'lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum method'lar static variable'lari gorebilir ve degistirebilirler
        farkli method'larda static variable'in hangi degeri alacagini bilmek istiyorsak
        class'in basindan itibaren kodun calismasini takip etmeliyiz
        method ne zaman cagrilirsa o anki static variable degerini method'da kullanabiliriz
         */
        System.out.println(staticSayi); // Methodlar sadece biz cagirirsak calisir.
        // staticOlmayanMethod() icindeki sout'u yazdirabilmemiz icin main method'da
        // StaticOlmayanMethod() methot'dunu obje yardimiyla yazdirabiliriz
        staticSayi=20;
    }
}
