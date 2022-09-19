package day45_collections;

import java.util.HashSet;
import java.util.Set;

public class C06 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(5);
        set1.add(0);
        set1.add(-2);
        set1.add(1);
        set1.add(-2);

        System.out.println(set1);
    }
}
