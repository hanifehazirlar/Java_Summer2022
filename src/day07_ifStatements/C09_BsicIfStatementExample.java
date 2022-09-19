package day07_ifStatements;

public class C09_BsicIfStatementExample {
    public static void main(String[] args) {
        int sayi = 23;


        if (sayi > 0) {
            System.out.println("sayi pozitif"); // degere bagli
            System.out.println("pozitif kalacaktir"); // degere bagli
            System.out.println("Ucuncu satir"); // degere bagli
        }

        if (sayi % 2 == 0) {
            System.out.println("sayi cift"); // degere bagli
            System.out.println("cift kalacaktir"); // degere bagli
        }

        if (sayi % 5 == 0) {

            System.out.println("sayi 5'in tam kati"); // degere bagli
        }

    }
}
