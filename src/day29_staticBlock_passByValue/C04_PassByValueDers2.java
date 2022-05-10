package day29_staticBlock_passByValue;

public class C04_PassByValueDers2 {

    /*
    eger bir methodda yapilan degisikliklerin kalici olmasinin istiyorsak
    iki yontem kullanabiliriz.
    1-variable' class levelde static olarak olusturabiliriz.
     */

    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {

        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=5;
        kaliciIndirimYap();
    }

    public static void kaliciIndirimYap(){

        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : " + etiketFiyati);

    }
}
