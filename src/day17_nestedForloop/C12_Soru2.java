package day17_nestedForloop;

public class C12_Soru2 {
    public static void main(String[] args) {
        // For loop ve while loop kullanarak 3 basamakli sayilardan
        // 15,20 ve 90 ' a tam bolunebilen sayilari yazdirin
        int bas=100;
        int bit=999;
        System.out.println("3 basamakli 15,20 ve 90'a tam bolunen sayilar : ");
        for (int i = bas; i <=bit; i++) {
            if (i%15==0 &&i%20==0 && i%90==0){
                System.out.print(" "+i);
            }

        }
        System.out.println("");
        System.out.println("3 basamakli 15,20 ve 90'a tam bolunen sayilar : ");
        while (bas<=bit){
            if (bas%15==0 && bas%20==0 && bas%90==0){
                System.out.print(" "+bas);
            }
            bas++;

        }


    }
}
