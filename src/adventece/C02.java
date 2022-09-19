package adventece;

public class C02 {
    // String girildiginde ilk iki karakteri haric string return eden java method yaziniz ancak
    // ilk karakter g veya ikinci karakter h ise bu karakterleride return edin
    // input kalem output lem
    // input photo output hoto
    public static void main(String[] args) {
        String str="ghoto";
        String yeniStr=ilkIkiHaric(str);
        System.out.println(yeniStr);
    }
    public static String ilkIkiHaric(String str) {
        String ilkHarf=str.substring(0,1);
        String ikinciHarf=str.substring(1,2);
        String str2="";
        if(ilkHarf.equals("g")&& ikinciHarf.equals("h")) {
            str2 = str;
        }else if (ilkHarf.equals("g")) {
            str2 = ilkHarf + str.substring(2);
        }else if (ikinciHarf.equals("h")) {
            str2 = ikinciHarf + str.substring(2);
        }else {
            str2 = str.substring(2);
        }
        return str2;
    }
}
