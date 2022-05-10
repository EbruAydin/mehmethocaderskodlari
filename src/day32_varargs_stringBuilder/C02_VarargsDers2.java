package day32_varargs_stringBuilder;

public class C02_VarargsDers2 {
    public static void main(String[] args) {

        // parametre olarak bi integer
        //ve istedigimiz kadar String alan
        //en uzun kelimenin harf sayisi ile
        // int'in degerini carpip, sonucu yazidran bir method olusturun

        int sayi=5;
        String str1="Zulal";
        String str2="Zeyneb";


        carpim(sayi, str1, str2); // burada sayiyi str1'den sonra yazsak kirmizi oluyor. 1. argument ile sonrasinda
        // gelen arasinda bir uyum olmali. ornegin birincisi String olursa/birinci argument ikincisi integer
        // olunca java hata verir. sayi varaibel'ini en sona yazinca da olmuyor. asagida String...str, int sayi yazsak
        // da kabul etmez. bu durumda
        // bir methodda varargs disinda parametre kullanacaksak once diger parametreleri yazip, varargs;i en sona
        // yazmaliyiz. bu durumda bir method icerisinde birden fazla Varargs olamaz.

// burada String sayisi degismebilir. str3 sekilinde ekleme yapsak yukarida, method calismaya devam edecektir.
// ama str3 olustuturnca carpim methodu icerisinde parametre olarak eklemek gerekir.
    }

    private static void carpim(int sayi, String... str) {

        String enUzunStr="";
        for (String w:str
        ) {
            if(w.length()>enUzunStr.length()){
                enUzunStr=w;
            }

        }
        System.out.println("Istenen deger " + sayi*enUzunStr.length());//30
    }
}
