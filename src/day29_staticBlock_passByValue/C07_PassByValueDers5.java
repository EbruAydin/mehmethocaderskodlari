package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C07_PassByValueDers5 {

    public static void main(String[] args) {

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));//[1, 2, 3]
        arrDegistir(arr);
        System.out.println("method call sonrasi : " + Arrays.toString(arr));//[1, 2, 3]
    }

    private static void arrDegistir(int[] arr) {

        arr=new int[5];//[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]
        /*
        3 elemanli bir array'e 5 elamanli olani yerlestiremeyzi.
        burada tamamen yeni bir obje olusmus oldu.

        java baska method icerisinde yeni bir obje olusturulunca main methoda
        dahil etmez, onu local scope icerine birakir.
        bu nedenle de method call sonrasinda yukarida orjinal degerini yazdirmis olur.
         */

    }
}
