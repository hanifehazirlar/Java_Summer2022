package day25_constructor;

public class Car {
    /*
    Bu class bizim kaliphanemiz
    bir araba olusturmak icin ihtiyacimiz olan
    variable ve method'lari bu class'da belirleriz
    sonra farkli class'larda araba olusturmamiz gerekirse
    bu class'dan bir obje olusturup
    burada belirlenen variable ve method'lara gore araba uretiri
     */
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil;
    public int fiyat;

    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba max " + hiz + " km hiz yapar");
    }
}