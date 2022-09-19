package day16_ForLoop;

public class C02_FoorLoopHatalar {
    public static void main(String[] args) {
        // baslangic noktasindan sonra
        // bitis sartina yaklasmiyorsak sonsuz loop olur

         /*

        for (int i =0; i>-10 ;i++) {
            System.out.print(i);
            }
         */
        // eger ilk deger icin bile bitis sarti saglanmiyorsa
        // for loop calisir
        // ama loop body'si hic bir zaman devreye girmez(calizmaz)

            for (int i = 0; i > 5; i++) {
                System.out.println(i);
        }


    }
}
