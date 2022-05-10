package day35_encapsulation_inheritance;

public class Child01 extends parent{// extends ve class ismi yani parent yazarak
    // child class haline getirebilirz
    public static void main(String[] args) {

        /*
        Child class hicbir objeye ihtiyac duymadan
        parent classtaki variable ve methodlara
        ulasabilir.
         */
        /*
        eger bi classta extends kelimesi varsa isler
        daha komplikedir. eger extends varsa, artik parent classa
        gidip check etmek lazim.
         */

        System.out.println(isim);
        System.out.println(fabrika);// protected olsa bile parent icerisinde
        // child protected olana ulasabilridi

        method1();// dogrudan cagirabiliriz
        method2();






    }

}

