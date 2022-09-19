package day09_ternary;

import java.util.Scanner;

public class C12_NestedTernarySoru3 {
    public static void main(String[] args) {
        // Kullanicidan bir tam sayi alin ve
        // sayi 10'dan kucuk ise "Rakam",
        // sayi 100'den kücük ise "Iki basamakli sayi",
        // degilse "Uc basamakli veya daha buyuk sayi" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();
        System.out.println(sayi<10?"Rakam":sayi<100?"Iki basamakli sayi":"Uc basamakli veya daha buyuk sayi");
    }
}
