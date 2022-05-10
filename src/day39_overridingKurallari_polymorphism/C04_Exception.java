package day39_overridingKurallari_polymorphism;

public class C04_Exception {

    //String olarak verilan bir sayiyi, int'e cevirip
    //2 katini ekrana yazdiralim.

    public static void main(String[] args) {
        String str="12345a";//a sonradan eklendi
        //int sayi=Integer.parseInt(str);
        //System.out.println("girilen sayinin 2 kati : " + 2*sayi);//24690

        /*
        Exception in thread "main" java.lang.NumberFormatException: For input string: "12345a"
	at day39_overridingKurallari_polymorphism.C04_Exception.main(C04_Exception.java:10)
	diyor ki numberformatexception var yani a yi demek istiyor. hata da 10.satirda diyor
         */

        // try yazip sonrasinda ctrl Alt T diyoruz ve 6.siradaki try/catch aliyoruz

        try {
            int sayi=Integer.parseInt(str);
            System.out.println("girilen sayinin 2 kati : " + 2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("girdiniz string sayi olmayan elemanlar iceriyor");
        }

        //try diyor ki bunu yapmaya calis, catch sirasinda diyor ki eger exceotion ile karsilasirsan
    }
}
