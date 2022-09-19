package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        // 1'den 5 e kadar(5 dahil) olan tamsayilari toplayalim
        int toplam=0;
        for (int i = 1; i <=5 ; i++) {
            toplam+=i;
        }
        System.out.println("toplam : " + toplam);
        // 10 dahil - 20 dahil aradaki sayilari toplayin
        toplam=0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println("10-20 arasi toplam : " + toplam);
        // 30 dagil 50 dahil, aradaki cift sayilari toplayin
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }
        System.out.println("30-50 arasi cift sayilarin toplam : " + toplam);
        //2.yontem
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arasi cift sayilarin toplam : " + toplam);
        // 1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin
        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("1500-1600 arasi yedi ile bolunebilen sayilarin toplam : " + toplam);
    }
}
