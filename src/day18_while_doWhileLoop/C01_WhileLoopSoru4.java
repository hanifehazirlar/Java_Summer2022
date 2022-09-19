package day18_while_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoopSoru4 {
    public static void main(String[] args) {

        // Soru 4 ) Kullanicidan baslangic ve bitis harflerini alin
        // ve baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak
        // ekrana yansitin.kullanicinin hata yapmadigini farzedin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic harfini yaziniz :");
        char basHarf = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen bitis harfini yaziniz : ");
        char bitisHarf = scan.next().toUpperCase().charAt(0);

        if (basHarf <= bitisHarf) {
            System.out.println(basHarf+ " ve "+bitisHarf+ " arasindaki tum harfler : ");
            while (basHarf <= bitisHarf) {
                System.out.print(basHarf + " ");
                basHarf++;
            }
        } else {
            System.out.println(bitisHarf+ " ve "+basHarf+ " arasindaki tum harfler : ");
            while (bitisHarf < basHarf) {
                System.out.print(bitisHarf + " ");
                bitisHarf++;
            }
        }
        /*
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;
        String buyult="";

        while(temp<=sonHarf){
           buyult=(temp+"").toUpperCase();   // char da toUpperCase yapamadigimiz icin hiclik koyup char'ı String e ceviriyoruz
           System.out.print(buyult + " ");
           temp+=1;

         */

    }
}
