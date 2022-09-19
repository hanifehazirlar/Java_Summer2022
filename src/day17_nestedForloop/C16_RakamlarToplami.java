package day17_nestedForloop;

public class C16_RakamlarToplami {
    public static void main(String[] args) {
        int sayi=123194181;
        int toplam=0;
        int sayac=0;
        while (sayi>0){
            toplam+=sayi%10;
            sayi/=10;
            sayac++;//basamak sayisini bulmak icin koyuldu!!
        }
        System.out.println("girilen sayi basamak sayisi = " + sayac);
        System.out.println("Girilen Sayi Rakamlari toplami = " + toplam);
        sayi=1234;
        toplam=0;
        sayac=0;
        do {
            toplam+=sayi%10;
            sayi/=10;
            sayac++;
        }while (sayi>0);
        System.out.println("girilen sayi basamak sayisi = " + sayac);
        System.out.println("Girilen Sayi Rakamlari toplami = " + toplam);

    }
}
