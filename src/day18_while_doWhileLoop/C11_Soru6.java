package day18_while_doWhileLoop;

import java.util.Scanner;

public class C11_Soru6 {
    public static void main(String[] args) {
        // Kullanicidan toplamak icin sayi isteyin ve toplam 500'e ulasincaya kadar istemeye devam ettirin.
        // Toplam 500'e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin.
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayiAdedi=0;
        do {
            System.out.print("Lutfen toplamak icin bir sayi girin : ");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayiAdedi++;
        }while(toplam<500);
        System.out.println("toplam "+sayiAdedi+" girdiniz");
        System.out.println("Girdiginiz "+sayiAdedi+" tane sayinin toplami = "+ toplam);



    }


}

