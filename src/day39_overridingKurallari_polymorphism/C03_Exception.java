package day39_overridingKurallari_polymorphism;

import java.util.Scanner;

public class C03_Exception {

    public static void main(String[] args) {
        //kullanicidan iki sayi alip
        //bolerek sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);

        int kontrol=0;

        while(kontrol !=2){
            System.out.println("Bolmek istediginiz sayiyi yaziniz");
            int sayi1=scan.nextInt();

            System.out.println("Kaca bolmek istediginiz sayiyi yaziniz");
            int sayi2=scan.nextInt();
            //System.out.println(("sonuc =" + sayi1 / sayi2));//burasi sorunlu kisim oldugu icin burasi trycathc'e alinir

            try {
                System.out.println(("sonuc =" + sayi1 / sayi2));
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("girdiginiz sayilarda sorun var");
            }


            System.out.println("devam etmek icin 1 \nbitirmak icin 2'ye basiniz");
            kontrol=scan.nextInt();
        }


       // System.out.println("sonuc =" + sayi1/sayi2);
        /*
        sayi2 0 oldugunda sayi1/0 tanimsiz olacagindan java bu durumla karsilasinca execption verir.
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day39_overridingKurallari_polymorphism.C03_Exception.main(C03_Exception.java:18)
	javanin yazdigi mesajda exception'in ne tur bir sorun oldugu, neden kaynaklandigi ve hanigi
	satirda olustugu yazar. by zero, arithmeticExecption ifadeleri

	bunu cozmek icin sayi2'yi if ile kontrol edebiliriz.
	ama her zaman bu kullanilmaz. bunu icin C04_Exception classina bak. devami orada

         */


       /* if(sayi2==0){
            System.out.println("Sayi/0 tanimsizdir");
        } else {
            System.out.println(("sonuc =" + sayi1 / sayi2));
        }

        */
        //while sonra eklendi

    }
}
