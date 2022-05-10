package day32_varargs_stringBuilder;

public class C04_StringBuilderDers2 {
    public static void main(String[] args) {

        StringBuilder sbr1 = new StringBuilder("Yasasin Java");

        System.out.println(sbr1.indexOf("Java"));//8 yani 8.inden itibaren Java

        System.out.println(sbr1.lastIndexOf("s"));//4
        System.out.println(sbr1.indexOf("s"));//2


        System.out.println(sbr1.replace(0, 7, "Ne guzel"));//Ne guzel Java

        System.out.println(sbr1);// Ne guzel Java cunku builder mutable yani atanabiliyor. String olsaydi olmazdi.

        System.out.println(sbr1.toString().toUpperCase());//burada toString() dedikten sonra . yapinca String icin olan methodlar da kullanilir

        // NE GUZEL JAVA
        System.out.println(sbr1);// Ne guzel Java
        /*
        burada yukarida toString dedigimiz andan itibaren sbr1 immutable olmus oldu
        bu durumda yukarida UpperCase devreye girdi ama kalici degil, gecisi
        bu baglamda sbr1 yeniden yazilinca kucuk haliyle yazar.
         */

        System.out.println(sbr1.delete(0, 3));//guzel Java yazar ayni 0'dan 3 indexine (3 dahil degil) kadar olan ksimi silmis olur

        System.out.println(sbr1.deleteCharAt(5));// sadece bu indexteki harfi/boslugu silmis olur
    }
}
