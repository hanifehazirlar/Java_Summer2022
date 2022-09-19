package day12_stringManipulations;

public class C04_subString {
    public static void main(String[] args) {

        String str="Java cok yasa";
        System.out.println(str.substring(3,4)); // a (3.indexden basla (4-3=1) 1 tane karakter al)
                                                //  (3.indexden basla(3.index dahil)4.,indexe kadar al(4.index dahil degil)
        System.out.println(str.substring(5,7)); // co (5.indexten basla (7-5=2) 2 tane karakter al)
                                                //  (5.indexden basla(5.index dahil), 7.indexe kadar al(7.index dahil degil)
        System.out.println(str.substring(6,6)); // "" (6.indexten basla (6-6=0) 0 tane karakter al),bu yuzden hiclik olur

        // System.out.println(str.substring(6,2)); // exception yazdirinca hata verir

        System.out.println("====");

    }
}
