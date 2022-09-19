package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C07_Soru2 {
    public static void main(String[] args) {
        /*
        String str[] urun isimlerini tuttugumuz bir array olsun.Kullanicidan istedigi urunun
        sirasini isteyin ve istedigi urunu yazdirin
        Kullanici Array'de olan urun sayisindan buyuk bir sira no girerse
        "Girdiginiz sira urun sayisindan buyuk" yazdirin.
        İstenilen urunu girene kadar sira no girmeye devam etsin
        */
        String[] str = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        Scanner scan;
        String istenilenUrun="Cokokrem";

        int siraNo;
        while (true) {
            System.out.println("Urun sirasini girin");
            try {
                scan = new Scanner(System.in);
                siraNo = scan.nextInt();

                System.out.println("Girdiginiz urun :" + str[siraNo - 1]);
                if (str[siraNo - 1].equalsIgnoreCase(istenilenUrun)) {
                    System.out.println("Yasasin "+ istenilenUrun+"' i buldun");
                    break;
                }else{
                    System.out.println("Girilen urun " + str[siraNo - 1]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" + "\nSira numarasi en fazla :" +
                        str.length + " olabilir.");
            } catch (InputMismatchException e) {
                System.out.println("Hatali giris yaptiniz index icin tam sayi giriniz");
            }
        }
    }
}
