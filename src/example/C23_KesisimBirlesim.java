package example;

import java.util.ArrayList;
import java.util.List;

public class C23_KesisimBirlesim {
    public static void main(String[] args) {
        /*
        iki adet MDA dizide bulunan elemanların ( küme elemanı gibi düşünün )
        kesişim kümesini ve birleşim kümesini ayrı ayrı yazdıran JAVA kodu yazınız.
        input : String [][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
                String [][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};
        output:  Dizilerin Kesişim Kümesi : 2c
         Dizilerin Birleşim Kümesi : a2c75kr1e8
         */
        String [][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String [][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};

        List<String> list1=new ArrayList<>();
        for (int i = 0; i <dizi1.length; i++) {
            for (int j = 0; j <dizi1[i].length; j++) {
                list1.add(dizi1[i][j]);
            }
        }
        List<String> list2=new ArrayList<>();
        for (int i = 0; i <dizi1.length; i++) {
            for (int j = 0; j <dizi2[i].length; j++) {
                list2.add(dizi2[i][j]);
            }
        }
        String kesisim="";
        String birlesim="";
        for (int i = 0; i <list1.size(); i++) {
            for (int j = 0; j <list2.size(); j++) {
                if (list1.get(i)== list2.get(j)){
                    kesisim+=list1.get(i);
                }
            }

        }
        for (int i = 0; i < list1.size(); i++) {
            birlesim += list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!(birlesim.contains(list2.get(i)))) {
                birlesim += list2.get(i);
            }
        }
        System.out.println(kesisim);
        System.out.println(birlesim);
    }
}
