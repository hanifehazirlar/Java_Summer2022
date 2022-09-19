package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentSoru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yas girin");
        int yas=scan.nextInt();
        try {
            if (yas<0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("yas icin negatif sayi girilmez");
        }
        System.out.println(yas);
        scan.close();
    }
}
