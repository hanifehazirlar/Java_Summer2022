package example;

import java.sql.Date;
import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class C02 {
    /*
    Ali 5 Şubat 2015 TRT 10:00'da İstanbul'da, Mark 5 Şubat 2015 12:00 EST'de ABD'de doğdu. Ali'nin doğum
    saati ile Mark'ın doğum saati arasındaki saat cinsinden fark nedir?
*/
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2015,2,5);
        LocalDate date2=LocalDate.of(2015,2,5);
        Period period1=Period.between(date1, date2); // yil ay gun farki

        LocalTime time1=LocalTime.now(); // suan ki Turkiye saati
        LocalTime  time2=time1.now(ZoneId.of("America/New_York")); // suan ki America/New_York saati

        System.out.println(period1+"  "+(time1.getHour() - time2.minusHours(2).getHour())+" saat "+
                          (time1.getMinute()-time2.getMinute())+" dakikadir");
    }
}
