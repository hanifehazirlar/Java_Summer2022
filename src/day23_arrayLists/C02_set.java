package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip
        eski urunu, varolan eski urunler listesine ekleyelim
         */
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        List<String> eskiUrunler = new ArrayList<>();
        // listedeki ikram'in yerine biskrem koyalim,
        // ikram'i da eski urunler listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun); // Ikram'in index'ini bize verir
        String silinenUrun=urunler.set(temp,yeniUrun); // Ikram'in yerine biskrem koydu
        eskiUrunler.add(silinenUrun);

        System.out.println("Liste : "+urunler); // [Nutella, Biskrem, Cekirdek, Cay]
        System.out.println("Eski urunler listesi : "+ eskiUrunler); //  [Ikram]

        yeniUrun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);


        yeniUrun="Findik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);

    }
}
