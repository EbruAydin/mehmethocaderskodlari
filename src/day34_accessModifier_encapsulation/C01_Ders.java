package day34_accessModifier_encapsulation;

public class C01_Ders {

    private static int sayi=10;
    private static String str="Java";

    static int acikSayi=20;//access modifier default access modifier
    String acikString="hi";//access modifier default access modifier

    public static int halkaAcikSayi=15;

    protected static int aileyeOzel=40;


    protected C01_Ders(){//access modifier default access modifier
        // dolayisiyla icinde oldugumuz paketin disinda
        //bu class'dan obje olusturulamaz. ulasmak istiyorsak
        // public yapmaliyiz
    }

    C01_Ders(int numara){//access modifier default access modifier

        System.out.println("Parametreli constructor calisti");
    }
    private void method1(){

    }
}
