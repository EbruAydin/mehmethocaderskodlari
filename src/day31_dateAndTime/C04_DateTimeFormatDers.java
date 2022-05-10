package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatDers {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat);// 2022-03-31T21:40:24.338848

        // burada tarihe belli bir format olusturduk
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/M/YYYY");

        // yukaridaki iki objeyi tarihSaat ve formatter'i birlestirmek istiyoruz.
        System.out.println(formatter.format(tarihSaat));//31/3/2022 bu sekilde tarih elde etmis olduk.


        // zaman icin formatter yapmak istersek yeni format olustrumak gerekir
        DateTimeFormatter formatterSaat= DateTimeFormatter.ofPattern("hh : mm: ss a");
        System.out.println(formatterSaat.format(tarihSaat)); // 09 : 56: 12 PM


        /*
		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini


		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 hh: 12 saat dilimine gore 2 rakam olarak

		 m: minute
		 mm: tek rakamlari 08 gibi


		 a yazarsak AM veya PM degerini yazar


		 */
    }
}
