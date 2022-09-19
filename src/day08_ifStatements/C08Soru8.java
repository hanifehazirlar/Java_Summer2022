package day08_ifStatements;

import java.util.Scanner;

public class C08Soru8 {
    public static void main(String[] args) {
        // Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin
        // Teklif 80000'in uzerinde ise "Kabul ediyorum",
        // 60-80000 arasinda ise "Konusabiliriz"
        // 60000'nin altinda ise "Maalesef Kabul Edemem" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir maas teklifi giriniz");
        double maas=scan.nextDouble();
        if(maas>80000) {
            System.out.println("Kabul ediyorum");
        } else if (maas > 60000) {
            System.out.println("Konusabiliriz");
        }else {
            System.out.println("Maalesef Kabul Edemem" );
        }
    }
}
