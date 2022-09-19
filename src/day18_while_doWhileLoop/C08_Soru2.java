package day18_while_doWhileLoop;

public class C08_Soru2 {
    public static void main(String[] args) {
        // Soru 2) 'm' harfinden baslayarak 'c' harfine kadar tum harfleri yazdirin.

        char ilkHarf='m';
        char sonHarf='c';
        System.out.print(ilkHarf+" harfinden "+sonHarf+" harfine kadar olan harfler :");
        do {

            System.out.print(ilkHarf+" ");
            ilkHarf--;

        }while (ilkHarf>=sonHarf);


    }
}
