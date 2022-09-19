package day07_ifStatements;

public class C09_BasicIfStatementExample {
    public static void main(String[] args) {
        int sayi=15;
        if (sayi<0){
            System.out.println("sayi negatif");
        }
        if (sayi==0){
            System.out.println("sayi'nin isareti yok");
        }
        if (sayi>0){
            System.out.println("sayi pozitif");
        }
        if (sayi%3==0){
            System.out.println("sayi 3'ün kati");
        }
        if (sayi%4!=0){
            System.out.println("sayi 4'ün kati degil");
        }
    }
}
