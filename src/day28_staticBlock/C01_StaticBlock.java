package day28_staticBlock;

public class C01_StaticBlock {
    static int sayi;

    static {
        /*
        Static block class uyelerinin tamamindan once calisir
        (main method'dan bile once)
        static block class olusturuldugunda calisir
        genellikle de class'la ilgili on ayarlamalar
        veya static variable'lara deger atamak icin kullanilir.

        static block'larin class icerisinde nerede oldugu onemli degildir
        once static block'lar calisir

        birden fazla static block varsa, yukaridan asagi dogru calisir
         */

        System.out.println("static blok calisti"); // 1.sirada calisti
        sayi = 10;

    }

    public static void main(String[] args) {
        System.out.println("Main method calisti"); // 3.sirada calisti
        System.out.println(sayi); //10


    }

    static {
        System.out.println("main method altindaki static block calisti"); // 2.sirada calisti

    }
}

