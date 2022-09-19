package adventece;

import java.util.Scanner;

public class C01 {
    // Kullanıcıdan bir isim isteyin ve isim sadece 3 harfli olmalidir ternary kullanarak harflerin
    // uniq yani farkli olup olmadigina bakiniz
    // ala ve ali inputlarini deneyiniz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("3 harfli bir kelime giriniz");
        String kelime=scan.nextLine();
        kelime=kelime.length()!=3?"3 harfli degil hatali giris":kelime.substring(0,1).
                equalsIgnoreCase(kelime.substring(1,2))?"Kelime ayni harfler iceriyor":
                kelime.substring(0,1).equalsIgnoreCase(kelime.substring(2))?"Kelime ayni harfler iceriyor":
                kelime.substring(1,2).equalsIgnoreCase(kelime.substring(2))?"Kelime ayni harfler iceriyor":
                        "Kelime ayni harf icermiyor";
        System.out.println(kelime);

    }
}
