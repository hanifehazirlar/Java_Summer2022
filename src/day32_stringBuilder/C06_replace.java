package day32_stringBuilder;

public class
C06_replace {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Calm down");

        sb.replace(5,9,"Up");
        System.out.println(sb); // Calm Up

        sb.replace(4,5,"---");
        System.out.println(sb); // Calm---Up

        sb.replace(4,7," "); // replace() methodunda neyi degistirmek istiyorsak onun index'i ile basliyoruz
                                          // sonda dahil olmayanin index'ini yaziyoruz
        System.out.println(sb); // Calm Up

        sb.replace(5,7,"down");
        System.out.println(sb); // Calm down




    }

}
