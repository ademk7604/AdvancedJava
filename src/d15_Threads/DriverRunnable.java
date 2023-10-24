package d15_Threads;

class UstGorev {

}

class Gorev2 extends UstGorev implements Runnable {
	// 2. yol olarak bu sekilde de bize miras alarak run methodunu kullanamyi
	// sagliyor
	@Override
	public void run() {
		//Thread.currentThread().setName("-Gorev Sinifi Thread-");
		for (int i = 1; i <= 20; i++) {
			System.out.println("-"+ Thread.currentThread().getName() + "Numara: " + i);
		}
		System.out.println("Mevcut thread bilgisi: " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()
				+ " isimli"+" thread in calisma anindaki aktif thread sayisi: "+ Thread.activeCount());
	}
}

class DigerGorev extends UstGorev implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()
				+ " isimli"+" thread in calisma anindaki aktif thread sayisi: "+ Thread.activeCount());
		for (int i = 1; i <= 30; i++) {
			System.out.println("DigerGorev - Sinifi: " + i);

		}

	}

public class DriverRunnable {
	
	//mein metot main tread'i temsil ediyor
	public static void main(String[] args) {
		System.out.println("Aktif thread sayisi: "+Thread.activeCount());
		
		
		//JOB 1
		System.out.println("rogram basladi");
		Thread.currentThread().setName("-main thread -");
		System.out.println("Mein thread priority: "+Thread.currentThread().getPriority());
		
		
		
		//JOB 2
		/* SIMDI ARTIK bu sekilde calistiramayiz. Bir thread in icine aktarmamiz lazim
		Gorev gorev = new Gorev();
		System.out.println("Aktif thread sayisi: "+Thread.activeCount());
		gorev.start(); // otoratikmen run methodu calisiyor
		*/
		Runnable g1 = new Gorev2();
		Thread gorev1 = new Thread(g1, " -Gorev Sinifi Thread 1 -");
		gorev1.setPriority(1);
		gorev1.start();
		// 
		System.out.println("Aktif thread sayisi: "+Thread.activeCount());
		System.out.println("Mevcut thread bilgisi: "+Thread.currentThread().getName());
		
		
		//JOB3
		Runnable g2 = new DigerGorev();
		Thread gorev2 = new Thread(g2, " - Diger Gorev Thread 1 -"); // bu sekilde thread ismini verebiliyoruz
		gorev2.setPriority(6);
		gorev2.start();
		// JOB4
		new Thread(new DigerGorev(), "Diger Gorev Thread 2 -").start();
		
		if(gorev1.isAlive()) {
			System.out.println(gorev1.getName()+" yasiyormu!!!");
		} else {
			System.out.println(gorev1.getName()+" oldu!!!");
		}
		if(gorev2.isAlive()) {
			System.out.println(gorev2.getName()+" yasiyormu!!!");
		} else {
			System.out.println(gorev2.getName()+" oldu!!!");
		}
		
		System.out.println("Program bitti!");
		System.out.println("Main - Aktif thread sayisi: "+Thread.activeCount());
		
	}

}
}