package example;

public class C13_MükemmelSayi {
    public static void main(String[] args) {
        int sayi=7;
        int bölTop=0;
        for (int i = 1; i <sayi; i++) {
            if (sayi%i==0) {
                bölTop+=i;
            }
        }
        if (bölTop==sayi){
            System.out.println(sayi+" Mukemmel Sayidir");
        }else {
            System.out.println(sayi+" Mukemmel Sayi degildir");
        }
        System.out.println("");
        int bas=1;
        while(bas<sayi){
            if (sayi%bas==0) {
                bölTop+=bas;
            }
            bas++;
        }
        if (bölTop==sayi){
            System.out.println(sayi+" Mukemmel Sayidir");
        }else {
            System.out.println(sayi+" Mukemmel Sayi degildir");

        }
    }
}
