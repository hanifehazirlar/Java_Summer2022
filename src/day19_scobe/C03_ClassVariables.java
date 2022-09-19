package day19_scobe;

public class C03_ClassVariables {
    public static void main(String[] args) {
        /*
         Farkli bir class'da calisirken
         her hangi bir class adini yazip .'ya basarsak
         adini yazdigimiz class'daki tum STATIC class uyelerini gorebilir
         ve kullanabiliriz
         */
        C02_StaticVariables.staticMethod(); // 10
        System.out.println(C02_StaticVariables.staticSayi); //10 (C02_StaticVariables daki staticSayi degerini alir gelir)
        System.out.println(C02_StaticVariables.degersizStaticVar);  // 0 (C02_StaticVariables daki staticSayi degerini alir gelir)
        /*
         Class level variable'lara deger atayip atamamak bize kalmistir
         istersek deger atamasi yapariz, istemezsek deger atamayiz
         Eger Deger atamissak Java atadigimiz o degeri kabul eder
         deger atamazsak Java bu variable'lara default bir deger atamasi yapar
         int --> 0
         String --> null
         boolean--> false
         char --> '' (hiclik)
         */
        /*
         baska class'daki instance variable'lara obje olusturarak ulasabiliriz
         */
        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10 (C02_StaticVariables class'indaki staticOlmayanMethod()'a gidecek baslangic degeri yazdirir
                                     // ama o methot'da yeni atama yapildigi icin degeri degistirir,
                                    //tekrar cagirdigimizda veya yazdirdigimizda yeni degeri yazdirir)
        // bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim); // Mehmet
        System.out.println(obje1.degersizInstanceVariable); // 0
        System.out.println(C02_StaticVariables.staticSayi); // 20
        /*
        Farkli bir class'dan C02 clasindan method ve variable'lari kullandigimda
        C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir
         */
    }
}

