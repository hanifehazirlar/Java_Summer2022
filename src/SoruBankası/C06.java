package SoruBankası;

public class C06 {
    public static void main(String[] args) {
        /*
        Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

          Test Data:

          isPrime(31)
          true

          isPrime(18)
          false
         */

        boolean asalMii = asalMi();
        System.out.println(asalMi());

    }

    public static boolean asalMi() {
        int input1 = 31;
        int topl = 0;
        boolean sonuc=false;

        for (int i = 1; i <= input1; i++) {
            if (input1%i == 0) {
                topl += i;
            }
        }
        if (topl == input1 + 1) {
            sonuc=true;
        } else {
            sonuc=false;
        }
        return sonuc;
    }

}
