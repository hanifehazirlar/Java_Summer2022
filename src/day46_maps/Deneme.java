package day46_maps;

public class Deneme {
    public static void main(String[] args) {
        System.out.println(ReusableMethods.mapOlustur());
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev,
        // 104=Derya, Deniz, Devaps, 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}

        ReusableMethods.tumValueSiraliYazdir(ReusableMethods.mapOlustur());

        System.out.println(ReusableMethods.isimSoyisimListesiOlustur(ReusableMethods.mapOlustur()));
    }
}
