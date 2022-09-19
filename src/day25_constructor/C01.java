package day25_constructor;

public class C01 {
    /*
      Java OOP konsept kullandigi icin
      olusturulan her bir class'in ihtiyac oldugunda obje uretebilmesine uygun dizayn etmistir
      Ama her class'dan obje uretilmeyebilir
      bunun icin Java ihtiyac halinde kullanilmasi icin
      her class'da default bir costructor koymustur.
      bu default constructor
      class'dan obje olusturuldugunda otomatik olarak calisir
      ornegin bu class'da constructor gorunmemesine ragmen
      C02 class'inda icinde oldugumuz C01 class'indan bir obje uretebildik
     */
    int sayi;

    public void deneme() {
        System.out.println("C01 den deneme method calisir");
    }
}
