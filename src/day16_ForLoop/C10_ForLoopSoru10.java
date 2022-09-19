package day16_ForLoop;

import java.util.Scanner;

public class C10_ForLoopSoru10 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin girilen sayilari ve
        // aralarindaki tum sayilari toplayip yazdiran bir program yaziniz
       int sayi1=2;
       int sayi2=5;
       int toplam=0;
        if (sayi1 < sayi2) {

            for (int i = sayi1; i <= sayi2; i++) {
                toplam+=i;
            }
            System.out.println(toplam);
        }else if (sayi2<sayi1){
            for (int i = sayi2; i <=sayi1; i++) {
                toplam+=i;
            }
            System.out.println(toplam);
        }else{
           System.out.println(sayi1+sayi2);
        }

    }
}
