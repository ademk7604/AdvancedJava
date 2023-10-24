package d15_Threads;


class Gorev extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("-Gorev Sinifi Thread-");
		for(int i=1; i<=20; i++) {
			System.out.println("-Gorev sinifi -"+"Numara: " +i);
		}
		System.out.println("Mevcut thread bilgisi: "+Thread.currentThread().getName());
		System.out.println("Gorev - Aktif thread sayisi: "+Thread.activeCount());
	}
}
public class Driver {
	/*
	 *Thread
	 *1. thread ler process'lerin hafif halidir.
	 *2.Bir programin en kucuk bagimsiz birimidir.
	 *3.Ayri bir yurutme yolu vardir.
	 *4.Her java programi en az 1 threa icerir
	 * 5.java.lang.Tread sinifindan bir thread olustuurlur
	 * ve kontrol edilir.
	 */
	/*
	 * Thread Lifecycle 
	 * new->runnable<->running->terminated
	 * running -> waitin->runnable yapilabiliyor
	 * 
	 * 
	 */
	
	//mein metot main tread'i temsil ediyor
	public static void main(String[] args) {
		System.out.println("Aktif thread sayisi: "+Thread.activeCount());
		//int sayi = 5/0;
		//System.out.println(sayi);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		//JOB 1
		System.out.println("rogram basladi");
		
		
		
		//JOB 2
		Gorev gorev = new Gorev();
		System.out.println("Aktif thread sayisi: "+Thread.activeCount());
		gorev.start(); // otoratikmen run methodu calisiyor
		System.out.println("Aktif thread sayisi: "+Thread.activeCount());
		System.out.println("Mevcut thread bilgisi: "+Thread.currentThread().getName());
		
		
		System.out.println("Program bitti!");
		System.out.println("Main - Aktif thread sayisi: "+Thread.activeCount());
		
	}

}
