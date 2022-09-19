package adventece;

import java.util.Scanner;

public class C03 {
    /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("3 kelimeli isim giriniz");
        String isim=scan.nextLine();
        String[] arr=isim.split(" ");// [Ahmet, Emin,Yilmaz]
        System.out.println(arr[0].charAt(0)+"."+arr[1].charAt(0)+"."+arr[2].charAt(0)+".");

        //2.yol
        char ilkHarf=isim.charAt(0);
        char ikinciHarf=isim.charAt(isim.indexOf(" ")+1);
        char ucuncuHarf=isim.charAt(isim.lastIndexOf(" ")+1);
        String sonuc=ilkHarf+"."+ikinciHarf+"."+ucuncuHarf+".";
        System.out.println(sonuc);
    }
}
