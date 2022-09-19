package day09_ternary;

public class C07_SwitchSoru1 {
    // Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
    public static void main(String[] args) {
       int kacinciGun=8;
       switch (kacinciGun){
           case 1:
               System.out.println("pazartesi");
               break;
           case 2:
               System.out.println("sali");
               break;
           case 3:
               System.out.println("carsambar");
               break;
           case 4:
               System.out.println("persembe");
               break;
           case 5:
               System.out.println("cuma");
               break;
           case 6:
               System.out.println("cumartesi");
               break;
           case 7:
               System.out.println("pazar");
           default:
               System.out.println("Lutfen gecerli bir gun sayisi giriniz");

       }

    }
}
