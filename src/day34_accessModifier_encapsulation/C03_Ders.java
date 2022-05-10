package day34_accessModifier_encapsulation;

public class C03_Ders {

    //encapsule edecegimiz iki variable olsun

    private int sayi;
    private String str;

    // code-generate ve cikan variable'i sec boylece
    // encapsulation olusturulmus olur.

    /*
    getter ve setter birlestiginde public gibi oluyor
    genelde ya getter ya da setter kullaniliyor.

    setter deger girmeyi saglayip sonucu gostermez
    getter ile de degistirilemez degerleri sadece gorurler

     */

    public int getSayi() {// bu get ile okunur ama atama vs
        // yapilamaz.
        return sayi;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                ", str='" + str ;
    }
}
