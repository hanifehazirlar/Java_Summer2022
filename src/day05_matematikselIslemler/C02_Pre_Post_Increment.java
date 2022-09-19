package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi=10;
        System.out.println("pre-increment :" + ++sayi); // pre-increment : 11 1-önce artırma
                                                       //                     2-sonra yazdırma
                                                       // sayi 11 olarak atanmış oldu
        System.out.println("pre-inceremen'ten sonra:" + sayi); // pre-increment'ten sonra :11

        System.out.println("post-increment :" + sayi++); // post-increment: 11 1-önce yazdırma
                                                         //                    2-sonra artırma
        System.out.println("post-increment'ten sonra :" + sayi); // post-increment'ten sonra :12
                                                                 // sayi 12 olarak atandı
    }
}
