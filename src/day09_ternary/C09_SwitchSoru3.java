package day09_ternary;

public class C09_SwitchSoru3 {
    /*
     Kullanicidan bir sayi girmesini isteyin
     Girilen sayi
     10 ise "Iki basamakli en kucuk sayi"
     100 ise "uc basamakli en kucuk sayi"
     1000 ise "dort basamakli en kucuk sayi"
     diger durumlarda "Girdigin sayiyi degistir" yazdirin
     */
    public static void main(String[] args) {
        int girilenSayi=10;
        switch (girilenSayi){
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");
        }
    }

}
