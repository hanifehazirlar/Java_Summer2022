package example;

import java.util.Scanner;

public class C22_Binary {
    public static void main(String[] args) {
        /*
        Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.

        Test Data:
        birinci binary number: 100010
        ikinci  binary number: 110010
        Beklenen Çıktı:
        1010100
         */
        int binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
        binary1 = in.nextInt();
        binary2 = in.nextInt();

        int ust = 1;
        int onlukDeger = 0;
        for (int j = binary1; j >= 0; j--) {
            onlukDeger += (binary1 % 10) * ust;
            binary1 /= 10;
            ust *= 2;
        }
        System.out.println(onlukDeger);
        int ust1 = 1;
        int onlukDeger1 = 0;
        for (int j = binary2; j >= 0; j--) {
            onlukDeger1 += (binary2 % 10) * ust1;
            binary2 /= 10;
            ust1 *= 2;
        }
        System.out.println(onlukDeger1);
        int toplamOnluk = onlukDeger + onlukDeger1;
        System.out.println("toplamOnluk = " + toplamOnluk);
        int artan = 0;
        int toplamIkilik = 0;
        while (toplamOnluk > 0) {
            sum[(artan)++] = toplamOnluk % 2;
            toplamOnluk /= 2;
        }
        for (int j = artan - 1; j >= 0; j--) {
            System.out.print(sum[j]);
        }


    }

}




