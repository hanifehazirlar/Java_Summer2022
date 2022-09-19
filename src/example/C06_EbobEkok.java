package example;

public class C06_EbobEkok {
    public static void main(String[] args) {
        //veerilen bir pozitif tam sayinin
        //pozitif tam bolenlerini yazdiralim
        int input1 = 30;
        int input2 = 40;

        int ebob = 0;
        int ekok = 0;
        if (input1 == 0 || input2 == 0) {
            System.out.println("Lutfen sifirdan buyuk bir sayi giriniz");

        } else {
            for (int i = 1; i <= input1; i++) {
                if (input1 % i == 0 && input2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println(input1 + " ve " + input2 + " icin GCD = " + ebob);
        }
        if (input1 == 0 || input2 == 0) {
            System.out.println("Lutfen sifirdan buyuk bir sayi giriniz");
        } else {
            for (int i = input1 * input2; i > 1; i--) {
                if (i%input1==0 && i%input2==0) {
                    ekok = i;
                }
            }
            System.out.println(input1 + " ve " + input2 + " icin LCM = " + ekok);
        }
    }
}





