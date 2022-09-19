package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=11;
    protected int gunlukMesai=7;
    protected void maasIsci(){
        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirmli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        BMuhasebe isci1=new DIsci();//Isci'nin BMuhasebe class'inda eleman olarak kazandigi haklari almak istiyoruz
         /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk
          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */
        System.out.println(isci1.gunlukMesai); // 8 BMuhasebeden alir
        System.out.println(isci1.saatUcreti); // 10 BMuhasebeden alir
        isci1.maas();// Personel minumum : 2400 maas alir (BMuhasebeden alir)
        isci1.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir (Apersonelden alir)
        isci1.sigorta(); // Apersonelden alir
        System.out.println(isci1.isim);//Apersonelden  alir
        System.out.println(isci1.soyisim);//Apersonelden alir
        System.out.println(isci1.departman);//Apersonelden alir

        APersonel isc2 = new DIsci();
        //System.out.println(isc2.gunlukMesai); // CTE
        //System.out.println(isc2.saatUcreti); // CTE
        //isc2.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.maas(); // Once bakmaya APersonelden(Data turunden) baslar override edilmis mi bakar.
                   // Kendi Classındaki maas methodunun adi maasIsci() oldugu icin kendi classına override edilmemis
                // ama BMuhasebeye override edilmis bu yuzden BMuhasebeden alir
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyisim); // P
        System.out.println(isc2.departman);// P
        /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */
        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */

    }

}
