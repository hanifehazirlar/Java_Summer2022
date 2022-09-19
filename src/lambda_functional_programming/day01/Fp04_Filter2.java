package lambda_functional_programming.day01;

import lambda_functional_programming.day01.Fp04_Filter1;

import java.util.Arrays;
import java.util.List;

public class Fp04_Filter2 {
    public static void main(String[] args) {
        Fp04_Filter1 araba1=new Fp04_Filter1("Ford","Focus","Mavi",1998);
        Fp04_Filter1 araba2=new Fp04_Filter1("VolksWagen","Scirocco","Beyaz",2008);
        Fp04_Filter1 araba3=new Fp04_Filter1("Mercedes","CLA 180","Kirmizi",2013);
        Fp04_Filter1 araba4=new Fp04_Filter1("Mercedes","GLA","Beyaz",2014);
        Fp04_Filter1 araba5=new Fp04_Filter1("BMW","5 Series","Siyah",1972);
        Fp04_Filter1 araba6=new Fp04_Filter1("Dodge","Challenger","Kirmizi",1970);


        List<Fp04_Filter1> arabaList= Arrays.asList(araba1,araba2,araba3,araba4,araba5,araba6);
        // 2008 yılından önceki otomobilleri filtereleyip
        // Filtrelenmiş olan otomobillerimizden rengi kırmızı olanları ekrana basalım.
        arabaList.stream().filter(t->t.getUretimYili()<2008).filter(t->t.getRenk().equalsIgnoreCase("kirmizi")).
                forEach(t-> System.out.println(t));
        // Fp04_Filter1{marka='Dodge', model='Challenger', renk='39, uretimYili=1970}






    }
}
