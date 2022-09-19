package day42_abstractClass_Interface;


public interface I03_Interfaces {
    int SAYI=30;
    static final int SAYI3=12;
    String STR="Ali";
    //int sayi;
    // interface'lerde tum variable'lar public static final 'dir.Yazsa da yazmasada bu boyledir.
    /*
    interface 'lerde tum variable'lar public static ve final'dir
    Dolayısıyla sonrada deger atama sansimiz yoktur
    bunun icn variable olusturdugumuzda mutlak deger atamaliyiz
     */
    abstract void yakit();
     /*
      interface icerisindeki her method
      public abstract ozelliklerine sahiptir
      abstract bir method'un body'si olmasi mumkun degildir
      Java sonradan developer 'larin istegi uzerine kismi bir update yapmistir

      Bir interface'e sonradan bir abstract method eklerseniz
      o interface'i daha once implement etmis tum class'lara gidip
      hepsinde yeni eklenen method'u override etmeniz gerekir
      Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.

       Bunun icin Java Java8'den itibaren
       interface'lere sonradan body'si olan method eklenmesine izin vermistir.
       Bu method'larin body'si olsa da Interface'in yapisi geregi
       bu method'lara concrete denmez
       body'si olan bu method'lar istisna olarak kabul edilebilir.
     */
       public void motor(); // gri renkte olmalarinin sebebi yazmana gerek yok ben kabul edrim diyor
       public abstract void teker();

    public  static void aku(){
     }
}
