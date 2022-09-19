package example;

public class C20_ArraydeTekCiftSayiAdedi {
    public static void main(String[] args) {
       /* Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
         Array: [1,2,3,4,5,6,7,8,9]
        Beklenen Çıktı:
        Tek Sayilar: 5
        Cift Sayilar: 4
        */
        int[] arr={1,2,3,4,5,6,7,8,9};
        int tekSayiAdedi=0;
        int ciftSayiAdedi=0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%2==0){
                ciftSayiAdedi++;
            }else tekSayiAdedi++;
        }
        System.out.println("ciftSayiAdedi = " + ciftSayiAdedi);
        System.out.println("tekSayiAdedi = "+tekSayiAdedi);
    }
}
