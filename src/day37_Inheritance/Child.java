package day37_Inheritance;

import day36_inhritance.Parent;

public class Child extends Parent {

    Child(){
        super();
        System.out.println("parametresiz constructor");
        /*
        buradan Parent'a (dau36 icinde) ulasmaya calisiyoruz
        ama onun access modifier'i default
        bu nedenle buradan bulasmak icin protected
        ya da public yapmam lazim.

        Sonuc olarak bir class'i child class yaptigimizda
        parent class'daki constructor'a ulasmasi gerekir
        bu durumda parent class'daki constructor'in access modifiersi
        uygun olmali. Ayni packcge icinde ise
        default olabilir ama baska package icerisinde ise
        protected ya da public olmasi lazim.


         */
    }

    Child(int s){//burada da super() cons. vardir.
        /*
        tum child class'ta tum constructorlarin ilk satirina
        Java'nin yerlestirdigi constructor PARAMETRESIZ'dir
        yani super()dir.
         */
        System.out.println("Child class parametreli cons.");
    }

    Child(int sayi1, int sayi2){
        super(sayi1,sayi2); // bunu yapmaz isek
        // super() default olan devreye girer.
        System.out.println("Child iki parametreli constructor");
    }

    public static void main(String[] args) {
        Child child=new Child(5, 8);

    }
}
/*
eger parent class'tan parametresiz cons. degil de baska bir
const. calistirmak istersek bunu child class'taki cons'un
ILK SATIRINA YAZMALIYIZ.Yukarida CHild(sayi1, sayi2) yaptigim yani
kodu calistirinca Parent'a gider onun sout'unu yazdirir
sonra geri gelir kendi soutunu yazdirir.
 */
