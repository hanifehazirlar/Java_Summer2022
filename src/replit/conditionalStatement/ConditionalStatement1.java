package replit.conditionalStatement;

import java.util.Scanner;

public class ConditionalStatement1 {
    public static void main(String[] args) {
        /*
        Girilen sayının pozitif, negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.

        Test data :21
        Beklenen Çıktı:
        Sayı Pozitif
        Test data :-15
        Beklenen Çıktı:
        Sayı Negatif
        Test data :0
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi<0){
            System.out.println("Sayi negatif");
        }else if (sayi==0){
            System.out.println("Sayi 0'a esit");
        }else if (sayi>0){
            System.out.println("Sayi pozitif");
        }else {
            System.out.println("Lutfen sayi giriniz");
        }
    }
}
