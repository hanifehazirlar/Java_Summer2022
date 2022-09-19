package day10_stringManipulation;

import java.util.Scanner;

public class C07_Soru1 {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin,harfin cumlede var olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf=scan.nextLine();
        if (cumle.indexOf(harf)==-1){
            System.out.println("cumle  de istenen karakter kullanilmamis");
        }else {
            System.out.println("cumle de istenen karakter kullanilmis");
        }
    }
}
