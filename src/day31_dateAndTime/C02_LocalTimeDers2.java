package day31_dateAndTime;

import java.time.LocalTime;

public class C02_LocalTimeDers2 {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);//21:13:12.113581900

        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;
        }
        System.out.println(tm);//21:13:12.113581900

        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);//

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1) + " nano saniyede bitti"); //islem 1.09927E7 nano saniyede bitti

        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));// 14:00:13.299841600 yani 1000 dk sonra saat 14.00 bla bla olacak

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz


    }
}
