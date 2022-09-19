package day31_timeFormater_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir(5,"Ismail","Ali","Mihrican","Mustafaa","Hanife");
        enUzunKelimeyiYazdir(3,"Ismail","Ali","Ismail");
        /*
         Varargs teorik olarak sonsuz sayida element alabilir
     bir method'da parametre olarak varargs varsa
     varargs'in sinirlarini bilebilmesi icin
     parametrelerin sonuncusu olmalidir.
     oncesinde farkli parametreler olabilir ama
     varargs'dan sonra parametre OLAMAZ
     Bu kuraldan oturu bir method'da sadece 1 tane varargs olabilir
         */

    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi,String... kelime) {
        int girilenKelimeAdedi = kelime.length;
        String enUzunKelime = kelime[0]; // Buraya hiçlik de koysak olur
        for (String each : kelime) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
            System.out.println("Girilen " + girilenKelimeAdedi + " kelimeden en uzunu " + enUzunKelime);

        }
    }
}
