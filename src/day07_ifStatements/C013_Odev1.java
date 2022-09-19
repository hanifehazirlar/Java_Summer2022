package day07_ifStatements;

import java.util.Scanner;

public class C013_Odev1 {
    /*
    kullanicidan dikdörtgenin kenar uzunluklarini isteyin ve
    dikdortgenin kare olup olmadigini yazdirin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarını giriniz \nkenar1");
        double kenar1=scan.nextDouble();
        System.out.println("\nkenar2");
        double kenar2=scan.nextDouble();

        if(kenar1==kenar2){
            System.out.println("Dikdortgen karedir");
        }else {
            System.out.println("Dikdortgen kare degildir");
        }
    }
}
