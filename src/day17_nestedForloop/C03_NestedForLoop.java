package day17_nestedForloop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
            verilen yukseklik ve boy degerine gore
            *'lardan olusan bir dikdortgen olusturalim
            yukseklik :3  boy:4

           ****
           ****
           ****
        */
        int yukseklik=4;
        int boy=8;
        for (int i = 1; i <=yukseklik; i++) {     // (1,1)-(1,2)-(1,3)-(1,4)-(1,5)-(1,6)-(1,7)-(1,8)
            for (int j = 1; j <=boy; j++) {       // (2,1)-(2,2)...
                System.out.print("* ");

            }
            System.out.println("");

            }

        }

    }

