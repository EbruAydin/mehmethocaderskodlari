package day26_forEachLoop_constructor;

public class C01_ForEachLoopDers {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        //elementleri forloop ile yazdiralim

        for(int i=0; i<arr.length; i++ ){
            System.out.println(arr[i]+ " ");
        }
        System.out.print(" "); // alt satira gecmek icin.

        //foreach loop ile yapacak olursak
        // foreach loop'u calistirmak icin hedef bir collection vermeliyiz

        for (int each : arr  // arr array'ine git her bir integer'i getir. genelde indexine gore getirir ama
                               // biz bunu dikkate alip calisma yapmayiz. ForLoop yerine bunu kullanabilirizz.
             ) {
            System.out.print(each + " ");

            // avantaji: index, baslangic biti degeri gibi detaylarla ugrasmamiza gerek kalmadan collections'dan
            //tum elemanlari getirir.
            // dezavantaji: index'e bagli bir islem yapamayiz.

        }
    }
}
