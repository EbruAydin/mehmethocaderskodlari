package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C06_PassByValueDers4 {
    public static void main(String[] args) {

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));// [1, 2, 3]
        arrDegistir(arr);
        System.out.println(" method call sonrasi yazdirirsak"+ Arrays.toString(arr));// elemanlar degismis olur. //[5, 6, 3]
    }

    private static void arrDegistir(int[] arr) {

        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));//[5, 6, 3]

        /*
        burada array'in kendisini degistirmiyoruz
        array'in icerisindeki degerleri degistirmis olduk.
        reference ve objede bir degisim olmadi
        bu durumda PassByValue acisindan bir sorun yok. 
         */
    }
}
