package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C01_ForeachLoop {

	public static void main(String[] args) {
		// iki String array olusturunuz 
		// ve bu array�lerdeki ortak elemanlari For-each loop kullanarak bulunuz. 
		// Sonucu ekrana yazdiriniz.
		// Ortak eleman yoksa ekrana �Ortak eleman yok� yazdiriniz

		// Derste bu sekilde yapti onu kullandim!
		
		String array1[]= {"Ali","Ayse","Can", "Fatma"};
		String array2[]= {"Can","Evren","Emsal", "Fatma", "Emre", "Ali"};

		List<String> ortakElemanlar=new ArrayList<>();

		for (String each1:array1
			 ) {
			for (String each2:array2
				 ) {
				if (each1.equals(each2)){
					ortakElemanlar.add(each1);
				}
			}
		}

		// ortak eleman yoksa da belirlemek istiyoruz. bunu da if ile yapariz

		if(ortakElemanlar.isEmpty()){
			System.out.println("Ortak eleman yok");
		} else {
			System.out.println("Iki arraydeki ortak elemanlar :" + ortakElemanlar);
		}


	}

}
