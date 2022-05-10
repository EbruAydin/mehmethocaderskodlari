package day32_varargs_stringBuilder;

public class C06_StringBuilderDers4 {
    public static void main(String[] args) {

        StringBuilder sbr1 = new StringBuilder("Prize dikkat");

        System.out.println(sbr1.insert(12," edin"));// bla bla indexinden sonra ekleme yapar.
                                                        // Prize dikkat edin.

        String str="Hayatta cok guzel seyler var."; // bu string'den bir parca alip sbr1'e eklemek icin asagidakini yap
        System.out.println(sbr1.insert(0,str,0,8));//Hayatta Prize dikkat edin

        System.out.println(sbr1.reverse());// nide takkid ezirP attayaH

        System.out.println(sbr1.reverse());//

        // builder'a substring uygulanabiliyor
        System.out.println(sbr1.substring(3, 5));//at
        System.out.println(sbr1);//Hayatta Prize dikkat edin
        // string'den geldigi icin degistirmez.

        System.out.println(sbr1.subSequence(3,5));//at
        System.out.println(sbr1);//Hayatta Prize dikkat edin

       //
        StringBuilder sb = new StringBuilder(5 + 7 + "Java" + 4 + 5);

        System.out.println(sb);//12Java45

        String isim="Mesut";
        sb.append(isim, 2, 4);
        System.out.println(sb);//12Java45su

        sb.delete(4, 6);
        System.out.println(sb);//12Ja45su

        //

        StringBuilder sb2 = new StringBuilder("OCAJP8");

        sb2.subSequence(2, 4);
        System.out.println(sb2);//OCAJP8

        sb2.deleteCharAt(3);
        System.out.println(sb2);//OCAP8

        sb2.reverse( );
        System.out.println(sb2);
    }
}
