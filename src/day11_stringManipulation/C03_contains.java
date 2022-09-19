package day11_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
         /*
    Soru 1) Kullanicidan email adresini girmesini isteyin,
    -mail @gmail.com  icermiyorsa "Lutfen gmail adresi giriniz",
    -@mail.com ile bitiyorsa "Email adresiniz kaydedildi",
    -@gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin yazdirin
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email=scan.nextLine();
        if (!email.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresi yaziniz");
        }else if (email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("Lutfen yazimi kotrol edin");

        }

    }
}
