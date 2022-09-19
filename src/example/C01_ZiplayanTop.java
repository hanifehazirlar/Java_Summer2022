package example;

public class C01_ZiplayanTop {
    /*
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */
    public static void main(String[] args) {
        double yükseklik=256;
        double temp=yükseklik;
        double ziplamaSonrasiYükToplami=0;
        int sayac=0;
        do {
            ziplamaSonrasiYükToplami+=temp*0.75;
            temp*=0.75;
            sayac++;
        }while (temp>=1);
        System.out.println("Topun Toplam Ziplama Sayisi : "+sayac);
        System.out.println("Topun Toplam Ziplama Yuksekligi : "+(yükseklik+(int)ziplamaSonrasiYükToplami)+" metredir");

    }
}
