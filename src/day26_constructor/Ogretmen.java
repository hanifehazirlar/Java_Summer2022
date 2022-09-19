package day26_constructor;

public class Ogretmen {

    String isim="Isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String dogumTarihi="Tarih belirtilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    public Ogretmen() { // sag tus generate -->constructor
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {    // sag tus generate toString()
        return
                        "\nisim : " + isim +
                        "\nsoyisim : " + soyisim +
                        "\ndogumTarihi : " + dogumTarihi +
                        "\nbrans : " + brans +
                        "\nyanBrans : " + yanBrans ;
    }
}
