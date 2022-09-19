package day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim="Mine";
        isim=isim.toUpperCase(); // isim objesi yeni bir isim objesi oldu.Bu yuzden degisiklik yapılabildi
        System.out.println(isim); // MİNE
        isim="Mevlut"; // yeni bir isim adinda obje olustu.Yani her yeni atamada Heap memory'de
                      // referans ayni kalmak sartiyla yeni bir obje olusur

        System.out.println(isim); // Mevlut

        for (int i = 0; i <100; i++) {
            isim+=".";                     // for 100 defa dondugu icin her dongu icin yeni bir obje olusur.

        }
        System.out.println(isim); //Mevlut........................................................................
    }
}
