package day27_constructor_constructorCall;

public class VolvoRunner2 {

    public static void main(String[] args) {

        // Her obje olusturdugumuzda model, yakit gibi degerleri
        //tek tek atama yapmak istemiyorsaniz

        Volvo arb1=new Volvo("XC60", false, 2023, "Benzin");
        arb1.model="TBT";
        // kirmizi veriyor parantez icine yazinca, orada create constructor
        // cikacak ona tikla.
        System.out.println(arb1);// Model : XC60 Yakit : Benzin Max Hiz :240
        // tek satirda ozellikler gelmis oldu.
        //ADINI toString YAZINCA METHODUN sout icerisine arb1.toString yazmaya
        // gerek yok. Dogrudan arb1 yazarsak yazdirir. AMA ADI toString oldugu icin.

    }
}
