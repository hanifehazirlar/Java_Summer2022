package day13_MethodCreation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        //Soru 2) Str seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        //String str1="$13.99"
        //String str2="$10.55"
        //ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
        String str1 ="$13.99";
        String str2 ="$10.55";
        str1=str1.replace("$","");
        str2=str2.replace("$","");
        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);
        double c =a+b;
        String d=String.valueOf(c);
        System.out.println("$".concat(d));
    }
}
