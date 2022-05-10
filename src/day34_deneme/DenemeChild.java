package day34_deneme;

import day34_accessModifier_encapsulation.C01_Ders;

public class DenemeChild extends C01_Ders {

// biz burada class olusturduk DenemeChild diye
    //yanina extends ekledik ve class ismini ekledik
    // yani hangi classin cocugu yapmak istiyprsak
    // onu ekledik ama hata cikti bu yuzden C01_Ders
    // classinda protected yaparak sorunu cozduk.

    public static void main(String[] args) {

        System.out.println(halkaAcikSayi);
        halkaAcikSayi=20;
        // burada obje olusturulmamasina ragmen
        // parent classtaki halkaAcikSayi\ya direk
        // ulasabiliyoruz
        // deger de atanabiliyruz.

        aileyeOzel=50;
        // child oldugu icin bu class
        // buradan ulasabiliyoruz
        // ama child olmayan class icerisinden buna
        // ulasamayiz.
    }
}
