package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */
        double satisFiyati=100;
        double indirimOrani=25;
        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat :"+indirimliFiyat); // 75.0
        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("indirimli fiyat : " + indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) { // burada satis fiyati yerinde aslinda deger vardir yani 100
        double indirimliFiyat=satisFiyati*(1- indirimOrani/100);
        return indirimliFiyat;
    }
}
