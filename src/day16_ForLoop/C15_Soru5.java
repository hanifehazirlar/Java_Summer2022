package day16_ForLoop;

import java.util.Scanner;

public class C15_Soru5 {
    public static void main(String[] args) {
        //Ask the user for an integer less than 100.Print numbers that are multiples of 3 or 5 from 1 to the number entered
        //Kullanıcıdan 100'den küçük bir tam sayı isteyin. 1'den başlayarak girilen sayıya kadar 3'ün veya
        // 5'in katı olan sayıları yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer less than 100");
        int number = scan.nextInt();
        for (int i = 0; i <=number; i++) {
            if (i%3==0||i%5==0) {
                System.out.print(i+" ");
            }

        }
    }
}
