package day17_nestedForloop;

import java.util.Scanner;

public class C13_Soru3 {
    public static void main(String[] args) {
        // Kullanicidan baslangic be bitis degerlerini alin.
        // Baslangic degeri ve bitis degeri dahil aralarindaki tum cift tamsayilari while lopp kullanarak ekrana yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic sayisini giriniz :");
        int bas = scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz :");
        int bit = scan.nextInt();


        if (bas <= bit) {
            System.out.println(bas +" ve "+bit+" arasindaki tum cift sayilar :");
            while (bas <= bit) {
                if (bas % 2 == 0) {
                    System.out.print(" " + bas);
                }
                bas++;
            }

        } else {
            System.out.println(bit +" ve "+bas+" arasindaki tum cift sayilar :");
            while (bit < bas) {

                if (bit % 2 == 0) {
                    System.out.print(" " + bit);
                }
                bit++;

            }

        }
    }
}
