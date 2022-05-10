package day27_constructor_constructorCall;

public class VolvoRunner {

    public static void main(String[] args) {

        Volvo arb1=new Volvo();
        System.out.println(arb1.marka);//Volvo
        arb1.yakit="Dizel";
        arb1.elektrikliMi=false;// hem dizel hem elektrikli olmaz
        System.out.println(arb1.maxHiz);
        // java diger yere gidecek. maxHiz'i bulacak
        // method oldugu icin method bolumune gececek
        // orada elektrikliMi false oldugu icin, else
        // devreye girecek ve boylece 240 sonucu olacak.


        System.out.println(arb1.toString());//Model :null Yakit : Dizel Max Hiz :240

        Volvo arb2=new Volvo();
        arb2.yakit="Elektrikli";
        arb2.elektrikliMi=true;
        arb2.model="XC98";

        System.out.println(arb2);
    }

}
