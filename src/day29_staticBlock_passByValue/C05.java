package day29_staticBlock_passByValue;

public class C05 {

    public static void eksiltme(){

        C03.sayi--;
        System.out.println("C05;te sayi " + C03.sayi);
        C03.artirma();

        /*
        once C03'e gidip sayiyi 1 ekiltecek, ve sonrasinda
        yazdiracak. Buradan C05'teki sayi 4 yazdiracak.
        Sonrasinda C03teki artirma metodu calisacak.
        bu da sayiyi 1 artiracak ve 5 yazdiracak.
        C03'te sayi 5 diyecek.
        sonra geri gelecek C04 icersine
        bir artirma olacak C05 sayi 4 olacak
        C03 sayi 5
        C05 sayi 4
        C03 sayi 5
        en sonda da 5  yazdiracak.

        OUTPUT
        C05;te sayi 4
        sayinin C03'deki degeri 5
        C05;te sayi 4
        sayinin C03'deki degeri 5
        C05;te sayi 4
        sayinin C03'deki degeri 5
        5

         */
    }
}
