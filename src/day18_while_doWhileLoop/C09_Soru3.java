package day18_while_doWhileLoop;

import java.util.Scanner;

public class C09_Soru3 {
    public static void main(String[] args) {
        // Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0'a basmasini soyleyin.
        // Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini ve
        // girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int pozSayiAdedi=0;
        do {
            System.out.print("Toplamak uzere bir sayi giriniz : ");
            sayi= scan.nextInt();
            if (sayi<0){
                System.out.println("Pozitif bir sayi giriniz");
            }else if(sayi>0){
                toplam+=sayi;
                pozSayiAdedi++;
            }
        }while (sayi!=0);
        System.out.println("");
        System.out.println("Girilen pozitif sayi adedi : "+pozSayiAdedi);
        System.out.println("Girilen "+pozSayiAdedi+" pozitif sayinin toplami : "+toplam);


    }
}
