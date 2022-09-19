package day16_ForLoop;

public class C08_ForLoopSoru8 {
    public static void main(String[] args) {
        // Soru 8) Kullanicidan bir String isteyin  method olarak yazdirin
        String input="Java Guzel";
        tersInput(input);
    }

    public static void tersInput(String input) {
        String tersInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            tersInput += input.charAt(i);

        }
        System.out.println("yazdiginiz inputun ters hali : " + tersInput);
    }
}
