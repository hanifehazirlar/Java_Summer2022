package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru6 {
    public static void main(String[] args) {
        //Soru 6) birden baslayarak istenen kadar fibonacci sayisini bir liste olarak olusturup yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        int sayi1=0;
        int sayi2=1;
        int sayi3=sayi1+sayi2;
        List<Integer> liste=new ArrayList<>();

        liste.add(sayi1);
        liste.add(sayi2);
        for (int i = 2; i <sayi; i++) {

                liste.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
                sayi3=sayi1+sayi2;


        }
        System.out.println(liste);

    }
}
