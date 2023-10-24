package d17_InterThread;

public class Producer implements Runnable{
	private Source source;
	
	public Producer(Source source) {
		this.source=source;
		Thread gorev = new Thread(this, "Producer");
		gorev.start();
		
		
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			source.setConsumerNo(i++);

			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
