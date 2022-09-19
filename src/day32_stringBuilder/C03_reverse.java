package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun

        String input = "Hey gidi for loop gunleri";
        String tersInput = tersineCevir(input);
        System.out.println("("+input+") cumlesinin tersi : "+tersInput);

        int sayi=4567;
        int tersSayi=tersSayiCevir(sayi);
        System.out.println(sayi+"'nin tersi : " + tersSayiCevir(sayi));
    }
    public static int tersSayiCevir(int sayi) {
        StringBuilder sb=new StringBuilder(sayi+""); // int data turunu "" ile String e cevirdik
        sb.reverse();
        int sayi1 = Integer.parseInt(sb+""); // StringBuilder data turunu "" ile String e cevirdik,
                                               // sonra parseInt ile String'i int data turune cevirdik.
                                               // cunku geri donen ifadenin data turu int olmali
        return sayi1;
    }
    public static String tersineCevir(String input) {

        StringBuilder sb= new StringBuilder(input);

        return sb.reverse().toString();
        // eger String de var olan methodlari kullanmak istersek StringBuilder'i once toString methodu ile
        // String'e cevirip kullanip sonra tekrar StringBuilder'a cevireceksin

    }

}

