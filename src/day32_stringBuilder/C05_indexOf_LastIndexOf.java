package day32_stringBuilder;

public class C05_indexOf_LastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pay attention please");
        System.out.println("sb.indexOf(\"Pay\") = " + sb.indexOf("Pay")); // sb.indexOf("Pay") = 0 (pay kelimesinin
                                                                           // ilk harfinin
                                                                           // index'ini verir)
        System.out.println(sb); // Pay attention please

        System.out.println(sb.indexOf("e")); // 7
        System.out.println(sb.indexOf("e",10)); // 16 (10.index'ten sonraki ilk e'nin index'i)

        System.out.println(sb.lastIndexOf("e")); // 19
        System.out.println(sb.lastIndexOf("e",10)); // 7 (10.index'ten geriye dogru ilk e'nin index'i)

    }
}
