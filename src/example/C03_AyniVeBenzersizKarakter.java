package example;

import java.util.Scanner;

public class C03_AyniVeBenzersizKarakter {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    System.out.println("Uzunlugu 3 olan bir isim giriniz");
    String isim = scan.nextLine();
    System.out.println((isim.charAt(0)==isim.charAt(1))||(isim.charAt(0)==isim.charAt(2))||(isim.charAt(1)==isim.charAt(2))?
                "isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var");

    /* if ile çözümü
    if((isim.charAt(0)==isim.charAt(1))||(isim.charAt(0)==isim.charAt(2))||(isim.charAt(1)==isim.charAt(2))){
        System.out.println("isim ayni karakterlere sahiptir.");
    }else {
        System.out.println("Dizenin benzersiz karakterleri var");
    }
    */
    }
}
