package adventece;

public class C04 {
    // TASK :
    //        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
    //        ceviren bir method yaziniz.
    public static void main(String[] args) {
       double saat=5;
       double mil=5;
       double kg=5;
        cevirme(saat, mil, kg);

    }

    public static void cevirme(double saat, double mil, double kg) {
        System.out.println(saat+" saat = "+saat*3600+" saniye");
        System.out.println(mil+" mil = "+mil*1.6+" km");
        System.out.println(kg+" kg = "+kg*1000+" g");
    }
}
