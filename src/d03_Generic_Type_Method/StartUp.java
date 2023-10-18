package d03_Generic_Type_Method;

import java.util.ArrayList;
import java.util.List;

public class StartUp {
	public static void main(String[] args) {

		int sayi1 = 5;
		String isim = "Adem Kok";
		System.out.println(Helper.oldgetType(sayi1));
		System.out.println(Helper.oldgetType(isim));

		System.out.println(Helper.getType(sayi1));
		System.out.println(Helper.getType(isim));

		Integer[] sayilar1 = { 5, 4, 8, 45, 55, 95, -5, 0 };

		List<Integer> sayilar2 = new ArrayList<>();
		

		/*
		 * for(Integer sayi: sayilar1) { sayilar2.add(sayi); }
		 */
		Helper.butunDegerleriEkle(sayilar2, sayilar1);
		
		for (int i = 0; i < sayilar2.size(); i++) {
			System.out.print(sayilar2.get(i)+" ");
		}
		System.out.println();
		for(Integer s: sayilar2) {
			System.out.print(s+" ");
		}
		System.out.println();
		//Method ile yapalim
		
		
		List<String> isimler = new ArrayList<>() {
			{
			add("Fatih");
			add("Kaan");
			add("Adem");
			}
		};
		
		Helper.listeyiBas(sayilar2);
		Helper.listeyiBas(isimler);
		
		
		Helper.listeyiBas2(sayilar2);
		Helper.listeyiBas2(isimler);
	}

}
