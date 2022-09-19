package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kayra");
        sb.substring(0,3);
        System.out.println(sb);// Kayra
        // sonuc String donuyorsa String immutable oldugu icin donen variable de immutable ' a donusur
        sb.subSequence(0,3);
        // Bu method String dondurdugu icin StringBuilder'in eski halini degistirmez
        System.out.println(sb); // Kayra

        int total = 0;
       StringBuilder sb1=new StringBuilder("abcdefg");
       total+=sb1.substring(1,2).length();
       total+=sb1.substring(6,6).length();
      // total+=sb1.substring(6,5).length(); (an exception is thrown)
        System.out.println(total);


    }
}
