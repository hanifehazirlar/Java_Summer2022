package day15_overloading_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {
        C06_StringTerseCevirme.terstenYazdir("Zekeriya");
        // 100'den 1'e kadar(sinirlar dahil) 8 ile bolunebilen sayilari yazdirin
        for (int i = 100; i >=1 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }
        }
    }
}
