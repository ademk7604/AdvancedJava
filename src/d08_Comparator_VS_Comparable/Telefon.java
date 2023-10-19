package d08_Comparator_VS_Comparable;

import java.util.List;

public class Telefon implements Comparable<Telefon>{
	/*
	 * Karsilastirici ve karsilastirilabilir olma durumunu isleyecegiz
	 * interface kullanmadan ve kullanarak nasil karsilastirma yapacagimizi gorecegiz
	 * ikisinin de aslinda yni silemi yapiyoruz sadece yontem acisindan farklilik var
	 */
	private String marka;
	private String model;
	private int ram;
	private int hafiza;
	private int cikisYili;
	
	
	public Telefon(String marka, String model, int ram, int hafiza, int cikisYili) {
		super();
		this.marka = marka;
		this.model = model;
		this.ram = ram;
		this.hafiza = hafiza;
		this.cikisYili = cikisYili;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHafiza() {
		return hafiza;
	}
	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}
	public int getCikisYili() {
		return cikisYili;
	}
	public void setCikisYili(int cikisYili) {
		this.cikisYili = cikisYili;
	}
	@Override
	public String toString() {
		String bilgi = "Marka: "+marka+", Model: "+model+", Ram: "+ram+", Hafiza: "+hafiza+", Cikis Yili: "+cikisYili;
		return bilgi;
	}
	@Override
	public int compareTo(Telefon o) {
		if(cikisYili > o.cikisYili) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public static void butunTelefonlariYazdir(List<Telefon> teloList) {
		for(Telefon telefon: teloList) {
			System.out.println(telefon);
		}
	}
	
	
	
	

}
