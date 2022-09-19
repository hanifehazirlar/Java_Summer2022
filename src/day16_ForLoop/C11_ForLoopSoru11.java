package day16_ForLoop;

public class C11_ForLoopSoru11 {
    public static void main(String[] args) {
        // Kullanicidan 10'dan kucuk sayi isteyin faktoriyelini yazdirin
        int sayi=5;
        int sonuc=1;
        if (sayi<10 && sayi>0){
            System.out.print(sayi+"!=");
            for (int i =sayi; i>=1; i--) {
               if (i>1){
                   System.out.print(i+"*");
               }else{
                   System.out.print(i);
               }
                sonuc*=i;
            }
            System.out.println("="+sonuc);
        }else{
            System.out.println("Lutfen sıfırdan buyuk 10'dan kucuk bir sayi giriniz");
        }
    }
}
