package Day39_Overriding;

public class OverridingChild extends OverridingParent{

    public void method1() {
        System.out.println("Child class method1");
    }

    /*
    methodlar static iken direk cagirabiliyorduk methodu method1() diyerek falan
    static olmaktan cikarinca main static oldugu icin obje olusturarak cagirabiliriz
     */
/*
bir classta ayni isimde iki method olusturamazken
child ve parent icerisinde ayni olan iki method
yapabiliriz.Parent icerisindeki Override eder, yani etkisiz hale getirir.
Kendi classindakini kullanir child. Parenttaki method1'i kullanmak yerine
kendi classinda ozellestirir child class. boylece kendi method1ini kullanir.
 */

    public static void main(String[] args) {

        OverridingChild obj1=new OverridingChild();
        obj1.method1();//burada kendi classindakini calistirir
        obj1.method2();//method2 burada olmadigi icin parent classa gidip oradan cagiracak.

        OverridingParent obj2=new OverridingChild();
        obj2.method2();//data turu parent oldugu icin, parent classa giderim ve orasi method()2 oldugu icin orasi calisir
        //method()2 override edilmemisti
        obj2.method1();//dataTuru parent oldugu icin java oncelikle parentclass'a gidecek, parent class'ta method1() var
        //ama biz biliyoruz ki bu method override edildi, aynisi child icerisinde oldugu icin etkisiz hale getirildi.
        //java bu durumu bildigi icin, contructor da child class'tan oldugu icin burada //child class method1 yazidirir.

        OverridingParent obj3=new OverridingParent();//dataturu ve constructor Parent
        obj3.method1();
        obj3.method2();
        /*
        dataturu parent oldugu icin parenta gidecek, method1 var mi? var. constructor da parent oldugu icin
        parent classindakileri kullanmis olur. Overriding olmaz burada, parent icerisindeki method1 ve method2
        kullanilir.

        constructor'i parent classtan secmek ile childdan secmek fark ettirir.
        constructor'i child classtan ise dataTurune yani parenta gidir, methodu bulur
        ama child'a gidip methodun override edilip edilmedigine bakar ona gore yazdirir.
        ikinci obje bunun ornegidir.
         */

    }
}
