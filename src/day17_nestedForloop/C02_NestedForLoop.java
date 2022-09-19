package day17_nestedForloop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        // verilen sayiya gore carpim tablosu olusturun
       /*
             input 3
                     1 2 3
                     2 4 6
                     3 6 9
        */

        int input = 5;
        for (int i = 1; i <= input; i++) {             // i satir sayisi (1,1)-(1,2)-(1,3)...
            for (int j = 1; j <= input; j++) {         // j sutun      (2,1) (2,2),(2,3)..
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }


}
