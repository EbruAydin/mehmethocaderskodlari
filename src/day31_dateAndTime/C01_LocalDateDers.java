package day31_dateAndTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDateDers {

    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();// objenin olusturuldugu tarihi trh'ye atar.
        LocalDate baskatrh=LocalDate.of(1972, 01,18);
        System.out.println(trh);// objenin olusturma taihini alir. O yuzden bugun yaptik ve
                                    // 2022-03-31 yazdi.
        System.out.println(trh.getDayOfMonth());//31
        System.out.println(trh.getDayOfWeek());//THURSDAY
        System.out.println(trh.getMonthValue());//3

        // bir tarihten istedigimiz kadar ileriye ve geriye gidebiliriz

        System.out.println(trh.minusWeeks(20));// 2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3));//2022-02-21
        // ileri gitmek icin plus 9 ay 10 gun sonra demek
        System.out.println(trh.plusMonths(9).plusDays(10));//2023-01-10

        // istedigimiz ulkenin o andaki tarihini elde etmek istersek

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-04-01

        //is ile baslayan methodlar boolean sonuclar dondurur.
        System.out.println(LocalDate.now().isLeapYear());//false, artik yil demektir.

        System.out.println(trh.isAfter(baskatrh));//true yani diyor ki bugunun tarihi benim yazdigim
                        // tarihten sonra mi diye sorarsak ona gore true verir ya da false
        // bu da iki dogum tarihini kiyaslamak icin yapariz. if ile yapardik vs ama gerek yok
        // uzatmaya bu sekilde isBefore ya da isAfter kullanarak yapabiliriz.
    }
}
