package replit.conditionalStatement;

import java.util.Scanner;

public class ConditionalStatement12 {
    public static void main(String[] args) {
       /*
        Ugly Number:

     Girilen bir sayının ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
     Sayı sisteminde, ugly number sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
     İlk 10 ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
     Test Data:13
     Beklenen çıktı:ugly number  degildir
     Test Data:25
     Beklenen Çıktı:ugly number
        */
        System.out.println("Bir sayi giriniz");
        Scanner scan = new Scanner(System.in);
        Integer sayi = scan.nextInt();
        int num = sayi;
        int x=0;

        while (num != 1) {
            if (num % 2 == 0)
                num /= 2;
            else if (num % 3 == 0)
                num /= 3;
            else if (num % 5 == 0)
                num /= 5;
            else {
                System.out.println(sayi + " ugly sayi degil");
                x=1;
                break;
            }
        }
        if(x==0)
            System.out.println(sayi + " ugly sayi");

    }
}
