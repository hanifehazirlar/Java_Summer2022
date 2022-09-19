package day17_nestedForloop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // 20'den 50'ye kadar cift sayilari yazdiralim(sinirlar dahil
        // for loop ile yapalim
        int bas=20;
        int bit=50;
        for (int i = bas; i <=bit; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        // while ile cozumu
        int temp=bas;
        while (temp<=bit) {
            if (temp%2==0){
                System.out.print(temp+" ");

            }
            temp++;
        }
    }
}
