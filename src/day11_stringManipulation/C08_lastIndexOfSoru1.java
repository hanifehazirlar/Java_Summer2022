package day11_stringManipulation;

import java.util.Scanner;

public class C08_lastIndexOfSoru1 {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin,harfin cumlede var olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");

        String cumle=scan.nextLine().toUpperCase();
        System.out.println("Lutfen bir harf giriniz");

        String harf=scan.next().toUpperCase();

        if (cumle.lastIndexOf(harf)==-1){
            System.out.println("Girilen harf cumlede yok");
        }else{
            System.out.println("Girilen harf cumlede var");
        }
    }
}
