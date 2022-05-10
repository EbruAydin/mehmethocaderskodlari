package day27_constructor_constructorCall;


public class ToyotaRunner {
    public static void main(String[] args) {

        // diger class'ta constructor yok ama biz burada obje olusturabiliriz yine de
        // cunku parametresiz constructor var mi diye kontrol edecek, hic constructor olmadigi icin
        // deger atamasi yapmadan ne ise onu getirecek.

        Toyota t1=new Toyota();
        System.out.println(t1.marka);
        System.out.println(t1.tekerAdedi);
        System.out.println(t1.model);
        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yil=2022;
        t1.maxHiz();//Toyota classinda olusturdugumuz bu methodu burada kullanabiliriz.

        // bunu yazdirmak icin uzun yol olarak su sekilde yazalim. KISA YOL VAR SONRA OGRENCEGIZ/

        System.out.println("T1 model " +t1.model + ", yakit: " + t1.yakit+ ", yil : " + t1.yil);

    // baska bir Toyota arac da uretebiliriz. Mesela

        Toyota t2=new Toyota();
        System.out.println(t2.model); // yukaridaki model'i almaz. instance objeler bunlar.
                                        // herkes icin unique ozellikler gelir. ve icindeki objeyi bagla.
                                // t1in degeri ile ilgilenmez. gider defalut'a ve bakar. atama yok orada bu durumda
        //da null yazdirir. cunku orada da bir deger verilmemistir. Ora dedim Toyota class'idir.

        // burada yeniden atama yapmak gerekir.

        t2.model="Yaris";
        t2.yakit="Benzin";
        t2.yil=2021;
        System.out.println("T2 model " +t2.model + ", yakit: " + t2.yakit+ ", yil : " + t2.yil);

        t2.renkTercihleri();

    }
}
