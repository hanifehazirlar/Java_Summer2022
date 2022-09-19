package day21_Arrays;

public class C11_Soru1 {
    // Asagıdaki multi dimensional arrayin tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
    // {{1,2,3},{4,5,6}}
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        int carpim=1;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+"x");
                carpim*=arr[i][j];

            }
        }
        System.out.println(" = "+carpim);
    }

}
