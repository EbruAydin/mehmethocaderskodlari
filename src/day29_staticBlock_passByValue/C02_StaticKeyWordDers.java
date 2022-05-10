package day29_staticBlock_passByValue;

public class C02_StaticKeyWordDers {
    public static void main(String[] args) {

        //baska classtaki static  class uyelerine
        // ulasmak icin sadece classIsmi.staticUyeIsmi
        //yazmamiz yeterlidir.

        System.out.println(C01_StaticDers.okulTel);//eski olani yazdirir

        C01_StaticDers.okulTel="34567901";

        System.out.println(C01_StaticDers.okulTel);//yeni olani yazar

        //baska class'taki static olmayan, ancak o class'tan obje olusturarak
        //ulasabiliriz. ve obje ile yapilan atamalar, objeyi baglar bu degisim.


        C01_StaticDers obj1=new C01_StaticDers();
        C01_StaticDers obj2=new C01_StaticDers();

        System.out.println(obj2.okulIsmi);//Yildiz Koleji
        obj2.okulIsmi="Sabir Koleji";
        System.out.println(obj1.okulIsmi);//Yildiz Koleji


    }
}
