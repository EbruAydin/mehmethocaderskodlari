package day29_staticBlock_passByValue;

public class C04 {

    public static void main(String[] args) {

        for (int i = 0; i <3 ; i++) {
            C05.eksiltme();
        }

        System.out.println(C03.sayi);
    }
}
/*
i 10dan kucuktu
bir de C03.artirma() metodu vardi, C05.eksitlme() yerine
bunu okurken java C03'e gidecek orada sayi 6,
geri gelecek ve i, 1 artinca geri C03'e gidecek 7
yapacak, bu i artimlari bitene kadar bunu yapacak. yani git
gel yapacak. for loop bitince son deger olarak 15 yazilmis olacak.

iki class calismis olur.
 */

/*
OUTPUT
sayinin suandaki degeri 6
sayinin suandaki degeri 7
sayinin suandaki degeri 8
sayinin suandaki degeri 9
sayinin suandaki degeri 10
sayinin suandaki degeri 11
sayinin suandaki degeri 12
sayinin suandaki degeri 13
sayinin suandaki degeri 14
sayinin suandaki degeri 15//buraya kadar digerinden yazdirir.
15//buradakini yazdirir.
 */
