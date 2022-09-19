package example;

public class C11_Alfabe {
    public static void main(String[] args) {
        char ilkHarf='a';
        char sonharf='z';
        for (char i =ilkHarf; i <=sonharf; i++) {

            System.out.print(i+" ");
        }
        System.out.println("");
        while(ilkHarf<=sonharf){
            System.out.print(ilkHarf+" ");
            ilkHarf++;

        }
    }
}
