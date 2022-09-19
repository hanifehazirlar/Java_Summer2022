package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {
        //Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        // Ornek; array [1,2,3] ise output [2,3,1] olacak.

        int sayilar[]={1,2,3,4,5};
        int temp=sayilar[0];
        for (int i = 0; i < sayilar.length-1; i++) {

            sayilar[i] = sayilar[i+1]; // buraya kadar 2,3,4,5 olur
        }
        sayilar[sayilar.length-1] = temp; // burasi array'in son elemanina 0.indexteki elemanı ekler
        System.out.println(Arrays.toString(sayilar)); // [2, 3, 4, 5, 1]

        // yukaridaki degistirdigimiz array'i
        // ilk durumuna getirmek icin saga kaydiralim

        temp=sayilar[sayilar.length-1];
        for (int i=sayilar.length-1; i>0; i--) {
            sayilar[i] = sayilar[i-1];
        }
        sayilar[0]=temp; // burasi 0.index i basa ekler
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5]
    }
}
