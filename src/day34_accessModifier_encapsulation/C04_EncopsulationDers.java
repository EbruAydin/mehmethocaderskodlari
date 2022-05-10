package day34_accessModifier_encapsulation;

public class C04_EncopsulationDers {

    public static void main(String[] args) {
        /*
        bir variable'i encapcule etmek icin
        1-access modifier'i private
        2-okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
         - eger sadece okunmasini istiyorsak getter
         - sadece deger girilebilsin istiryosak setter
         methodlarini olustutururuz.

         Bir variable icin hem getter hem setter olusturursaniz
         o variable public olmus gibi hem okuyup hem de yazilmasini
         saglayabilirsiniz.


         */

        C03_Ders obj=new C03_Ders();

        System.out.println(obj.getSayi());//0

        obj.setStr("Java Java Java");// bu sekilde yazdirilmiyor
        System.out.println(obj.getStr());// get ile yazdirilir.
        //Java Java Java

        System.out.println(obj);
        // toString methodu olusturudk
        // generate ile
        // dogrudan objeyi okutmak mumkun oluyor boylece
        // sout yapinca obj objesini onun bilgilerini
        // sayi=0, str='Java Java Java verir.
    }
}
