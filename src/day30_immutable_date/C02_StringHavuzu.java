package day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str3); // false

        System.out.println(str2.equals(str4)); // true
        System.out.println(str2 == str4); // false

        System.out.println("s1-s4 " + str1.equals(str4)); // true
        System.out.println("s1-s4 " + (str1 == str4)); // true

        /*
        1-) yeni bir String olustururken esitligin saginda new keyword' u olursa java direk yeni bir obje ve ref.olusturur
        2-) eger esitligin saginda bir method calisiyor veya yeni bir islem(+ islem) yapiliyorsa
            String immutable oldugundan degisikligi kaydetmek uzere
            hemen bir kopya String ve ref. olusturur, sonra degeri hesaplayip bu yeni kopya objenin icine koyar
         */

        String str5 = "Ali Can";
        String str6 = str1;
        System.out.println(str1.equals(str5)); // true
        System.out.println(str5 == str1); // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1 == str6); // true

        System.out.println(str5.equals(str6)); // true
        System.out.println(str5 == str6); // true
        /*
        Eger yeni String objesi olusturulurken
        new kelimesi kullanilmaz veya
        esitligin saginda bir islem olmazsa Java bakar

        Eger daha once olusturulan String objelerden (String Havuzu)
        bire bir ayni String varsa o objeyi ve referansini kullanir,
        bire bir aynisi yoksa yeni bir obje olusturur.
         */
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if (a == "2cfalse") {
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");// Ekranda yazan equals
        }

        List<String> list=new ArrayList<String>();
        list.add("one");
        list.add("two");
        // list.add(7); 7 String sekilde yazilmadigi icin burada error veriyor
        for (String s:list) System.out.println(s);

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for (Integer v : values) System.out.print(v);


    }
}
