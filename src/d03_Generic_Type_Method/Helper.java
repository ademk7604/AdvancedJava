package d03_Generic_Type_Method;

import java.util.List;

public class Helper {

	public static String oldgetType(Object o) {
		return o.getClass().getName();
	}

	// Generic Type Method
	public static <T> String getType(T value) {
		String[] kelimeler = value.getClass().getName().split("\\.");
		String sinifIsmi = kelimeler[kelimeler.length - 1];

		return sinifIsmi;
	}

	public static <T> void butunDegerleriEkle(List<T> liste, T[] array) {
		for (T eleman : array) {
			liste.add(eleman);
		}
	}

	public static <T> void listeyiBas(List<T> liste) {
		for (T s : liste) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	// Yukaridaki methoddan <T> yerine ? yeterli oluyor
	public static void listeyiBas2(List<?> liste) {
		for (Object eleman : liste) {
			System.out.print(eleman + " ");
		}
		System.out.println();
	}

}
