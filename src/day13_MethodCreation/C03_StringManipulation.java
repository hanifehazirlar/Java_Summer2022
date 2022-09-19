package day13_MethodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {

        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String str= "  Java ogrenmek123 Cok guzel@  ";
        str=str.trim(); // Java ogrenmek123 Cok guzel@
        str=str.replaceAll("\\d","");// Java ogrenmek Cok guzel@
        str=str.replace("@","."); // Java ogrenmek Cok guzel.
        str=str.replace("C","c"); // Java ogrenmek cok guzel.

        System.out.println(str); // Java ogrenmek cok guzel.
    }
}
