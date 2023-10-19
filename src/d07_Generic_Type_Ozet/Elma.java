package d07_Generic_Type_Ozet;

public class Elma<T,U,V,Y,Z> {
	
	
	//static anahtar kelimesi sayesinde static <T,U,V> clasin parrametresinden almiyor.
	// public static <T,U,V> void bilgiVer(T a, U b, V c) burdaki T U V sinifa ait degil
	public static <T,U,V> void bilgiVer(T a, U b, V c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}
	/*
	 * public static <A,B,c> void bilgiVer(A a, B b, C c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	} bu sekilde de bir hata almiyor
	 */
	/*
	 * public void bilgiVer(T a, U b, V c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	} bu skeilde bilgiVer methodun altini kirmizi cizer default Constructor da T U V nenin type belirlenmis
	  o yuzden degerleride o parametreye gore gondermek lazim
	  (new Elma<String, String, Integer, Float, Long>()).bilgiVer("", "", 1); bu skeilde vermemiz lazim hata verir
	 */
	
}
