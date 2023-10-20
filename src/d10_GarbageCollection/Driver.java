package d10_GarbageCollection;

import d01_Generics_Type_Class.StartUp;

class Meyve {
	private String isim;

	public Meyve(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	// finalize(), referansi olmayan objeler silindikten sonra otomatik olarak
	// karsimiza cikiyor.
	// Norrmalde kendisi otomatikmen yapiyor ama manuel bir sekilde boylece bizde
	// System.gc(); bu method calistiginda finalize methodu calsiiyor
	@Override
	public void finalize() throws Throwable {
		System.out.println(isim + " isimli meyve objesi silindi.");
	}
	
}

public class Driver {
	public static void main(String[] args) {
		/*
		 * diyelim Ram dolduysa old space dedigimiz alandan yani en eski objelerden
		 * baslayarak silmeye basliyor
		 * 
		 */
		Meyve m1 = new Meyve("Elma");
		System.out.println(m1.getIsim());
		// 1. Bir objenin adresini null yapilmasi durumunda
		// unreferenced(Meyve) object meydana gelir.
		m1 = null;
		try {
			System.out.println(m1.getIsim());

		} catch (NullPointerException n) {
			System.out.println(n.getMessage());
		}
		// 2. m2 m3 objesine esitlendiginde
		// em2 objesinin onceki referans gosterdigi alanin
		// adresi gosterilmiyor. Onceki m2 yerinin adresi bilinmez hale geliyor.
		Meyve m2 = new Meyve("Armut"); // unreferenced object
		Meyve m3 = new Meyve("Kiraz");
		m2 = m3;
		System.out.println(m2.getIsim());
		System.out.println(m3.getIsim());

		// 3. Anonim obje olusturursak adresi bilinmez
		// Olusturulan objenin heoa teki adresi elimizde yok
		// unreferenced object
		System.out.println(new Meyve("Karpuz").getIsim()); // adresi bilinmiyor anonim

		// Gereksiz yer kaplayan alanlar ortadan kaldirilmali

		Meyve m4 = new Meyve("Kavun");
		m3 = m4;
		m2 = m4;
		
		m4 = null;
		m3 = null;
		m2= null;
		System.gc(); // bu sekilde Garbace c. calistiriliyor
	}

}
