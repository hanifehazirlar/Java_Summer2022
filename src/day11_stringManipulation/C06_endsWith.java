package day11_stringManipulation;

public class C06_endsWith {
    public static void main(String[] args) {
          /*
    Soru 1) Kullanicidan email adresini girmesini isteyin,
    -mail @gmail.com  icermiyorsa "Lutfen gmail adresi giriniz",
    -@mail.com ile bitiyorsa "Email adresiniz kaydedildi",
    -@gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin yazdirin
     */
        String input="hanifehzrlar@gmail.com";
        if (!input.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresi giriniz");
        }else if (input.endsWith("@gmail.com")) {
            System.out.println("Email adresi kaydedildi");
        }else {
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
