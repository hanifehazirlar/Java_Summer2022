package example;

public class AmstrongSayi {
    /* TASK :
verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

*/
    public static void main(String[] args) {
        int yeni = 0;
        int sayi = 54748;
        int temp1 = sayi;// sayimiz degismesin diye atadik
        int sayac = 0;
        while (temp1 > 0) {
            yeni = temp1 % 10;
            temp1 /= 10;
            sayac++; // basamak sayisini buldurduk
        }
        System.out.println(sayi + "'nin basamak sayisi : " + sayac);

        int temp = sayi;// sayimiz degismesin diye atadik
        double yeniSayi = 0;
        while (temp > 0) {
            yeniSayi += Math.pow(temp % 10, sayac);// matematik classından aldik.sayinin istenen üssünü aliyor
            temp /= 10;
        }
        if (sayi == yeniSayi) {
            System.out.println(sayi + " sayisi bir Amstrong sayidir ");
        } else System.out.println(sayi + " sayisi bir Amstrong sayi degildir ");
    }
}
