package day32_varargs_stringBuilder;

public class C05_StringBuilderDers3 {
    public static void main(String[] args) {

        /*
        compare iki string builder'i ilk harften baslayarak tum karakterleri karsilastirir.
        ayni olan karakterler icin bir sey yazdirmaz..
        farkli olan ilk karakter icin ASCII tablosuna gore kac deger geride veya ileride oldugunu
        yazdirir.
        tamamen ayni ise yazdiklarimiz, bize 0 doner.

        bir String Builder ile bir String'i compare etmek istersek java CTE verir.
         */

        StringBuilder sbr1 = new StringBuilder("Ali Can");
        StringBuilder sbr2 = new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sbr1.compareTo(sbr2));//0

       // System.out.println(sbr1.compareTo(str)); string oldugu icin str kabul etmiyor

        System.out.println(sbr1.equals(sbr2));//false cunku farkli iki obje kiyas ediliyor.
        // ama string olarak kiyas yapsakdik, true verirdi. burdaki bir anlamda anlamsiz
        // bir equals.
        System.out.println(sbr1.equals(sbr1));// ancak kendisine esit mi diye sorarsak true gelir.

        System.out.println(sbr1.equals(str));//false

        // if (sbr1==str); farkli obje turleri oldugu icin java kiyas yapmaz.
        //if(sbr1.equals(str)); itiraz etmez ama false verir.




    }
}
