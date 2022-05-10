package day27_constructor_constructorCall;

public class Z {

    String isim;
    String soyisim;
    int numara;
    boolean gercekMi;

    public Z(){

    }
    public Z(String ism, String soyism, int no, boolean grc) {
// yukari ile esitle.
        isim=ism;
        soyisim=soyism;
        numara=no;
        gercekMi=grc;

    }//method

    public Z(String isim, String soyisim, int numara) {

        this.isim=isim;
       this. soyisim=soyisim;
       this. numara=numara;

        // simdi bir oncekine bakalim instance olanlar ayni renk,
        //burada soluk bir renk oluyor. Bu kod bir ise yaramiyor
        // belirsizlik durumu var.
        // bunun nedeni her iki deger adlarinin ayni olmasindan kaynakli
        // java bunu anlamsiz olur.
        // bunu benim dokundugum class'taki instance olsun
        // istiyoruz. this.// bunu yazarsak olur. // this. instance
        // isim der digerine de parametre ismi diye bakar java.

        // yukarida bir karisiklik yok cunku iki farkli isimdeki
        // degerler birbirine ataniyor.
        // this. methoduna su zamanda ihtiyac duyulur<parametre olara
        // ayni ismi kullanirsak.

    }

    public String toString(){

        return("Isim : " + isim+ ", Soyisim : " +soyisim +
                ", numara : " + numara);
    }
}
