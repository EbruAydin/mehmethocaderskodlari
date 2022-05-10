package day28_constructorCall_staticKeyword;

public class StaticKeyword {

    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        System.out.println("sayi1 : " + sayi1);
       // System.out.println("sayi2 : " +sayi2); static olmadigi icin main method'dan direk kullanilmaz
        // sayi2 kullanilmak istenirse obje olusturmak gerekir

        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2);

        sayi1++;
        obj1.sayi2++;

        System.out.println("sayi1 : " + sayi1);//1
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1 bu sekilde yazabilirsin ama static bir degere obje yazmadan ulasabilirsin.


        StaticKeyword obj2=new StaticKeyword();
        /*
        static degerler objeden bagimsizdir. son hali neyse onu yazdirir
         */
        System.out.println(obj2.sayi2);// sayi2 instance ve obje uzerinden vardir.0'dir yani degeri.
        System.out.println(obj2.sayi1);//1

        //Class'i takip etmek icin en iyi yontem sudur: class var elimizde ve static variable class'a baglidir
        // sayi2 icin class uzerinden bir deger olarak tanimyaiz.
        // java yukardan asagi okur ve bakar mesela obj1.sayi2 yazildigi icin ilk oradan okur ve orada deger 1.



    }
}
