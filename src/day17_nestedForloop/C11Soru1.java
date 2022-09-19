package day17_nestedForloop;

public class C11Soru1 {
    public static void main(String[] args) {
        // Soru 1) While loop kullanarak 3'den 13' e kadar(sinirlar dahil) tum tek tamsayilari ekrana yazdiriniz.
        int bas=3;
        int bit=13;
        while (bas<=bit){
            if (bas%2!=0){
                System.out.println(bas+"");
            }
            bas++;
        }

    }
}
