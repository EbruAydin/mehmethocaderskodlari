package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoopDers {
    public static void main(String[] args) {

        //10 elementli bir list olusturalim
        int arr[]={2,5,4,6,4,9,7,1,3,10};
        // bizden list olustur diyor. bunu 10 defa add methodu kullanarak da yapabiliriz
        // ama alttakini dikkate almak daha kolay olur.

        List<Integer> sayilar=new ArrayList<>();

        for (int each: arr
             ) {
            sayilar.add(each);
        }
        System.out.println(sayilar);
        // 10 defa add yazmak yerine bu sekilde tek hamlede ekleme yapmak daha kolay.

        // sayilar listesinde 3'e bolunemeyen sayilari for-each loop ile yazdiralim
        for (int each: sayilar
             ) {
            if (each%3!=0){
                System.out.print(each); // sout'u icerde yaziyoruz. aksi durumda okumuyor icini. denendi!!!
            }
        }
        // tersten yazdiramayiz array'i bu method ile!!!

    }
}
