package example;

import java.time.LocalDate;
import java.util.Scanner;

public class C26_YuzGunSonrasi {
    // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
    // pazartesi hafta başlangıcı
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen haftanin hangi gununde oldugunuzu giriniz ");
        System.out.print("Pazartesi icin 1 giriniz\n");
        System.out.print("Sali icin 2 giriniz\n");
        System.out.print("Carsamba icin 3 giriniz\n");
        System.out.print("Persembe icin 4 giriniz\n");
        System.out.print("Cuma icin 5 giriniz\n");
        System.out.print("Cumartesi icin 6 girininz\n");
        System.out.print("Pazar icin 7 girininz\n");
        int gunNosu=scan.nextInt();
        int eklenecekGun=100%7;
        if (gunNosu<1 &&gunNosu>7) {
            System.out.println("Hatali giris yaptiniz hafta 7 gundur");
        }else{
            switch((gunNosu+eklenecekGun)%7) {
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Sali");
                    break;
                case 3:
                    System.out.println("Carsamba");
                    break;
                case 4:
                    System.out.println("Persembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;
                case 6:
                    System.out.println("Cumartesi");
                    break;
                case 0:
                    System.out.println("Pazar");
                    break;
            }
        }
        // 2.yontem
        int yil=scan.nextInt();
        int ay=scan.nextInt();
        int gun=scan.nextInt();
        int eklemekIstediginizGun=scan.nextInt();
        LocalDate tarih=LocalDate.of(yil,ay,gun);
        System.out.println(tarih.getDayOfWeek().plus(eklemekIstediginizGun));
        // 3.yontem
        LocalDate trh=LocalDate.of(2020,05,22);
        System.out.println(trh.plusDays(100).getDayOfWeek());
    }
}
