package example;

public class C18_NestedFor {
    public static void main(String[] args) {
        //Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
        //
        //Beklenen Çıktı:
        //0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.print("0"+" ");
            }
            System.out.println("");
        }



    }
}
