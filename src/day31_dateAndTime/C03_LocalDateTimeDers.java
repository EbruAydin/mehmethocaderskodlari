package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTimeDers {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat);//2022-03-31T21:36:00.299498200

        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        //2025-06-11T02:42:51.226575400
    }
}
