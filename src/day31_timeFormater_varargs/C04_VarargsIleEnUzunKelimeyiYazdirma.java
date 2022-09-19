package day31_timeFormater_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir("Ali","Ismail","Hanife");


    }
    public static void enUzunKelimeyiYazdir(String...kelime) {
       int girilenKelimeAdedi=kelime.length;
        String enUzunKelime="";
        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }else if (each.length()==enUzunKelime.length()){
                enUzunKelime+=" "+each;
            }
        }
        System.out.println("Girilen " + girilenKelimeAdedi+" kelimeden en uzunu "+enUzunKelime);

    }
}
