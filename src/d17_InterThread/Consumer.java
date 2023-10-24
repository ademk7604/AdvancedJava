package d17_InterThread;

public class Consumer implements Runnable{
	private Source source;
	
	public Consumer(Source source) {
		this.source=source;
		Thread gorev = new Thread(this, "Consumer");
		gorev.start();
	}

	@Override
	public void run() {
		int i =0;
		while(true) {
			System.out.println(source.getConsumerNo()+ " deger tuketildi!");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
