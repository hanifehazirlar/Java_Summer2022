package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf=(char)(harf+1); // kod bu durumda once sagdaki islemi yapar
                                      // char yeniHarf=97+1-->98
                                     // char bir variable 98 olamayacagi icin Java hata verir
        System.out.println(yeniHarf);
        /*
        Bazen bir variable' a olusturuldugu data turu dısından deger atanabilir
        Bunlardan bazisi Java otomatik olarak kabul eder
        Java eger bu deger atamasında sorun olusacagini
        (data kayiplarin olabilecegi veya datanin baskalasabilecegi) gorurse
        bu durumda otomatik olarak bu atamayi kabul etmez
        sizden eger bu atamayi sorumlulugu almanizi bekler
        */
        int sayi1=(int)7.3; // 7
        System.out.println(sayi1);
        double sayi2=10; // 10.0
        System.out.println(sayi2);
        int sayi3='c'; // 99
        System.out.println(sayi3);
        char harf2=98; // b
        System.out.println(harf2);

    }
}
