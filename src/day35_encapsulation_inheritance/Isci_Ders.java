package day35_encapsulation_inheritance;

public class Isci_Ders extends Personel_Ders {
    public static void main(String[] args) {


        Personel_Ders objPers=new Personel_Ders();
        objPers.isim="Eren";
        objPers.soyisim="bla bla";
        objPers.adres="Sweden";

        // buraya kadar isci olusturmakdik
        // buraya kadar sadece personel olusturmus olduk
        // burada isci olusturmak icin isci constructorinin
        // isci kalibini kullanmak lazim.

        //isci olusturmak icin inheretance devreye girer

        Isci objIsci=new Isci();
        objIsci.isim="Eren";//
        objIsci.soyisim="Yasam";
        //objIsci.adres="ankara"; anlamadim neden hata verdi
        // memur child icinde sorun olmadi

        // hoca ilkini public, digerlerini protected yapti
        // ve o sekilde de ulasimi sagladi.
        // bu sekilde yapmak istemesinin nedeni
        // baska packagelarda kullanmak istememizin de nedeni
        // default haliyle yani access modifier olmadan da
        // kullanilirdi, ama yani class icindeler
        // ileriye yonelik public ya da protected seklinde
        // atama yapmak onemlidir.

    }

}
