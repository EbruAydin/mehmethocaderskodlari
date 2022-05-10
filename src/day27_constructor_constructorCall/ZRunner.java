package day27_constructor_constructorCall;

public class ZRunner {
    public static void main(String[] args) {
        

        Z obj1=new Z("Emre", "Gulser", 44, true);

        System.out.println(obj1);//Isim : Emre, Soyisim : Gulser, numara : 44

        Z obj2=new Z("Enre", "Dh", 55);
                // yukarida 4 argument varken
        // burada 3 tane var bu yuzden yeni bir constructor istiyoruz
        // parametreleri sirasiyla yani isim, soyisim ve numara
        // seklidne yazmak lazim. sirasi karisinca hata veriyor.
        // otomatikmen yapmaman gerektigini soyluyor
        // this. uygulamasindan sonra sout yaptik
        System.out.println(obj2);//Isim : Enre, Soyisim : Dh, numara : 55




    }//main
}
