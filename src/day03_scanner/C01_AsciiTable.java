package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        // 6- Bir tamsayı, bir de char degisken olusturun ve bunların toplamını yazdirin.
        int sayi=10;
        char harf='a';
        String str="banan";
        System.out.println(sayi+harf);// 10a degil 10+97=107 oldu (char sayi gibi davrandi,ascii degerini kullandi)
        System.out.println(sayi*harf); //10a degil 10*97=970 oldu
        System.out.println(str+harf); // banana (Genel kurallara uygun)
        System.out.println(harf+2); // 97+2=99 oldu (char sayi gibi davrandi)
        System.out.println(str + sayi + harf); // banan10a (Soldan saga dogru gidildi,String int i String e cevirdi)
        // char yeniHarf=harf+2 (bu yazdırıamaz)
        /*
        1- char data turu isleme girdigi degiskenin turune gore farklı davranabilir
        eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir
        sayi+harf sayi variable'i int oldugundan harf variable'i asci tablosundan 97 degeri kullanir
        char yeniHarf=harf+2 java once sagdaki islemi yapar,sağda int + char gorunce ascii degeri alir ve sonucu 99 bulur
                             sonra atama islemi yapmaya calisir
                             char yeniHarf=99
                             bu atama java acisindan kabul edilebilir degildir
        2-str+harf);// banana String variable cok gucludur, hangi data turu ile
                       isleme girerse girsin diger data turunu kendine benzetir
         */
        // peki... konsolda 10a görmek istersek nasil yazdirmaliyiz?
        System.out.println(""+sayi+harf); // 10a olu.Başina "" koymamızın sebebi String in gücünden yararlanmak icin
                                          // int i String e çevirdi
        char deger='1';
        System.out.println(deger+harf); // '1'+'a'--> 49+97=146 olur.( char sayi gibi davrandi)

    }
}
