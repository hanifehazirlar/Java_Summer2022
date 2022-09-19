package replit.conditionalStatement;

import java.time.LocalDate;
import java.util.Scanner;

public class ConditionalS5_ArtikYil {
    public static void main(String[] args) {
        /*
        1 ile 12 arasında girilen sayıdan ve yıldan yılın hangi ayı olduğunun ve
        o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

       Test Data:
        2
        2016

       Beklenen çıktı:
       2016 yili Subat ayi 29 gun
       Test Data:
       4
      1998
      Beklenen Çıktı:
      1998 yili Nisan ayi 30 gun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasi giriniz");
        int ay = input.nextInt();
        System.out.println("Yili giriniz");
        int yil = input.nextInt();
        boolean artikYil=(yil%4==0 && yil%100!=0)||(yil%4==0 && yil%100==0 && yil%400==0);
        switch (ay) {
            case 1: System.out.println("Ocak" +yil + " 31 Gundur.");
                break;
            case 2:
                if (artikYil) System.out.println("Subat " + yil + " 29 Gundur.");
                else System.out.println("Subat " + yil + " 28 Gundur.");
                break;
            case 3: System.out.println("Mart " +yil+ " 31 Gundur.");
                break;
            case 4: System.out.println("Nisan "+ yil+ " 30 Gundur.");
                break;
            case 5: System.out.println("Mayıs"+ yil+" 31 Gundur.");
                break;
            case 6: System.out.println("Haziran "+ yil+" 30 Gundur.");
                break;
            case 7: System.out.println("Temmuz "+ yil+" 31 Gundur.");
                break;
            case 8: System.out.println("Agustos "+ yil+" 31 Gundur.");
                break;
            case 9: System.out.println("Eylül"+ yil+" 30 Gundur.");
                break;
            case 10: System.out.println("Ekim "+yil+" 31 Gundur.");
                break;
            case 11: System.out.println("Kasım"+yil+" 30 Gundur.");
                break;
            case 12: System.out.println("Aralık"+yil+" 31 Gundur.");
                break;
            default: System.out.println("Gecerli bir ay numarası girin.");
        }
        // artik yil olup olmadiğini isLeapYear ile yapabiliriz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ogrenmek istediginiz yili giriniz");
        int yill=scan.nextInt();
        System.out.println("Lutfen ogrenmek istediginiz ay numarasini giriniz");
        int ayy= scan.nextInt();
        LocalDate tarih=LocalDate.of(yill,ayy,1);
        tarih.isLeapYear();
        System.out.println(tarih.isLeapYear());
        switch (ayy){
            case  1: System.out.println(yil+"yili ocak ayi 31 gundur");break;
            case  2: if ((tarih.isLeapYear())) {
                System.out.println(yill+"yili subat ayi 29 gundur");
            }else System.out.println(yil+"yili subat ayi 28 gundur");;break;
            case  3: System.out.println(yil+"yili mart ayi 31 gundur");break;
            case  4: System.out.println(yil+"yili nisan ayi 30 gundur");break;
            case  5: System.out.println(yil+"yili mayis ayi 31 gundur");break;
            case  6: System.out.println(yil+"yili haziran ayi 30 gundur");break;
            case  7: System.out.println(yil+"yili temmuz ayi 31 gundur");break;
            case  8: System.out.println(yil+"yili agustos ayi 31 gundur");break;
            case  9: System.out.println(yil+"yili eylul ayi 30 gundur");break;
            case  10: System.out.println(yil+"yili ekim ayi 31 gundur");break;
            case  11: System.out.println(yil+"yili kasim ayi 30 gundur");break;
            case  12: System.out.println(yil+"yili aralik ayi 31 gundur");break;
        }




    }
}
