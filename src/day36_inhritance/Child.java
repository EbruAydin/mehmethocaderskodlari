package day36_inhritance;

public class Child extends Parent{

    /*
extends olmasayid, child icindeki constructor
oncelikle yazilirdi. ama extends olunca bizim objemz
child classinda olsa da parent classin butun ozelliklerine
sahip. dolayisiyla arka planda parent classin tum ozelligine
sahip olmasi icin parent icindeki constructorun da
calismasi lasim/ ama NASIL?
     */
    /*
    tum claslarda biz gormesek bile javanin olusturdugu
    default constructor var.

    Extends keyword kullanan classlardaki
     tum constructorlarin ilk satirinda biz gormsesek
    bile super() constructor call vardir. burada
    super classi parent ile ayni, bu durumda
    yani parent classin parametnresiz constroctor
    calli olmus oldu.
     */

    /*
    bir constructor icinde birden fazla constructor call
    olamazdi. constructor call yazmak ciin ilk satira
    yazmamiz lazim. ilk satira this() yazarsak super olmus
    olur.
     */
    Child(){
        //super();
        System.out.println("Child Con. calisti");
    }


    public static void main(String[] args) {

        Child child=new Child();
    }
}
