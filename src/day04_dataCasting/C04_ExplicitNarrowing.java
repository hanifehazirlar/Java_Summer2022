package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=50;
        byte sayi2= (byte) sayi1;

        System.out.println(sayi2); // 50
        /*
        Genis data turundeki degeri, dar data turundeki variable'a atamak isterseniz
        Java sizin genis data turundeki degerin, dar data turunun
        sinirlarina uyup uymayacagini calistirana kadar bilemez
        ama Java Risk almaz
        Riski sifira indirmek icin burada bir sorun olursa sorumlulugu kabul etmenizi bekler
        bunun icin degerin onune parantez icerisinde istedimiz data turunu yazmamiz yeterlidir

        Bu riski ustlendigimizde, 3 durum olusabilir
        1- bizim degerimiz, dar kalip degerlerine uygun olursa hic bir kayip olmadan cast olur
        2- double bir sayiyi int2a cast etmek gibi durumlarda data kaybi yasayabilirsiniz
        3- genis kaliptan degeri dar kaliba koydugunuzda, sinirlari asan durumlarda veri baskalasabilir
         */
        int s1= 125;
        byte s2= (byte) s1;
        System.out.println(s2); // 125
    }
}
