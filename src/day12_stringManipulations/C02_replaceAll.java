package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";
        // str'i Bugun Java cok guzel haline getirin
        // replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil
        //tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir String koyalim
        // "qazwsx"
        str=str.replace(" ","qazwsx"); // 1Bu2gu3nqazwsxJa*va-qazwsxcokqazwsxg3uz/el
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str); // 1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");

        // istenmeyeyen ozel karakter ve sayilardan kurtulduk
        // simdi space'leri geri getirelim
        str=str.replaceAll("qazwsx"," ");
        System.out.println(str);

    }
}
