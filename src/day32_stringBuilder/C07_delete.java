package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java her zaman guzel");
        sb.delete(8,9);// 8.index dahil 9.index dahil degil siler
        System.out.println(sb); // Java herzaman guzel

        sb.deleteCharAt(8);
        System.out.println(sb); // Java heraman guzel (8.index'i sildi

        // bastan baslayarak her loop'da ilk harfi silip kalani yazdiralim
        int son=sb.length(); // burda length'i sabitledik sildikçe length azalmasin diye
        for (int i = 0; i <son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
            /*
            ava heraman guzel
            va heraman guzel
            a heraman guzel
             heraman guzel
            heraman guzel
            eraman guzel
            raman guzel
            aman guzel
            man guzel
            an guzel
            n guzel
             guzel
            guzel
            uzel
            zel
            el
            l
            */
        }
    }
}
