package d06_Generic_MultipleType;

public class Insan<T,U> {
	private String isim;
	private T boy;
	private U kilo;
	
	public Insan(String isim, T boy, U kilo) {
		//super(); herhangi bir class tan miras almadigimiz iacin super i kaldiriyoruz
		this.isim = isim;
		this.boy = boy;
		this.kilo = kilo;
	}
	
	public void bilgiVer() {
		System.out.println("Deger: "+isim+" Tip: "+isim.getClass().getName());
		System.out.println("Deger: "+boy+" Tip: "+boy.getClass().getName());
		System.out.println("Deger: "+kilo+" Tip: "+kilo.getClass().getName());
	}
	
	
	

}
