package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatemants {
    public static void main(String[] args) {


        // soru 2-) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if ((harf>='a'&& harf<='z') ||(harf>='A' && harf<='Z')){
            System.out.println("Girilen karakter bir harf ");
        } else {
            System.out.println("Girilen karakter bir harf degil");
        }


    }
}
