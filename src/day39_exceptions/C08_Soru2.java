package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C08_Soru2 {
    public static void main(String[] args) {
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aramak istediginiz urunu giriniz");
        String istenilenUrun = scan.next();
        int siraNo;
        while (true) {
            System.out.println("Urun sirasini girin");
            try {
                siraNo = scan.nextInt();
                System.out.println("Girdiginiz urun :" + urunler[siraNo - 1]);
                if (urunler[siraNo - 1].equalsIgnoreCase(istenilenUrun)) {
                    System.out.println("Yasasin " + istenilenUrun + "' i buldun");
                    break;
                }else{
                    System.out.println("Girilen urun " + urunler[siraNo - 1]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" + "\nSira numarasi en fazla :" +
                        urunler.length + " olabilir.");
                scan.next();
            } catch (InputMismatchException e) {
                System.out.println("Hatali giris yaptiniz index icin tam sayi giriniz");
                scan.next();
            }
        }
    }
}
