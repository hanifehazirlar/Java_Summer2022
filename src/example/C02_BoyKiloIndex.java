package example;

import java.util.Scanner;

public class C02_BoyKiloIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("kilonuzu giriniz(kg)");
        int kilo = scan.nextInt();

        System.out.println("boyunuzu giriniz (cm)");
        double boy = scan.nextDouble() / 100;

        double bMI = kilo / (boy * boy);
        System.out.println("Agirlik : " + kilo);
        System.out.println("Boy : " + boy);
        System.out.println("BMI : " + bMI);
        if (bMI < 18.5) {
            System.out.println("Zayifsiniz");
        } else if (bMI < 25) {
            System.out.println("Kilonuz ideal");
        } else if (bMI < 30) {
            System.out.println("Sismansiniz");
        } else if (bMI >= 30) {
            System.out.println("Obez");
        }
    }
}
