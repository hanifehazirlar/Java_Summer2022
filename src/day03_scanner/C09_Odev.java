package day03_scanner;

import java.util.Scanner;

public class C09_Odev {
    public static void main(String[] args) {
        //1-Kullanicidan iki tamsayi alip bu sayiların toplam, fark ve carpimlarini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci tamsayiyi giriniz");
        int x= scan.nextInt();
        System.out.println("Lutfen ikinci tamsayiyi girirniz");
        int y=scan.nextInt();
        System.out.println("Girilen tamsayilarin toplami="+(x+y));
        System.out.println("Girilen tamsayilarin farki="+(x-y));
        System.out.println("Girilen tamsayilarin carpimi="+x*y);
        //2-Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdiriniz

        System.out.println("Lutfen karenin kenar uzunlugunu yazınız");
        int a=scan.nextInt();
        System.out.println("Karenin Alani="+ a*a);
        System.out.println("Karenin Cevresi=" +4*a);
        //3-Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanını hesaplayip yazdiriniz.
        System.out.println("Lutfen yaricapi giriniz");
        double r=scan.nextDouble();
        System.out.println("Dairenin Cevresi=" + 2*3.14*r);
        System.out.println("Dairenin Alani=" +3.14*r*r);
        // 4- Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yüksekliğini isteyip prizmanının
        // hacmini hesplayıp yazdirin.
        System.out.println("Lütfen dikdortgenin uzun kenarini giriniz");
        double u=scan.nextDouble();
        System.out.println("Lütfen dikdörtgenin kisa kenarini giriniz");
        double k=scan.nextDouble();
        System.out.println("Lütfen dikdörtgenin yuksekligini giriniz");
        double h=scan.nextDouble();
        System.out.println("Prizmanin Hacmi=" + u*k*h);

        // 5- Kullanicidan ismini ve soyismini isteyip asagıdaki sekilde yazdirin
        //  Isminiz:Hanife
        //  Soyisminiz:Hazirlar
        //  Kursumuza katiliminiz alinmiştir,tesekkür ederiz
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.next();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.next();
        System.out.println("Isminiz:"+isim);
        System.out.println("Soyisminiz:"+soyisim);
        System.out.println("Kursumuza katiliminiz alinmistir.tesekkur ederiz");

        //Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        // Isim - soyisim : Hanife Hazirlar
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsim=scan.next();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim=scan.next();
        System.out.println("Isim - soyisim :"+kullaniciIsim+" "+soyIsim);
        // Kullanicidan ismini alip isminin bas harfini yazdirin
        System.out.println("Lütfen isminizi giriniz");
        String Isim= scan.next();
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("Ismin ilk harfi :" + ilkHarf);







    }
}
