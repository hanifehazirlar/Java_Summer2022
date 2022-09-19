package example;

public class C01_DakikayiYilaCevirme {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
INPUT:
Dakika sayısı: 3456789
OUTPUT :
3456789 dakika yaklaşık 6 yıl 210 gündür
         */
        int dakika=3456789;
        int saat=dakika/60;
        int gun=saat/24;
        int yıl=gun/365;
        int kalanGun=gun%365;
        System.out.println(dakika+" dakika yaklasık  "+yıl+" yıl "+kalanGun+" gun");
    }
}
