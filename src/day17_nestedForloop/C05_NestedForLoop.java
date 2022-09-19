package day17_nestedForloop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen input'a gore * lardan olusan asagidaki sekli olusturun
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         */
        int input = 4;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = input - 1; i >= 1; i--) { // (3,3)(3,2)(3,1))
            for (int j = i; j >= 1; j--) {     // (2,2) (2,1)
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
