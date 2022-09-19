package lambda_functional_programming.day04;

import lambda_functional_programming.day02.Utils;

import java.util.stream.IntStream;

public class Fp01 {
    public static void main(String[] args) {
        System.out.println("get7den100eToplam() = " + get7den100eToplam());//get7den100eToplam() = 5029
        System.out.println("get7den100eToplam02() = " + get7den100eToplam02());
        System.out.println("get2den11eCarpim() = " + get2den11eCarpim());//get2den11eCarpim() = 39916800
        System.out.println("faktoriyelHesapla = " + faktoriyelHesapla(5));//faktoriyelHesapla(5) = 120
        System.out.println("ikiSayiArasindakiCiftSayilarinToplami = " + ikiSayiArasindakiCiftSayilarinToplami(7, 3));//10
        System.out.println("ikiSayiArasindakiRakamlarinToplami() = " + ikiSayiArasindakiRakamlarinToplami(12,10));//6
    }
    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
    public static int get7den100eToplam() {
       return IntStream.range(7,101).reduce(Math::addExact).getAsInt();//burayi get yapmadan baslangic 0 ekleyebilirdik
         //range methodu IntStream interface de vardir ve belli bir araligi alir.son degeri almaz
        // Artımlı 1 adımla startInclusive'den (dahil) endExclusive'e (hariç) sıralı sıralı bir IntStream döndürür.
    }
    public static int get7den100eToplam02(){
        return  IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
        //rangeClosed son deger ile kapatir
        //1'lik artımlı bir adımla startInclusive'den (dahil) endInclusive'e (dahil)
        // sıralı sıralı bir IntStream döndürür

    }
    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int get2den11eCarpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyelHesapla(int n) {

        if (n > 1 && n < 13) {
            return IntStream.rangeClosed(1, n).reduce(Math::multiplyExact).getAsInt();
        } else if (n==0) {
            return 1;
        }
        System.out.println("0`dan buyuk deger giriniz");
        return 0;
    }
    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
    public static int ikiSayiArasindakiCiftSayilarinToplami(int num1, int num2){
        if(num1<num2) {
            return IntStream.rangeClosed(num1, num2).filter(Utils::ciftElemaniSec).sum();
        }else{
            return IntStream.rangeClosed(num2, num1).filter(Utils::ciftElemaniSec).sum();
        }
    }
    // 5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68
    public  static int ikiSayiArasindakiRakamlarinToplami(int num1,int num2) {
        if (num1 < num2) {
            return IntStream.rangeClosed(num1, num2).map(Utils::rakamlarToplaminiAl).sum();
            // sum() Bu akıştaki öğelerin toplamını döndürür.
        } else {
            return IntStream.rangeClosed(num2, num1).map(Utils::rakamlarToplaminiAl).sum();
        }
    }

}
