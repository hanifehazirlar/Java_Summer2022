package day28_staticBlock;

public class C05_PassByValue {

    public static void main(String[] args) {
        /* Verilen bir fiyat icin %10, %20, %25 indirim yapan uc method olusturun
        -method' da indirim uygulayip fiyati main method'da yazdirin
        -method'lari arka arkaya cagirip dogru calistiklarini kontrol edin
         */
        int fiyat=100;
        System.out.println("method10'da hesaplanan fiyat :" + indirim10(fiyat));// 90
        System.out.println("method20'da hesaplanan fiyat :" + indirim20(fiyat));// 80
        System.out.println("method25'da hesaplanan fiyat :" + indirim25(fiyat)); // 75
        System.out.println("method call sonrasi original fiyat :"+fiyat); // 100

    }
    public static int indirim10(int fiyat){
        fiyat*=0.90;
        return fiyat;
    }
    public static int indirim20(int fiyat){
        fiyat*=0.80;
        return fiyat;
    }
    public static int indirim25(int fiyat){
        fiyat*=0.75;
        return fiyat;
    }

}
