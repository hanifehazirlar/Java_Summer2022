package day31_timeFormater_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih :" + tarihSaat);
        // ilk olusturulan tarih :2022-07-25T21:41:49.653048700

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("d/M/yy hh:mm a");
        System.out.println(dtf1.format(tarihSaat));// 25/7/22 09:45 ÖS

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm a");
        System.out.println(dtf2.format(tarihSaat));// 25/07/22 11:23 ÖS

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm a");
        System.out.println(dtf3.format(tarihSaat)); //25/Tem/2022 21:47 ÖS

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm a");
        System.out.println(dtf4.format(tarihSaat)); // 25/Temmuz/2022 23:24 ÖS
    }
}
