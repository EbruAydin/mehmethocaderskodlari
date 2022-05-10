package day36_inhritance;

public class Parent {

    protected Parent (){
        System.out.println("Parent constructor calisti");
    }

    protected Parent(int sayi3, int sayi4){// protected olmaz ise
        //super(sayi1,sayi2) calismaz. bu yuzden default olmaktan cikardik
        System.out.println("parent 2 parametreli cons.");
    }
    protected int sayi;

}
