package SoruBankası;

public class C03 {
    public static void main(String[] args) {
        // Bir String'in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazın.
        String str = "hanife74";
        String karakter = "7";
        if (str.contains(karakter)) {
            System.out.println("Karakteri iceriyor1");
        } else {
            System.out.println("Karakteri icermiyor1");
        }

        if (str.indexOf(karakter) != -1) {
            System.out.println("Karakteri iceriyor2");
        } else {
            System.out.println("Karakteri icermiyor2");
        }

        String sonuc1 = "";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(karakter)) {
                sonuc1 = "Karakteri iceriyor3";
                break;
            } else sonuc1 = "Karakteri icermiyor3";
        }
        System.out.println(sonuc1);
    }
}
