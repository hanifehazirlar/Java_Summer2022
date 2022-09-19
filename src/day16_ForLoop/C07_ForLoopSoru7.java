package day16_ForLoop;

public class C07_ForLoopSoru7 {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan bir String isteyin String i tersten yazdirin
        String input="Java guzel";
        String tersInput="";
        for (int i =input.length()-1; i>=0; i--) {
            tersInput+=input.charAt(i);

        }
        System.out.println("yazdiginiz inputun ters hali : "+tersInput);
    }
}
