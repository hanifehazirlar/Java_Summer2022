package day10_stringManipulation;

import java.util.Scanner;

public class C08_Soru2 {
    public static void main(String[] args) {
        // kullanicidan bir cumle ve bir kelime isteyin kelimenin cumledeki kullanımına bakarak
        // asağıdaki uc cumleden uygun olanı yazdırın
        // -girilen kelime cumlede kullanılmamış
        // -girilen kelime cumlede 1 kere kullanılmıs
        // -girilen kelime cumlede 1'den fazla kullanılmıs

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine().toUpperCase();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.nextLine().toUpperCase();
        int ilkKelime = cumle.indexOf(kelime);
        int ikinciKelime = cumle.indexOf(kelime, ilkKelime + 1);
        System.out.println(ilkKelime);
        System.out.println(ikinciKelime);
        if (ilkKelime==-1) {
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else {
            if (ikinciKelime==-1) {
                System.out.println("girilen kelime cumlede 1 kere kullanilmıs");
            }else {
                System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
            }
        }
    }
}
