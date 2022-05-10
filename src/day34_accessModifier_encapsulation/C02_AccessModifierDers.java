package day34_accessModifier_encapsulation;

public class C02_AccessModifierDers {

    public static void main(String[] args) {

        C01_Ders obj=new C01_Ders();

        obj.acikString="Bye";
        C01_Ders.acikSayi=50;

        //C01_Ders.sayi=15; burada hata verir cunku C01_Ders
        // classing bu private, static olsa da erisilemez.

        //obj.method1;

        C01_Ders objParametreli=new C01_Ders(5);

        /*
        sonuc olarak access modifier private oldugu surece
        kendi clasinizin disindan ulasamazsiniz.

        constructor basina private koyarsak baska classtan cagirip
        kullanamayiz.
         */
    }
}
