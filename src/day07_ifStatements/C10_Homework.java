package day07_ifStatements;

import java.util.Scanner;

public class C10_Homework {
    public static void main(String[] args) {
        // Soru 1-) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0) {
            System.out.println(sayi +" sayisi cifttir");
        }
        if (sayi%2!=0) {
            System.out.println(sayi+" sayisi tektir");
        }
        // Soru 2-) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve
        // o harfle baslayan gun isimlerini yazdirin

        System.out.println("Lütfen gün isimlerinden birinin ilk harfini giriniz");
        String ilkHarf=scan.next().toUpperCase();
        if (ilkHarf.equals("P")){
            System.out.println("P harfi ile baslayan günler: Pazar,Pazartesi,Persembe");
        }
        if (ilkHarf.equals("S")){
            System.out.println("S harfi ile baslayan günler: Sali");
        }
        if (ilkHarf.equals("Ç")){
            System.out.println("Ç harfi ile baslayan günler:Çarsamba");
        }
        if (ilkHarf.equals("C")){
            System.out.println("C harfi ile baslayan günler:Cuma,Cumartesi");
        }



    }
}
