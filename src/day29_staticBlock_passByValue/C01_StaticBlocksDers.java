package day29_staticBlock_passByValue;

public class C01_StaticBlocksDers {

    static{

        System.out.println("static block calisti");
    }


    C01_StaticBlocksDers(){// bunun calismasi icin C01_StaticBlocksDers obj1 olusturuldu.
        System.out.println("Constructor calisti.");
    }

    public static void main(String[] args) {

        System.out.println("main method baslangici");

        C01_StaticBlocksDers obj1;
        new C01_StaticBlocksDers();// atama olmadigi icin calismaz.

        /*
        static blok ilk once calisir. her seyden once static block calisir.
        sonrasinda main method calisir.
        en son constructor.

        static pre-conditiondir yani main method calismadan once hazirlik yapmak demektir.
        main method olmasa, silsen bu class calismaz. bu classin calismasi icin
        main methoda ihtiyac var. ama devrerye girse bile static olunca da
        once static calisir.
         */
    }
}
