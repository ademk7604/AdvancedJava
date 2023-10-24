package d16_MultiThreading;

public class Gorev implements Runnable{
	Yazici yaziciRef;
	String dokumanIsmi;
	int kopyaSayisi;
	
	public Gorev(Yazici yaziciRef, int kopyaSayisi, String dokumanIsmi) {
		this.yaziciRef =yaziciRef;
		this.kopyaSayisi = kopyaSayisi;
		this.dokumanIsmi=dokumanIsmi;
		
	}
	
	@Override
	public void run() {
		synchronized (yaziciRef) {
			//ref aldigimiz yaziciyi buradan parametre olarak vermemiz gerekir
			yaziciRef.dokumanYazdir(kopyaSayisi, dokumanIsmi);
		}
		
		
	}

}
