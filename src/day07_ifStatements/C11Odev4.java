package day07_ifStatements;

import java.util.Scanner;

public class C11Odev4 {
    /* kullanicidan bir ucgenin uc kenar uzunlugunu alin
       eger uc kenar uzunlugu birbirine esit ise ekrana "Eskenar ucgen" yazdirin.
       diger durumlarda ekrana "Eskenar degil" yazdirn
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ücgenin kenar degerlerini giriniz \nkenar1");
        int kenar1= scan.nextInt();
        System.out.println("\nkenar2");
        int kenar2= scan.nextInt();
        System.out.println("\nkenar3");
        int kenar3= scan.nextInt();
        if (kenar1==kenar2 && kenar1==kenar3) {
            System.out.println("Eskenar ucgen");
        }else{
            System.out.println("Eskenar degil");
        }


    }
}
