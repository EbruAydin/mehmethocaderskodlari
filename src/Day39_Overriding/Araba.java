package Day39_Overriding;

public class Araba {
// ayni package icinde protected demeye gerek yok normalde ama hoca yine de yazdi
    protected String hareket="Arabalar Teker ile hareket eder";
    protected String hiz="Arabalar motor gucune gore hareket ederler";
    protected String yakit="Arabalar farkli yakitlar kullanabilirler";
    protected String marka="Arabalar uretildikleri markaya sahiptir";


    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }
}
