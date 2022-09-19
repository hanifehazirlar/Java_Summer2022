package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel"; // verilen bir String'de herhangi bir String veya char'in
        // ilk kullanildigi index'i bize verir.
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("l")); // 7
        System.out.println(str.indexOf("j")); // -1

        System.out.println(str.indexOf("mek")); // 10
        // eger istedigimiz index'den sonrasını kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullanabiliriz
        System.out.println(str.indexOf("g",(6+1))); // yazilan index'den baslar
        // yukaridaki str'da 2.ve 3. e'nin indexlerini bulun
        // 2.ci e'yi bulabilmek icin 1.e'nin index'ine ihtiyacim var

        int ilk_e=str.indexOf("e");
        int ikinci_e=str.indexOf("e",ilk_e+1);
        int ucuncu_e=str.indexOf("e",ikinci_e+1);
        // eger 2.e varsa 3.e'nin olup olmadigini
        // ve varsa index'ini yazdiralim

        if (ikinci_e==-1){
            System.out.println("verilen str'da 2.e yok");
        }else{

            if (ucuncu_e==-1){
                System.out.println("verilen str'da 3.e yok");
            }else {
                System.out.println("verilen str'daki 3.e'nin index'i : " + ucuncu_e);
            }
        }
    }
}
