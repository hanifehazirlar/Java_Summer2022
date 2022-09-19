package example;

public class C25_SayininSayiDegerleriToplami {
    public static void main(String[] args) {
       /* Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
        Test Data
        34
        Beklenen Çıktı
        7
        */
        int sayi=256;
        int sayiDegeriTop=0;
       do {
           sayiDegeriTop+=sayi%10;
           sayi/=10;

        }while(sayi>0);
        System.out.println("sayiDegeriTop = " + sayiDegeriTop);
        // for ile ;
        int sayi1=1236;
        int basSayisi=4;
        int toplam=0;
        for (int i = 0; i <=basSayisi; i++) {
            toplam+=sayi1%10;
            sayi1/=10;

        }
        System.out.println("toplam="+toplam);

    }
}
