package d17_InterThread;

public class Source {
	private int consumerNo;
	private boolean isProcuder = true;
	
	//Consumer
	public synchronized int getConsumerNo() {
		
		while(isProcuder) {
			try {
				// Consumer i beklet
				wait(); //Consumer tuketim yapmadan Producer uretmesin
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		isProcuder =true;
		//consumer in uyandirilmasini notify ile yapalim
		notify();
		return consumerNo;
	}

	//Producer
	public synchronized void setConsumerNo(int consumerNo) {
		
		while(!isProcuder) {
			try {
				// producer i bekletecek
				wait(); //Producer uretim yapmadan Consumer tuketmeyecek.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(consumerNo+" degeri uretildi!");
		this.consumerNo = consumerNo;
		isProcuder =false; //ureitmi yaptim false yapiyorum
		//Producer uyandiriliyor
		//uyandirma-bildirme islemi
		notify();
	}
	
	

}
