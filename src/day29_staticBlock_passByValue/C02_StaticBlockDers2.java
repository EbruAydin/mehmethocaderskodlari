package day29_staticBlock_passByValue;

public class C02_StaticBlockDers2 {

    {
        /*static olmayan blocklar obje olusturulurken calisir.
         asagida main icerisinde objelerini olusturarak calistirdik.

         static olan sadece bir defa calisir ama static olmayan her obje olusturuldugunda
         onun icin calisir.
         */
        System.out.println("static olmayan block calisti");
    }
    static{
        System.out.println("static block calisti.");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBlockDers2 obj1=new C02_StaticBlockDers2();
        C02_StaticBlockDers2 obj2=new C02_StaticBlockDers2();

        /*
        yukarisi once static olan sonrasinda main method sout'u calisacak
        sonrasinda da objelerin getirecegi "static olmayan block calisti" calisacak.
         */
    }
}
