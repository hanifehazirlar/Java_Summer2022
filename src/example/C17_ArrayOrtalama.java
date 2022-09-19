package example;

public class C17_ArrayOrtalama {
    public static void main(String[] args) {
       /* Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

                Array = [20, 30, 25, 35, -16, 60, -100 ]

        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0

        */
        int [] sayilar={20,30,25,35,-16,60,-100};
        int toplam=0;
        double ortalama=0;
        for (int i = 0; i <sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        ortalama=toplam/sayilar.length;
        System.out.println("Array Sayilarinin ortalamasi: "+ortalama);
    }
}
