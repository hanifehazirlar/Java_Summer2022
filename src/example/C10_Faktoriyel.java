package example;

public class C10_Faktoriyel {
    public static void main(String[] args) {
        int sayi=6;
        int faktoriyel=1;
        System.out.print(sayi+"!="+sayi);
        for (int i = sayi; i >1; i--) {
            faktoriyel*=i;
            System.out.print("*"+(i-1));
        }
        System.out.println("="+faktoriyel);

        faktoriyel=1;
        System.out.print(sayi+"!="+sayi);
        while(sayi>1){
            faktoriyel*=sayi;
            System.out.print("*"+(sayi-1));
            sayi--;
        }
        System.out.println("="+faktoriyel);
    }

}
