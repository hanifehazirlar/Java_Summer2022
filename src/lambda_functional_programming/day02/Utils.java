package lambda_functional_programming.day02;

public class Utils {
    public static void ayniSatirdaBosluklaYazdir(Object obj) {
        System.out.print(obj+" ");
    }
    public static boolean ciftElemaniSec(int x){
        return x%2==0;

    }
    public static boolean tekElemaniSec(int x){
        return x%2!=0;

    }
    public static int karesiniAl(int x){
        return x*x;
    }
    public static int kupunuAl(int x){
        return x*x*x;
    }
    public  static double yarisiniAl(int x){
        return x/2.0;
    }
    public  static char sonKarateriAl(String str){
        return str.charAt(str.length() - 1);
    }
    public static char ilkKarakteriAl(String str){
        return str.charAt(0);
    }
    public static int rakamlarToplaminiAl(int x){
        int toplam=0;
        while(x>0){
            toplam+=x%10;
            x=x/10;
        }
        return toplam;

    }
}
