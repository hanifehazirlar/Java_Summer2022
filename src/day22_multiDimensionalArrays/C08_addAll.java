package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_addAll {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<Integer> sayilar2=new ArrayList<>();
        sayilar1.add(10);
        sayilar1.add(15);
        sayilar1.add(16);
        sayilar1.add(20);
        sayilar1.addAll(sayilar2);
        System.out.println(sayilar1); // [5, 3, 2, 10, 15, 16, 20]
        sayilar1.addAll(1,sayilar2);
        System.out.println();

    }
}
