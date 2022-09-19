package day36_inheritanceDataTypeKullanimi;
import java.util.ArrayList;
public class CMemur extends BMuhasebe{
    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected  void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur memur1=new CMemur(); //Default cos.calisir sout olamdigi icin birsey yazmaz alt satira gecer
        System.out.println(memur1.gunlukMesai); // 9
        System.out.println(memur1.saatUcreti); // 12
        memur1.maas();// Memurlar : 3240 maas alir
        memur1.ozelSigorta(); //Memurlar %60 indirimli ozel sigorta yaptirabilir
        memur1.sigorta(); // Tum personelimiz sigorta yapilirApersonelden alir
        System.out.println(memur1.isim);//Apersonelden  alir
        System.out.println(memur1.soyisim);//Apersonelden alir
        System.out.println(memur1.departman);//Apersonelden alir

        BMuhasebe mhsb1=new BMuhasebe();
         /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();,

        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yani DATA TURUDUR
    */

        System.out.println(mhsb1.gunlukMesai); // 8 BMuhasebe den alir
        System.out.println(mhsb1.saatUcreti); // 10 BMuhasebe den alir
        mhsb1.maas();// Muhasebe Personel minumum : 2400 maas alir
        mhsb1.ozelSigorta(); // Isteyen calisanlara %50 indirimli ozel sigorta yapilir (Muhasebeden alir)
        mhsb1.sigorta(); // Tum personelimiz sigorta yapilir  (Apersonelden alir)
        System.out.println(mhsb1.isim);//Apersonelden  alir
        System.out.println(mhsb1.soyisim);//Apersonelden alir
        System.out.println(mhsb1.departman);//Apersonelden alir

    }

}
