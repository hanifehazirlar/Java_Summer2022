package example;

public class C09_TekrarsizInput {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input = "java guzel mi guzel";

        String islenecekInput = input.replaceAll("\\W", "");
        String benzersizInput = "";


        for (int i = 0; i < islenecekInput.length(); i++) {
           // if (!benzersizInput.contains(islenecekInput.charAt(i))) {
                System.out.print(", "+islenecekInput.charAt(i));
                benzersizInput+=input.charAt(i);
            }
        System.out.println("Farkli harf sayis : "+benzersizInput.length());
        }
    }


