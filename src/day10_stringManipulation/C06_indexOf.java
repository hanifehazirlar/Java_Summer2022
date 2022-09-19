package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // -1 bana integer donduruyor
        System.out.println(str.indexOf("e",8));                                     // int'de yok diye bir deger bulunmuyor
                                              // 0 dersek J'nin index'idir
                                              // - bir deger donerse biz aranan string'in str'da olmadigini anlariz
                                              // Java -1 dondurmeyi tercih etmistir
        String str5="sfhkküğ086734v .;oıygbdfghjklıuysdtghjnmö.çhjmmöçç.çç";
        // str5'de p harfi var midir?
        if (str5.indexOf("p")==-1){
            System.out.println("str5 de istenen karakter kullanilmamis");
        }else {
            System.out.println("str5 de istenen karakter kullanilmis");
        }
    }
}
