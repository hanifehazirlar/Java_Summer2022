package day18_while_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoopSoru7 {
    public static void main(String[] args) {
        //Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi=scan.nextInt();  // 523

        int rakamlarToplami=0;
        int birlerBasagi=0;
        int temp=sayi;   // sayi degerinin uzerinde degisiklik olmamasi icin sayi yi temp e atadik
        while(temp>0){
            birlerBasagi=temp%10;             // 523%10=3  52%10=2  5%10=5
            rakamlarToplami += birlerBasagi; // 0+3=3  3+2=5 5+5=10
            temp /= 10;                      // 523/10=52  52/10=5 5/10=0

        }
        System.out.println(sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
    }

    }




