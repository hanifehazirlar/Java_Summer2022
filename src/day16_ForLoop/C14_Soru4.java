package day16_ForLoop;

import java.util.Scanner;

public class C14_Soru4 {
    public static void main(String[] args) {
        // Ask the user for an integer less than 100.Print multiples of 3 from 1 to the number entered.
        // Kullanıcıdan 100'den küçük bir tam sayı isteyin. 1'den başlayarak girilen sayıya kadar 3'ün katı olan sayıları yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer less than 100");
        int number = scan.nextInt();
        for (int i = 1; i <=number; i++) {
            if(i%3==0) {
                System.out.print(i+" ");
            }

        }
    }
}
