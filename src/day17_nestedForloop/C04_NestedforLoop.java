package day17_nestedForloop;

public class C04_NestedforLoop {
    public static void main(String[] args) {
        /*
        Verilen input'a gore *'lardan olusan bir ucgen olusturun
        ornek input=4 ise
               *
               * *
               * * *
               * * * *
         */
        int input = 4;

        for (int i = 1; i <= input; i++) { // (1,1)
            for (int j = 1; j <= i; j++) { // (2,1) (2,2)
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
