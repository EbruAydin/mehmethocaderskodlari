package day31_dateAndTime;

public class C06_VarargsDers {
    public static void main(String[] args) {

        // verilen iki sayiyi toplayan method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        // bir de 3 sayiyi toplayan method olusturalim

        toplaGel(sayi1,sayi2);
        toplaGel(sayi1,sayi2,sayi3);
        toplaGel(sayi1,sayi2,sayi3, sayi4);
    }

    private static void toplaGel(int sayi1, int sayi2) {

        System.out.println(sayi1+sayi2);
    }


    private static void toplaGel(int... sayi) {// bu oldugu surece yukarida sayilari artirabiliriz
        // buna varags denir ve array alt yapisini kullanir bu nedele de arraydir.

        //toplamayi da for each ile yapabiliriz. sout icerisinde toplama yapmiyor.

        int toplam=0;
        for (int each:sayi
             ) {
            toplam+=each;
        }

        System.out.println(toplam);
        /*
        30 60 100 seklinde yukaridaki sayilari tek tek toplamis oldu.
         */
    }
    
   // private static void toplaGel(int sayi1, int sayi2, int sayi3) {
    // System.out.println(sayi1+sayi2);
    //yukarida toplaGel 3 parametreli yazdigimizda
        // hata vermisti. biz de psvm toplaGel metodunu aldik buraya copy ettik ve sonrasinda icerisine
        // int sayi 3 ekleyince calisti. overloading yapmis olduk.
        // ama java diyor ki bununla tek tek ugrasip yazma, varargs yap
        // kirmizi gosteriyor onun uzerine gelince varargs cikacak, onu tiklayinca
        // oluyor.

        


    }

