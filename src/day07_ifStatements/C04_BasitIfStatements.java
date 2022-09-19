package day07_ifStatements;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        int sayi = -20;
        /*
        bir if statements'de { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagımsız olur

        Eger birden fazla satir ayni if sartina baglamis ise mutlaka { kullanmaliyiz
         */

        if (sayi > 0)
            System.out.println("sayi pozitif"); // degere bagli
        System.out.println("pozitif kalacaktir"); // her zaman yazar
        System.out.println("Ucuncu satir"); // her zaman yazar

        if (sayi % 2 == 0)
            System.out.println("sayi cift"); // degere bagli
        System.out.println("cift kalacaktir"); // her zaman yazar

        if (sayi % 5 == 0)
            System.out.println("sayi 5'in tam kati"); // degere bagli

    }
}
