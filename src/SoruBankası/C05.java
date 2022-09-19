package SoruBankası;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
         /*
      Kullanıcıdan alınan Stringin son karakterini silip ekrana yazan Java kodunu yazınız.

      Test Data:
      good

      Beklenen Çıktı:
      goo
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str=scan.nextLine();
        String yeniStr="";
        for (int i = 0; i <str.length()-1; i++) {
            yeniStr+=str.charAt(i);
        }
        System.out.println(yeniStr);

    }
}
