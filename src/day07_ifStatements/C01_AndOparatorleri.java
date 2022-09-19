package day07_ifStatements;

public class C01_AndOparatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0 && b<20 && c>=b); // 1 && 1 && 1= 1 sonuc true

        System.out.println(a<0 && b<20 && c>=b); // 0 &&  (Sıfırı gordükten sonra kontrol etmeye devam etmez) sonuc false
        /*
        Java and operatoru konusunda bize iki secenek sunar
        && kullanirsak, ilk false buldugunda, artik sonucun false olacagini bilir
         ve geriye kalan sartlari incelemez

         & kullanirsak tum sartlari kontrol eder sonra sonucu belirler
         bu calisma usulunden dolayi & operatoru, && operatorune gore daha yavas olabilir
         */
        System.out.println(a<0 & b<20 & c>=b); // 0 & 1 & 1= 0 sonuc false
    }
}
