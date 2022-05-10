package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1972, 01,18);

        System.out.println(Period.between(dogumGunu,bugun));// P50Y2M13D yani 50 yil 2 ay 13 gun yasindasin demek
        System.out.println(Period.between(dogumGunu,bugun).getYears());//50 yil yasamissin demektir



    }
}
