package example;

public class C19_ArraydeArananDegerVarMi {
    public static void main(String[] args) {
        /*yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]

        Aranan Değer:2020
        Beklenen Çıktı:**True**
        Aranan Değer:2010
        Beklenen Çıktı :**False**

         */
        int [] sayilar={1551,1223,1443,1267,1789,1023,2020};

        int arananDeger=2021;
        boolean sonuc=true;
        for (int i = 0; i <sayilar.length; i++) {
            if (sayilar[i] ==arananDeger){
                sonuc=true;
            }else sonuc=false;
        }
        System.out.println(sonuc?"**True**":"**False**");
    }
}
