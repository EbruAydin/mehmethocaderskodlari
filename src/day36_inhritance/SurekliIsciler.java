package day36_inhritance;

public class SurekliIsciler extends Isci{


    public static void main(String[] args) {
        SurekliIsciler surIci=new SurekliIsciler();

        surIci.persNo=5001;
        surIci.isim="Cem";
        surIci.soyisim="Akay";
        surIci.statu="Isci";
        surIci.saatUcreti=11;
        surIci.maas=surIci.maasHesapla();

    }

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
