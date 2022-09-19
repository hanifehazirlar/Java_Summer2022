package day24_arrayLists_ForEachLoop;

public class C07_ArraydekiSayilarinKareToplami {
    public static void main(String[] args) {
        int[] sayilar={2,3,4,1,5,7,6,5,4,3};
        int top=0;
        for (int each: sayilar
             ){
            top+=each*each;

        }
        System.out.println("Kareler toplami : "+top); // 190
    }
}
