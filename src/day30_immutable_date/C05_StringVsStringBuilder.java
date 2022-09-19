package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder mi daha hizlidir?
        bunun icin bir String olusturup, 1000 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zamani alip aradaki farki bulalim
        ayni islemi StringBuilder icin de yapalim
         */
        LocalTime baslangic=LocalTime.now();
        String str="Ahhhh Java";
        for (int i = 0; i <10000; i++) {
            str+=".";
        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println("String zaman : "+ (bitis.getNano()-baslangic.getNano()));

        baslangic=LocalTime.now();
        StringBuilder sb=new StringBuilder("Ahhhh Java");
        for (int i = 0; i <10000; i++) {
            sb.append(".");
        }
        bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println("StringBuilder zaman : "+ (bitis.getNano()-baslangic.getNano()));



    }
}
