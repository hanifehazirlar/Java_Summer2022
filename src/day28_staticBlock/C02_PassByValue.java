package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;
        System.out.println(indirimliFiyat(satisFiyati)); // 90.0
        System.out.println(satisFiyati); // 100.0 method dan sonra original deger degismedi
        System.out.println(indirimliFiyat(satisFiyati)); // 90.0

        // iki farkli method'da satisFiyati isminde variable olabilir
        // Java buna itiraz etmez cunku, scope'lari farklidir.
    }
    public static double indirimliFiyat(double orjinalFiyat){

        // methodumuz %10 indirim yapip
        // yeni fiyati main method'a dondursun

        double satisFiyati=orjinalFiyat*0.9;
        return satisFiyati;
    }
}
