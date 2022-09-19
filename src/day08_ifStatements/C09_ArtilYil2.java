package day08_ifStatements;

import java.util.Scanner;

public class C09_ArtilYil2 {
    public static void main(String[] args) {
        // Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
        // Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        // Kural 2: 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillar
        // artik yildir
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil= scanner.nextInt();
        if(yil%4 !=0){
            System.out.println("Artik yil degildir");
        }else if(yil%100==0 && yil%400==0){
            System.out.println("Artik yildir");
        }else{
            System.out.println("Artik yil degildir");
        }
    }
}
