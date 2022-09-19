package day18_while_doWhileLoop;

public class C07_Soru1 {
    public static void main(String[] args) {
        // Soru 1) 9'dan 190'a kadar 7'nin kati olan tum tamsayilari ekrana yazdiriniz.
        int bas=9;
        int bit=190;

        do {
            if (bas%7==0) {
                System.out.print(bas+" ");
            }
            bas++;

        }while (bas<=bit);

    }
}
