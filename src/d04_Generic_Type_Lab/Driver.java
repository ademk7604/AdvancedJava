package d04_Generic_Type_Lab;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void listeBas(List<? extends Animal> liste) {
		//? sadece Animal sinifini miras alan siniflari parametre al diyebiliyoruz
		for (Animal animal : liste) {
			System.out.println(animal);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Cat> cats = new ArrayList<>() {
			{
				add(new Cat("Boncuk"));
				add(new Cat("sevgi"));
				add(new Cat("Minik"));
			}
		};
		ArrayList<Dog> dogs = new ArrayList<>() {
			{
				add(new Dog("Lesi"));
				add(new Dog("Mesi"));
			}
		};
		
		System.out.println(cats.get(0));
		System.out.println(cats.get(1));
		System.out.println(cats.get(2));
		System.out.println(dogs.get(0));
		System.out.println(dogs.get(1));
		System.out.println("-----------");
		Driver.listeBas(dogs);
		Driver.listeBas(cats);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		
		//Driver.listeBas(arrayList); integer eztends etmedigi icin CTE aliriz

	}

}
