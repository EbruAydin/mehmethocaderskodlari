package day27_constructor_constructorCall;

public class Volvo {
    //BU CLASSI HIC CALISTIRMADIGIMIZ ICIN
    // BUNA IHTIYACIMIZ OLMADIGI ICIN MAIN YAZMADIK
    // BURASI DEPO GIBI
    // GEREK YOK MAIN YAZMAYA KULLANMADIGIMIZ ICIN!

    String marka = "Volvo";
    String model ="";
    String mensei="Isvec";
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot = otomatikPilotSorgusu();
    int maxHiz = maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        //buradaki parametereler yukaridakileri esitlemek lazim
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;

    }

    //simdi bu yukarida yaptik hata cikti. bunu gidermek icin parametresiz
    //constructor yazariz.

    public Volvo(){

    }

    // bu methodlari yazarak farkli ozellikleri
    // icice gecirmis olduk.
    // bir yontem yani farkli bicimlerde yazma sekli.


    public int maxHizAta() {

        int maxHiz = 0;
        if (elektrikliMi) {
            maxHiz = 160;
        } else {
            maxHiz = 240;
        }
        return maxHiz;
    }


    public boolean otomatikPilotSorgusu() {

        boolean sonuc = false;
        if (elektrikliMi) {
            sonuc = true;
        }
        return sonuc;

    }//method

    //toString methodu ile standard ozellikler olusturuz

    public String toString() {

        String arabaOzellikleri = "Model : " + model+
                                  " Yakit : " + yakit+
                                   " Max Hiz :" +maxHiz+
        "yil : " +yil;

        return arabaOzellikleri;

    }



}//main
