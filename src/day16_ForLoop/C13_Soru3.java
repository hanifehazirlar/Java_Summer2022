package day16_ForLoop;

public class C13_Soru3 {
    public static void main(String[] args) {
        // Print numbers from 100 to 50 (including 50) on the same line, separated by commas
        // (100'den başlayarak 50'ye kadar(50 dahil) olan sayıları aralarında virgül olarak aynı satırda yazdırın)
        int begin=100;
        int end=50;
        for (int i = begin; i >= end; i--) {
            if(i>end){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
            }

        }
    }
}
