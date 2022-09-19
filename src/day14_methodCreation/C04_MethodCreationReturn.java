package day14_methodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
        // Verilen isim ve soyismi ilk harfi buyuk geriye kalnalari
        // yildiz olacak sekilde degistirip bize bu halini döndüren bir method olusturun
        // NOT: programin ilerleyen kisimlerinde isim ve soyismi bu şekilde kullanmak istiyoruz

        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyisim);
        System.out.println(isim+" "+soyisim);  // Enes Bozkurt


    }

    public static String isimGizle(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println(isim + " " + soyisim); // E*** B****** (ilk bu kısmı yazdiriyor)

        return isim + " " + soyisim;         // return etmemizin amaci yazdirmak degil, bir degisiklik yapip
                                             // degisiklik yapilmis halini geri dondurmek

    }

}
