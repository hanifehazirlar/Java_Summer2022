package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
     while loop'da once kontrol edip sonra islem yaptigimiz icin
     islem bittikten sonra loop'un kirilmasi icin bir kez daha basa donmemiz gerekiyor
     bu durumda fazladan bir islem yapiliyor
     */

        int sayi = 7;
        while (sayi < 10) {
            System.out.println(sayi);
            sayi++;
        }
        /*
         do-while loop ile calistigimizda bu dezavantaj ortadan kalkar
         */
        sayi = 7;

        do {
            System.out.println(sayi);
            sayi++;

        } while (sayi < 10);


    }
}
