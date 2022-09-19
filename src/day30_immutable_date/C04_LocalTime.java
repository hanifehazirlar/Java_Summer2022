package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1= LocalTime.now();
        System.out.println(time1);// 19:12:05.778104


        /*
        Bizim olusturdugumuz date ve time
        canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satirda
         oanki tarih veya saati alip bizim variable'imiza store eder.
         time1 variable'ina degeri SABITTIR
         */
        Thread.sleep(3000);// bu method bizim kodlarimizi bekletir,uyutur

        time1=LocalTime.now();
        System.out.println(time1);// 19:12:05.778104

        System.out.println(time1.getSecond()); // 17


        System.out.println(time1.plusSeconds(10000)); // 22:20:57.252652700
        System.out.println(time1.minusMinutes(200)); //  16:14:17.252652700

        System.out.println(time1.withHour(3)); // zamanin saat kismini 3 yapti    03:37:27.667603800

    }
}
