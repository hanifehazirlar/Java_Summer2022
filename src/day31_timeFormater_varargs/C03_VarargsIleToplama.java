package day31_timeFormater_varargs;

public class C03_VarargsIleToplama {
    // verilen kac 2 int olursa olsun
    // hepsini toplayip sonucu yazdiran bir method olusturun
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);

    }
    public static void toplaYazdir(int...sayi){
        /*
        int...sayi bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir.Varargs demek esnek uzunluktaki arraydir
         */
        // For Each ile;
        int toplam=0;
        int sayiAdedi=sayi.length;
        for (int each:sayi) {
            toplam+=each;
        }
        System.out.println("Girilen "+sayiAdedi+" sayinin toplami :"+toplam);

        // Fori ile;
        int top=0;
        for (int i = 0; i <sayi.length; i++) {
            top+=sayi[i];
        }
        System.out.println("Girilen "+sayiAdedi+" sayinin top.:"+top);

    }
}
