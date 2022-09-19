package day20_Arrays;

public class C06_ElemanlariToplama {
    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5};
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("toplam = " + toplam);
    }
}
