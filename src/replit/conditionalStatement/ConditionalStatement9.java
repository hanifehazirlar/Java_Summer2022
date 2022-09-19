package replit.conditionalStatement;

import java.util.Scanner;

public class ConditionalStatement9 {
    public static void main(String[] args) {
        /*
        Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.

Test Data:
Yarım elmas uzunluğu : 7
Beklenen Çıktı:
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
         */
        Scanner klavye = new Scanner(System.in);
        System.out.println("yükseklik kaç satır olsun?");
        int yukseklik = klavye.nextInt(); //yükseklik hep tek sayi olacaktir // 13
        int yariyukseklik = (int) (yukseklik / 2) + 1; // (13/2)+1=6+1=7

        for (int i = 1; i <= yariyukseklik; i++) {
            for (int j = 1; j <= yariyukseklik - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        //üst yarısı tamam
        for (int i = yariyukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yariyukseklik - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
