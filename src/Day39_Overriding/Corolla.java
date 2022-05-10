package Day39_Overriding;

public class Corolla extends Toyota{

    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";

/*
Data turu ve constructor farkli oldugunda constructor calistigi icin
obje Constructor'in oldugu class ozelliklerini tasir.
Ancak dataTuru farkli oldugundan yani dataTuru Parent secildigi icin
variable'lar dataTurunun secildigi class ve onun parenti classlarindan
deger alabilir.

Methodlar icin ise yine dataTurunun oldugu classlara gideriz
ancak direk Methodu calistirmadan once method Override edilmis mi
diye control ederiz. bu durumda direk constructor'a bakariz ve constructor'a gore secim yapariz
 */

    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 litre yakit tuketir");
    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 vitesli arac uretir");
    }

    public static void main(String[] args) {

        //varibale olunca isimiz kolay.
        //diyoruz ki data turum corolla ve sonrasinda variable\lardan baslarim
        //once classima bakarim, yoksa parentima giderim. onda yoksa onun parentina giderim

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//Araba classindan aldik
        System.out.println(arb1.hiz);//kendi classimdan alirim cunku data turum ve
        // constructor'um Corolla() kendi classimda da var
        System.out.println(arb1.yakit);//kendi classimdan alirim
        System.out.println(arb1.marka);//Corolla classindan baslarim marka diye variable
        // yok bu yuzden parenta yani Toyota;da oldugu icin baska yere gitmeye gerek yok
        //oradan alitim
        System.out.println(arb1.sirketMerkezi);//bu classta sirket merkezi yok
        //parent classi olan Toyotaya bakar ve oradan alir.
        System.out.println(arb1.model);//bu class icerisinden bakip alir

        arb1.motor();//Corolla


        Toyota arb2=new Corolla();
        /*
        variable burada degerlendiriliyor. bu yuzden once Toyota classina gideriz
        ondan sonra parenta gideriz
         */

        System.out.println(arb2.hareket);// Toyotada hareket yok, parentta var. Araba
        System.out.println(arb2.hiz);//Toyota icindekinden kullanir. Data turu Toyota ondan.
        System.out.println(arb2.yakit);//Data turu Toyota direk oraya gideriz ama yakit yok. parenta gideriz. Araba
        System.out.println(arb2.marka);//Toyota
        System.out.println(arb2.sirketMerkezi);//Toyota
       // System.out.println(arb2.model);//data turu Toyota model var mi yok
        //parente gider orada da yok. asagi dogru inip bakmaz
        // yukariya dogru gider. HATA VERIR. CTE OLUR

        arb2.motor();//Corolla

        /*
        dataturu toyota oldugu icin once Toyota classina gider, method
        oldugu icin hemen calismayacak. Acaba Constructor olarak kullanilan
        child class icinde motor methodu override edilmis mi diye bakilacak.
        bu durumda Corolla icindeki calismis olacak.
        mevcu child class icerisinde ayni signitura sahip method olmasidir

         */
        arb2.garanti();//
        /*
        Toyota classina gidecek ama method oldugu icin hemen calismayacak
        child classa gidip Corolla classinda garanti() olup olmadigina bakar
        garanti() override edilmedigi icin Toyota'daki calisir
         */

        arb2.yakitTuketimi();//
        /*
        Toyota classinda yakitTuketimi var mi? yok
        sonra parent classina gidecek. yakitTuketimi var parent icerisinde
        yani Araba classinda. tamam diyecek bunu calistiririm ama once acaba child
        classlarda bu ezilmis mi diye control edecek
        Toyota icinde zaten yoktu
        corolla icerisine gelecek; burada yakituketimi
        oldugunu gorunce Corolla icerisindekini calistiracak
         */

       // arb2.vitesSayisi();
        /*
        data turum Toyota. bu nedenle de
        aramaya parent classinda basliyorum. burada vites methodu var mi?
        yok. onun da parentina gidiyoruz, Arabaya yani, orada bulamadik
        bu yuzden calismaz. bu method calismaz cunku override
        edilmemis. geriye gitme mevzusu olmadigi icin burada
        java geriye gelip child class icindekini almaz
        override ile yaptigi geriye gelmek degil
        orada control vardir ve bu kontrolun sonucunda
        ezilmis olan yani class iceirisndeki method daha guclu olacagindan
        onu alir. ama burada parent/toyota ve onun parenti/araba da
        vitesSayisi isimli bir method yok

         */

        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);// Araba
        System.out.println(arb3.hiz);//Araba
        System.out.println(arb3.yakit);//Araba
        System.out.println(arb3.marka);//Araba
       // System.out.println(arb3.sirketMerkezi);//Araba classinda yok, ilerisini de bilmiyoruz CTE
        //System.out.println(arb3.model);//CTE

        arb3.yakitTuketimi();//Corolla
        /*
        dataTuru Araba, arabaya gider java ve bulur. bu duurmda
        kontrol eder java, childlara bakar cunku
        constructor Corolla yani child.
        bu yuzden once Toyotaya bakar, orada method yok,
        Corollaya gelir burada yakitTuketimi
        oldugu icin burada Corolladakini calistirir cunku
        override edilmis
         */

        arb3.motor();//Corolla
        /*
        dataTuru Araba oldugu icin once Arabay'ya gider
        motor() var mi? var. Bulduktan sonra
        override edilmis mi diye control edilecek
        Toyota'da motor() override edilmis ama burada durmuyorum eger
        sadece Toyotadaki override etmis olsaydu Toyota icindeki
        motor() kullanilirdi. ama Corolla icine gelir
        kontrol yapar java ve Corolla icerisinde de motor()
        yazili oldugu icin o da Toyotadakini override
        etmis olacagindan Corolla icindeki motor() yazidirilir.
         */

        //arb3.garanti();
        /*
        aramaya Araba classindan baslariz
        turu Araba/parent cunku
        orada da garanti() olmadigi icin
        CTE olur.
         */

       // arb3.vitesSayisi();
        /*
        once Araba classina gidecek ve orada vitesSayisi() olmadigi
        icin calistirmaz. CT E
         */
    }
}
