package day16_ForLoop;

public class C09_ForLoopSoru9 {
    public static void main(String[] args) {
        // Soru 9) Verilen String in Polindrome olup olmadigini kontrol ediniz.
        // Palindrome ifadeler düz ve tersten yazimi ayni olan ifadelerdir

        String input="aba";
        String tersInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.charAt(i);
        }
        if (input.equals(tersInput)){
            System.out.println("Bu sayi polindrome dur");
        }else {
            System.out.println("Bu sayi polindrome degildir");
        }
    }
}
