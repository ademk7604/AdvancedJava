package d16_MultiThreading;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		Yazici yazici =new Yazici();
		
		/*
		yazici.dokumanYazdir(5, "Vize1_Sinavi.pdf");
		yazici.dokumanYazdir(5, "Vize2_Sinavi.pdf");
		*/
		
		Runnable r1 = new Gorev(yazici, 5, "Vize1_Sinavi.pdf");
		Runnable r2 = new Gorev(yazici, 5, "Vize2_Sinavi.pdf");
		Runnable r3 = new Gorev(yazici, 5, "Final_Sinavi.pdf");
		Thread gorev1 = new Thread(r1);
		Thread gorev2 = new Thread(r2);
		Thread gorev3 = new Thread(r3);
		gorev1.start();
		
		//gorev1 threadi tmamlanan kadar bekle
		gorev1.join(); // join methodu InterruptedException istiyor
		
		gorev2.start();
		
		//gorev2 thread i tmamlanan kadar bekle
		gorev2.join();
		
		gorev3.start();
		//Thread lerin nasil one cekilecegini gorelim. Yani sirlamasini nasil belirleyecegiz
		//siralamayi join ile belirleyebiliyoruz
	}

}
