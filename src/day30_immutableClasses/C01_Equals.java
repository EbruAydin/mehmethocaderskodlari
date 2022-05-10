package day30_immutableClasses;

public class C01_Equals {
    public static void main(String[] args) {

        String str1="Eren";
        String str2="Eren";

        String str3= new String("Eren");
        String str4=str1+"";

        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// true
        System.out.println(str1.equals(str4));// true

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false

        /*

         */
// eger yeni bir obje olusturma veya bir islem yapma yoksa (asagidaki str1+)
        // java string havuzu kontrol eder. yani daha onceden olusturdugum Eren isimli bir
        // obje varsa buradaki str1 ve str2 gibi, Eren olarak hicbir islem yapilmamis oldugu icin
        // java heap memory icerisinde referencelari, objeleri ve degerleri ayni olmus olur.

        /*
        double equal sign hem degere hem reference bakar. burada str1 ve str2de degerler, obje ve reference aynidir
        bu yuzden true. ama digerlerinde durum farkli. javada sol taraf variable sag taraf degerdir.
        java once sagi yani degeri kontrol eder. burada str3=new kisminda saga bakinca yeni bir obje
        olusturulmus oldugunu gorur java. degere bakmaksizin heap icerisinde yeni obje ve yeni reference olusturur.
        str4 icerisinde de bir islem var. burada da saga bakar ve islem oldugunu gorunce
        digerlerinin yanina koyamaz, bir islem yapildigini gorur. bu ornekre +/yani concatination gorur
        java, hicligi bu adimda dikkate almaz. der ki concatination var bu durumda bu yeni bir obje.
        gider  heap icerisnde bunun icin de yeni obje ve reference yapar. Daha sonra fark eder ki
        hiclik ekleniyor vs ama yeni bir obje ve refrence create ettikren sonra fark eder.
        bu 3 objenin birincisi iki obje icin ortak kullanildi, diger ikisi farkli iki obje oldu.
         */
    }
}
