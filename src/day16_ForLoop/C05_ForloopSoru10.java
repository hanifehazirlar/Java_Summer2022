package day16_ForLoop;

import java.util.Scanner;

public class C05_ForloopSoru10 {
    // Soru 10 ) Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int bas=scan.nextInt();
        System.out.println("2.sayiyi giriniz");
        int bitis=scan.nextInt();
        aralariTopla(bas,bitis);
    }

    public static void aralariTopla(int bas, int bitis) {
        int toplam=0;
        if (bas<=bitis){
            for (int i =bas; i <=bitis; i++) { // bas<bitis oldugu durumda
                toplam+=i;
            }
        }else{
            for (int i =bitis; i <=bas ; i++) {  // bitis<bas oldugu durumda
                toplam+=i;

            }
        }
        System.out.println("Aralarindaki sayilarin toplami : "+ toplam);
    }
}
