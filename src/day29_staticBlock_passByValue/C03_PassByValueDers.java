package day29_staticBlock_passByValue;

public class C03_PassByValueDers {

    /*
    java pass by value bir programa dilidir. yani primitive variable methoda gotururken
    degerini alir goturur.
     */
    public static void main(String[] args) {

        double etiketFiyati=100;

        yuzdeOnIndirimYap(etiketFiyati);//90.0
        yuzdeOnIndirimYap(etiketFiyati);//90/0
        System.out.println("iki indirimden sonra main methodda etiket fiyati : " + etiketFiyati);//100.0

    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {
        /*
        java yukaridan etiketFiyatini buraya getirirken orjinal variable'i degil
        value'yu yani 100'u getirir. bu nedenle double etiketFiyati yerine
        istedigimiz ismi verebiliriz. mesela double bx deriz ve bunun icerisinde
        asagida bx diye degistirirz digerlerini de.

        bir methoda argument olarak variable goturdugumuzde value goturur. method icerisinde
        deger kullanilir local duzeyde ama main icerisinde deger degismez.
         */

        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin yuzde 10 indirimli fiyatimiz : " + etiketFiyati);
    }
}
