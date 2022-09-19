package day17_nestedForloop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
       /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;
        while (!sifreBasariliMi) {
            // Kullanicidan bir sifre alalim
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            // 4 kontrolu yapalim, her gecen kontrol icin kontrol variable'ini bir artiralim
            // ilk harf kontrolu
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk harf olmali");
            }
            // son harf kontrolu
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk harf olmali");
            }
            // bosluk kontrolu
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol++;
            }
            // sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }
            if (kontrol == 4) { // tum kontrolllerden gecmis demektir
                System.out.println("Sifre basari ile tanimlandi");
                sifreBasariliMi = true;
            } else { // sifre basarisiz
                // tekrar basa donecek
                // kontrol variable sifirlanmali
                kontrol = 0;
            }
        }

    }
}
