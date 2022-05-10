package day32_varargs_stringBuilder;

public class C01_VarargsDers1 {
    public static void main(String[] args) {

        // kac tane String verilirse verilsin, iclerinden en uzun olani yazdiran bir method olusturun

        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";

        //Yazilan argument sayisi sabitse her zamanki gibi bir method olusturabiliriz.
        //ancak argument sayisinin degisme ihtimali varsa o zaman varargs tercoh edilir.

        enUzunKelime(str1,str2,str3);

    }

    private static void enUzunKelime(String... str) {

        String enUzunStr="";// elimde bir baslangic noktasi olusturuyorum. boylece en basindan elimizdeki
        // strlari kiyaslayip kaos olacagina, bir temel olusturup onun baz alarak kiyaslamayi yaparsak daha
        // kolay olacaktir.

        for (String w:str) {
            if(w.length()>enUzunStr.length()){
                enUzunStr=w;
            }
            
        }
       System.out.println("En Uzun Kelime : " +enUzunStr);
    }
}
