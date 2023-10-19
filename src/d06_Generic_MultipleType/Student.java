package d06_Generic_MultipleType;

public class Student<T, U, V> {
	private T okulNo;
	private U isim;
	private V girisYili;

	public Student(T okulNo, U isim, V girisYili) {
		this.okulNo = okulNo;
		this.isim = isim;
		this.girisYili = girisYili;
		
	}
	public void bilgiVer() {
		System.out.println("Deger: "+okulNo+" Tip: "+okulNo.getClass().getName());
		System.out.println("Deger: "+isim+" Tip: "+isim.getClass().getName());
		System.out.println("Deger: "+girisYili+" Tip: "+girisYili.getClass().getName());
		
	}
	

}
