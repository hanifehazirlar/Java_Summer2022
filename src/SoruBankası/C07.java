package SoruBankası;

public class C07 {
    /* Belirli bir diziden, toplamı belirli bir sayı olan tüm çiftleri bulun
    Dizi {4, 6, 5, -10, 8, 5, 20} ise ve sayı 10 ise çıktı
     4+6=10, 5+5=10, -10+20=10
*/
    public static void main(String[] args) {
        int [] arr={4, 6, 5, -10, 8, 5, 20};
        int arananToplam=10;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==arananToplam){
                    System.out.print(arr[i]+" + "+arr[j]+"= "+arananToplam+", ");
                }
            }

        }
    }
}
