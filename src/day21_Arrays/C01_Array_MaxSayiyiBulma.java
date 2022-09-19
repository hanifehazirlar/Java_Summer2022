package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {
        // Soru 1) Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun
        int[] sayilar = {3,5,7,1,4,9,5,2};
        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {
        int maxSayi=sayilar[0]; // 0.index deki sayiyi atadik
        for (int i = 1; i <sayilar.length; i++) {
            if (sayilar[i] > maxSayi) {  // diger indexlerdeki sayilar 0.indexten buyuk degillerse 0. indexi yazdirir
                maxSayi = sayilar[i];
            }
        }
        System.out.println("En buyuk sayi : "+maxSayi);
    }
}
