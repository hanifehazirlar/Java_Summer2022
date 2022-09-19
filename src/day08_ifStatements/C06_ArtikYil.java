package day08_ifStatements;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {
        // Kullanicidan artik yil olup olmadigini kontrol etmek icin bir yil girmesini isteyin.
        // Kural 1: 4 ile bonunemeyen yillar artik yil degildir
        // Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        // Kural 3: 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillar artik yildir
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil=scan.nextInt();
        if (yil%4 !=0){
            System.out.println("Artik yil degil");
        }else if (yil%100 !=0){
            System.out.println("Artik yil");
        }else if (yil%400 != 0) {
            System.out.println("Artik yil degil");
        }else{
            System.out.println("Artik yil");
        }
    }
}
