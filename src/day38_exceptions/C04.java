package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan;
        int istenenSira;

        while (true) {
            System.out.println("Istediginiz urunun sira nosunu giriniz");
            try {
                scan = new Scanner(System.in);
                istenenSira=scan.nextInt();
                System.out.println("Aradiniz urun " + urunler[istenenSira - 1]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" + "\nSira numarasi en fazla :" +
                        urunler.length + " olabilir.");
            } catch (InputMismatchException e) {
                System.out.println("Hatali giris yaptiniz index icin tam sayi giriniz");
            }
        }
    }
}
