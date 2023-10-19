package d08_Comparator_VS_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Telefon> telefons = new ArrayList<Telefon>() {
			{
				add(new Telefon("Iphone", "13", 16, 256, 2021));
				add(new Telefon("Samsung", "note5", 4, 32, 2013));
				add(new Telefon("Xiamo", "Redmi Note 11", 4, 128, 2022));
				add(new Telefon("Huawei", "Nova Y90", 6, 128, 2020));
			}
		};
		Telefon.butunTelefonlariYazdir(telefons);
		System.out.println("----compareTo ile sort edelim-----");
		Collections.sort(telefons);
		Telefon.butunTelefonlariYazdir(telefons);
		System.out.println("---------Siralamayi tersine cevirelim-------");
		Collections.reverse(telefons);
		Telefon.butunTelefonlariYazdir(telefons);
		System.out.println("---Comparator methodu ile hafizaya gore siralanisi---");
		Comparator<Telefon> dahaKucukHafiza = new Comparator<Telefon>() {
			@Override
			public int compare(Telefon o1, Telefon o2) {
				if(o1.getHafiza()>o2.getHafiza()) {
					return 1;
				} else {
					return -1;
				}
				
			}
		};
		Collections.sort(telefons, dahaKucukHafiza);
		Telefon.butunTelefonlariYazdir(telefons);
		System.out.println("---var olan listemizin tersini alalim hafizayi tersine---");
		Collections.reverse(telefons);
		Telefon.butunTelefonlariYazdir(telefons);
		
		System.out.println("-----------");
		System.out.println("Ram' e gore kucukten buyuge siralanisi:");
		Collections.sort(telefons, (tel1,tel2)->{if(((Telefon)tel1).getRam() > tel2.getRam()) return 1; else return -1;});
		Telefon.butunTelefonlariYazdir(telefons);
		System.out.println("--------------");
		Collections.reverse(telefons);
		Telefon.butunTelefonlariYazdir(telefons);
	}
}
